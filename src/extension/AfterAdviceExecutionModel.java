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
import teams.JoinPointShadow;

public class AfterAdviceExecutionModel implements AdviceExecutionModel {
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
		Iterator<JoinPointShadow> itr;// = shadows.iterator();
		JoinPointShadow currentShadow = new JoinPointShadow();
      System.err.println("JEC: In after embedding");
		for (int j = 0; j < methods.size(); j++) {
			// To restart from the beginning of shadows for the next method
			itr = shadows.iterator();
			while (itr.hasNext()) {
				final MethodNode methodNode = methods.get(j);
				currentShadow = itr.next();
				if (methodNode.equals(currentShadow.methodNode.name)) {
					AbstractInsnNode insn;
					/*
					 * final TeamsDataGeneratorFactory generatorFactory = new
					 * DataGeneratorFactory(); final DataGenerator generator =
					 * generatorFactory
					 * .createGenerator(currentShadow.getType()); final InsnList
					 * newDataInstructions = new InsnList();
					 * newDataInstructions.
					 * add(generator.Generate(currentShadow));
					 */
					String embedParameter = "";
					for (int i = 0; i < currentShadow.getDataInsnList().size(); i++) {
						embedParameter += "Ljava/lang/String;";
					}
					for (int k = 0; k < currentShadow.getInstructionEndNumber()
							.size(); k++) {
						insn = methodNode.instructions
								.get((Integer) currentShadow
										.getInstructionEndNumber().get(k));
						final AbstractInsnNode newIns = new MethodInsnNode(
								Opcodes.INVOKESTATIC, "Advice/" + aspectName,
								"after_" + PCEName, "(" + embedParameter + ")V");
						methodNode.instructions.insert(insn, newIns);
						methodNode.instructions.insert(insn,
								currentShadow.getDataInsnList());
						currentShadow.getInstructionEndNumber().set(
								k,
								((Integer) currentShadow
										.getInstructionEndNumber().get(k)
										+ currentShadow.getDataInsnList()
												.size() + 1));
					}

				}
			}
		}
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(final String name) {
		this.name = name;
	}
}
