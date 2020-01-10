package extension;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import teams.Argument;
import teams.GeneralJoinPointInfo;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;
import teams.PCDShadowMatcher;

public class CallShadowMatcher implements PCDShadowMatcher {
	private String callee;

	@Override
	public void makeArgumentValue(final JoinPointShadow joinPointShadow,
			final MethodNode methodNode,
			final Vector<JoinPointInfoExp> joinPointinfoExpVect) {
		// TODO Auto-generated method stub
		final InsnList dataInsnList = new InsnList();

		// Generate a list of instruction nodes for general data that are
		// required for PCD
		final GeneralJoinPointInfo generalJoinPointInfo = new GeneralJoinPointInfo();
		dataInsnList.add(generalJoinPointInfo.generate(methodNode,
				joinPointinfoExpVect));

		// Generate a list of instruction nodes for specific data that are
		// required for PCD

		for (int i = 0; i < joinPointinfoExpVect.size(); i++) {
			if (joinPointinfoExpVect.get(i).getType()
					.equalsIgnoreCase(joinPointShadow.getType())) {
				if (joinPointinfoExpVect.get(i).getName()
						.equalsIgnoreCase("callee")) {
					dataInsnList.add(new LdcInsnNode(callee));
					continue;
				}
			}
		}
		joinPointShadow.setDataInsnList(dataInsnList);
	}

	@Override
	public Set<JoinPointShadow> match(final MethodNode methodNode,
			final Argument argument,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector, final int pc) {
		final Set<JoinPointShadow> temp = new HashSet<JoinPointShadow>();

		final Iterator<AbstractInsnNode> insnNodes = methodNode.instructions
				.iterator();
		final InsnList insList = methodNode.instructions;
		// System.out.println("Call:"+ methodNode.name);
		while (insnNodes.hasNext()) {
			final AbstractInsnNode insn = insnNodes.next();
			// System.out.println(insn.getOpcode());
			if ((insn.getOpcode() == 186// Opcodes.INVOKEDYNAMIC
					|| insn.getOpcode() == Opcodes.INVOKESPECIAL
					|| insn.getOpcode() == Opcodes.INVOKESTATIC
					|| insn.getOpcode() == Opcodes.INVOKEVIRTUAL || insn
						.getOpcode() == Opcodes.INVOKEINTERFACE)) {
				// endList.add(new LdcInsnNode(methodNode.name));
				// System.out.println("Call:"+insn.toString());
				if (insn.getType() == AbstractInsnNode.METHOD_INSN) {
					final MethodInsnNode methodInvocationNode = (MethodInsnNode) insn;
					// System.out.println("Call: "+methodInvocationNode.name+" "+argument.getExpression()
					// );
					if (methodInvocationNode.name.startsWith(argument
							.getExpression())) {
						final JoinPointShadow currentShadow = new JoinPointShadow();
						currentShadow.setType("call");
						callee = methodInvocationNode.name;
						// System.out.println("Hi  " + callee);
						currentShadow.setInstructionStartNumber(insList
								.indexOf(insn));
						final Vector<Integer> ends = new Vector<Integer>();
						ends.add(insList.indexOf(insn));
						currentShadow.setInstructionEndNumber(ends);
						if (joinPointInfoExpVector.size() > 0) {
							makeArgumentValue(currentShadow, methodNode,
									joinPointInfoExpVector);
						}
						currentShadow.methodNode = methodNode;
						temp.add(currentShadow);
						// System.out.println("owner:"+
						// methodInvocationNode.owner);
						// /AbstractInsnNode newIns= new
						// MethodInsnNode(Opcodes.INVOKESTATIC,
						// "shadow/"+aspect.getName(),
						// "onCall_"+aspect.getPointCutExpr().elementAt(pc).getName(),
						// "(Ljava/lang/String;)V");

						// /methodNode.instructions.insert(newIns);
						// /methodNode.instructions.insert(new
						// LdcInsnNode(methodNode.name));
						// methodNode.instructions.insert(new
						// LdcInsnNode(myCallMethod));
						// k++;
						// System.out.println("Method  "+k);
						// insnNodes.next();
						// insnNodes.next();
					}
				}
			}

		}
		return temp;
	}

}
