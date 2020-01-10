package extension;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LabelNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

import teams.Argument;
import teams.GeneralJoinPointInfo;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;
import teams.PCDShadowMatcher;

/**
 * @author Gholamali Rahnavard
 * 
 */
public class BasicBlockShadowMatcher implements PCDShadowMatcher {
	private String basicBlockID;

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
						.equalsIgnoreCase("Id")) {
					dataInsnList.add(new LdcInsnNode(basicBlockID));
					continue;
				}
			}
		}
		joinPointShadow.setDataInsnList(dataInsnList);
	}

	// static int i = 0;
	@Override
	public Set<JoinPointShadow> match(final MethodNode methodNode,
			final Argument argument,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector, final int pc) {
		final Set<JoinPointShadow> temp = new HashSet<JoinPointShadow>();
		JoinPointShadow currentShadow = new JoinPointShadow();
		currentShadow.setType("basicblock");
		Vector<Integer> ends = new Vector<Integer>();
		// The first instruction of each method is strat of a basicblock
		/*
		 * shadow.setInstructionStartNumber(0); ends.add(0);
		 * shadow.setInstructionEndNumber(ends);
		 * shadow.setMethodName(methodNode.name); temp.add(shadow);
		 */
		final Iterator<AbstractInsnNode> insnNodes = methodNode.instructions
				.iterator();
		final InsnList insList = methodNode.instructions;
		// insnNodes=methodNode.instructions.iterator();
		while (insnNodes.hasNext()) {
			final AbstractInsnNode insn = insnNodes.next();
			/*
			 * if(insn.getOpcode() == Opcodes.ARETURN || insn.getOpcode()
			 * ==Opcodes.DCMPG || insn.getOpcode() ==Opcodes.DCMPG
			 * ||insn.getOpcode() ==Opcodes.DCMPG || insn.getOpcode()
			 * ==Opcodes.DCMPL ||insn.getOpcode() ==Opcodes.DRETURN ||
			 * insn.getOpcode() ==Opcodes.FCMPL ||insn.getOpcode()
			 * ==Opcodes.FCMPG || insn.getOpcode() ==Opcodes.FRETURN
			 * ||insn.getOpcode() ==Opcodes.DCMPG || insn.getOpcode()
			 * ==Opcodes.GOTO ||insn.getOpcode() ==Opcodes.GOTO ||
			 * insn.getOpcode() ==Opcodes.IF_ACMPEQ ||insn.getOpcode()
			 * ==Opcodes.IF_ACMPNE || insn.getOpcode() ==Opcodes.IF_ICMPEQ
			 * ||insn.getOpcode() ==Opcodes.IF_ICMPNE || insn.getOpcode()
			 * ==Opcodes.IF_ICMPLT ||insn.getOpcode() ==Opcodes.IF_ICMPGE ||
			 * insn.getOpcode() ==Opcodes.IF_ICMPGT ||insn.getOpcode()
			 * ==Opcodes.IF_ICMPLE || insn.getOpcode() ==Opcodes.IF_ICMPLT
			 * ||insn.getOpcode() ==Opcodes.IF_ICMPGE || insn.getOpcode()
			 * ==Opcodes.IFEQ ||insn.getOpcode() ==Opcodes.IFNE ||
			 * insn.getOpcode() ==Opcodes.IFLT ||insn.getOpcode() ==Opcodes.IFGE
			 * || insn.getOpcode() ==Opcodes.IFGT ||insn.getOpcode()
			 * ==Opcodes.IFLE || insn.getOpcode() ==Opcodes.IFNONNULL
			 * ||insn.getOpcode() ==Opcodes.IFNULL || insn.getOpcode()
			 * ==Opcodes.JSR ||insn.getOpcode() ==Opcodes.JSR ||
			 * insn.getOpcode() ==Opcodes.IRETURN ||insn.getOpcode()
			 * ==Opcodes.LRETURN || insn.getOpcode() ==Opcodes.RETURN
			 * ||insn.getOpcode() ==Opcodes.RET || insn.getOpcode()
			 * ==Opcodes.TABLESWITCH ||insn.getOpcode() ==Opcodes.LOOKUPSWITCH )
			 */
			if (insn.getType() == AbstractInsnNode.LABEL) {
				final LabelNode labelNode = (LabelNode) insn;
				// System.out.println("Before "+insList.indexOf(insn));
				// System.out.println("BasicBlochShadoMatcher class Name:"+this.getClass().getSimpleName());
				/*
				 * This part should be extended for all Piontcuts of the aspect
				 * Now it cares about the first pioncut
				 */
				/*
				 * Vector <JoinPointInfoInterface> requiredData =
				 * aspect.getPointcut().get
				 * (0).getPC().getRequiredDataList(this.getClass
				 * ().getSimpleName()); for (int j =0; j<requiredData.size();
				 * j++){ if(requiredData.get(j).name.equalsIgnoreCase("time")){
				 * //System.out.println("Hello time!"); AbstractInsnNode newIns=
				 * new MethodInsnNode(Opcodes.INVOKESTATIC, "shadow/BasicBlock",
				 * "ExecutionTime","(J)V");
				 * methodNode.instructions.insert(insn,newIns);
				 * methodNode.instructions.insert(insn,new
				 * LdcInsnNode(System.nanoTime())); } else if
				 * (requiredData.get(j).name.equalsIgnoreCase("blockid")){
				 * //System.out.println("Hello time!"); AbstractInsnNode newIns=
				 * new MethodInsnNode(Opcodes.INVOKESTATIC, "shadow/BasicBlock",
				 * "ExecutionBlockId","(Ljava/lang/String;)V");
				 * methodNode.instructions.insert(insn,newIns);
				 * methodNode.instructions.insert(insn,new
				 * LdcInsnNode(((LabelNode)insn).getLabel().toString())); } }
				 */
				// ******Vector<JoinPointInfoInterface> requiredData =
				// aspect.getPointcut().get(0).getPC().getRequiredDataList(this.getClass().getSimpleName());
				// System.out.println("After "+insList.indexOf(insn));
				currentShadow = new JoinPointShadow();
				currentShadow.setType("basicblock");
				currentShadow.methodNode = methodNode;
				basicBlockID = labelNode.getLabel().toString();
				// *****currentShadow.setJPInfo(requiredData);
				currentShadow.setInstructionStartNumber(insList.indexOf(insn));
				ends = new Vector<Integer>();
				ends.add(insList.indexOf(insn));
				currentShadow.setInstructionEndNumber(ends);
				if (joinPointInfoExpVector.size() > 0) {
					makeArgumentValue(currentShadow, methodNode,
							joinPointInfoExpVector);
				}
				temp.add(currentShadow);
				// i++;
			}
		}
		// System.out.println("number of Labels: "+ i);
		return temp;
	}
}
