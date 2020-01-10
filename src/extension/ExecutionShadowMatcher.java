package extension;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

import teams.Argument;
import teams.GeneralJoinPointInfo;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;
import teams.PCDShadowMatcher;

public class ExecutionShadowMatcher implements PCDShadowMatcher {
	@Override
	public void makeArgumentValue(final JoinPointShadow joinPointShadow,
			final MethodNode methodNode,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector) {
		final InsnList dataInsnList = new InsnList();

		// Generate a list of instruction nodes for general data that are
		// required for PCD
		final GeneralJoinPointInfo generalJoinPointInfo = new GeneralJoinPointInfo();
		dataInsnList.add(generalJoinPointInfo.generate(methodNode,
				joinPointInfoExpVector));

		// Generate a list of instruction nodes for specific data that are
		// required for PCD
		for (int i = 0; i < joinPointInfoExpVector.size(); i++) {
			if (joinPointInfoExpVector.get(i).getType()
					.equalsIgnoreCase(joinPointShadow.getType())) {
				if (joinPointInfoExpVector.get(i).getName()
						.equalsIgnoreCase("description")) {
					dataInsnList.add(new LdcInsnNode(
							joinPointShadow.methodNode.desc));
					continue;
				}
			}
		}
		/*
		 * final TeamsDataGeneratorFactory generatorFactory = new
		 * DataGeneratorFactory(); final DataGenerator generator =
		 * generatorFactory .createGenerator(joinPointShadow.getType());
		 * dataInsnList.add(generator.Generate(joinPointShadow,
		 * joinPointInfoExpVector));
		 */
		joinPointShadow.setDataInsnList(dataInsnList);
	}

	@Override
	public Set<JoinPointShadow> match(final MethodNode methodNode,
			final Argument argument,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector, final int pc) {

		// Use a set to keep the matching areas as shadow.
		Set<JoinPointShadow> resultShadows = new HashSet<JoinPointShadow>();

		// matching the loop argument with the current method
		if (methodNode.name.startsWith(argument.getExpression())) {

			// Create final the set for final the results
			resultShadows = new HashSet<JoinPointShadow>();

			// Create a shadow
			final JoinPointShadow currentShadow = new JoinPointShadow();

			// Set the shadow type
			currentShadow.setType("execution");

			// Set the shado's method node
			currentShadow.methodNode = methodNode;

			// Find the set the beginning of the shadow based on your definition
			// and AMS analysis
			currentShadow.setInstructionStartNumber(0);

			// find the end of the shadow it can be more than one point
			final Vector<Integer> ends = new Vector<Integer>();

			// Satrt to analyze the method instructions
			final Iterator<AbstractInsnNode> insnNodes = methodNode.instructions
					.iterator();
			while (insnNodes.hasNext()) {
				final AbstractInsnNode insn = insnNodes.next();
				// System.out.println(insn.getOpcode());

				if (insn.getOpcode() == Opcodes.IRETURN
						|| insn.getOpcode() == Opcodes.RETURN
						|| insn.getOpcode() == Opcodes.ARETURN
						|| insn.getOpcode() == Opcodes.LRETURN
						|| insn.getOpcode() == Opcodes.DRETURN) {
					ends.add(methodNode.instructions.indexOf(insn));
				}
			}

			// Set the end of the shadow (Vector of points)
			currentShadow.setInstructionEndNumber(ends);

			// Process and produce the required data for this shadow
			// or the necessary argument to produce the dynamic data in advice
			// execution phase
			if (joinPointInfoExpVector.size() > 0) {
				makeArgumentValue(currentShadow, methodNode,
						joinPointInfoExpVector);
			}

			// Add the shadow to the list of the shadow as result
			resultShadows.add(currentShadow);
		}
		return resultShadows;
	}
}
