package extension;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import teams.AdviceExecutionModel;
import teams.Argument;
import teams.JoinPointShadow;

public class BeforeAdviceExecutionModel implements AdviceExecutionModel {
	private Vector<Argument> args = new Vector<Argument>();
	private String name;

	@Override
	public Vector<String> adviceInterprete() {
		// TODO Auto-generated method stub
		final Vector<String> temp = new Vector<String>();
		temp.add(getName());
		return temp;
	}

	@Override
	public void embed(final ClassNode classNode,
			final Set<JoinPointShadow> shadows, final String PCEName,
			final String aspectName, final int pc) {
		// TODO Auto-generated method stub
		final List<MethodNode> methods = classNode.methods;
		Iterator<JoinPointShadow> itr;
		int offset = 0;
		JoinPointShadow currentShadow = new JoinPointShadow();
      System.err.println("JEC: In before embedding");
		for (int j = 0; j < methods.size(); j++) {
			// To restart from the beginning of shadows for the next method
			offset = 0;
			itr = shadows.iterator();
			// System.out.println(shadows.size());
			while (itr.hasNext()) {
				final MethodNode methodNode = methods.get(j);
				currentShadow = itr.next();
				// if (methodNode.name.contains("get"))
				// System.out.println("Hi  " + methodNode.name);
				if (methodNode.equals(currentShadow.methodNode)) {
					// System.out.println("Execution");
					final AbstractInsnNode insn = methodNode.instructions
							.get(currentShadow.getInstructionStartNumber()
									+ offset);
					// Embed the advice in the case no data is required
					if (currentShadow.getDataInsnList().size() < 1) {
						final AbstractInsnNode newIns = new MethodInsnNode(
								Opcodes.INVOKESTATIC, "Advice/" + aspectName,
								"before_" + PCEName, "()V");
						methodNode.instructions.insertBefore(insn, newIns);
					}

					// Embed the advice in the case that data is required
					else {

						String embedParameter = "";
						// System.out.println(currentShadow.getDataInsnList().size());
						for (int i = 0; i < currentShadow.getDataInsnList()
								.size(); i++) {
							embedParameter += "Ljava/lang/String;";
						}
						// System.out.println(embedParameter);
						final AbstractInsnNode newIns = new MethodInsnNode(
								Opcodes.INVOKESTATIC, "Advice/" + aspectName,
								"before_" + PCEName, "(" + embedParameter
										+ ")V");
						methodNode.instructions.insertBefore(insn, newIns);
						if (currentShadow.getDataInsnList().size() > 0) {
							methodNode.instructions.insertBefore(newIns,
									currentShadow.getDataInsnList());
						}
						// reset the start point and end point of shadows in the
						// method
						/*
						 * currentShadow.setInstructionStartNumber(currentShadow
						 * .getInstructionStartNumber() +
						 * currentShadow.getDataInsnList().size() + 1 ); final
						 * Vector<Integer> instructionEndNumber = new
						 * Vector<Integer>(); for (int i = 0; i < currentShadow
						 * .getInstructionEndNumber().size(); i++) {
						 * instructionEndNumber.add((Integer) currentShadow
						 * .getInstructionEndNumber().get(i) + 1 +
						 * currentShadow.getDataInsnList().size()); }
						 * currentShadow
						 * .setInstructionEndNumber(instructionEndNumber);
						 */
					}
					offset += (1 + currentShadow.getDataInsnList().size());
				}
			}
		}
	}

	/**
	 * @return the args
	 */
	public Vector<Argument> getArgs() {
		return args;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param args
	 *            the args to set
	 */
	public void setArgs(final Vector<Argument> args) {
		this.args = args;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
}
