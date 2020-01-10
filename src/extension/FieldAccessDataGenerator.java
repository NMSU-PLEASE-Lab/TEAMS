package extension;

import java.util.Vector;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.analysis.Analyzer;
import org.objectweb.asm.tree.analysis.AnalyzerException;
import org.objectweb.asm.tree.analysis.BasicInterpreter;
import org.objectweb.asm.tree.analysis.Frame;
import org.objectweb.asm.tree.analysis.Value;

import teams.DataGenerator;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;

public class FieldAccessDataGenerator implements DataGenerator {
	public static Value getFieldValue(final String owner, final MethodNode mn,
			final JoinPointShadow shadow) throws AnalyzerException {
		final Analyzer a = new Analyzer(new BasicInterpreter());
		a.analyze(owner, mn);
		final Frame[] frames = a.getFrames();
		// final AbstractInsnNode[] insns = mn.instructions.toArray();
		// for (int i = 0; i < insns.length; ++i) {
		final int i = shadow.getInstructionStartNumber();
		final AbstractInsnNode insn = mn.instructions.get(i);
		if (insn.getOpcode() == Opcodes.GETFIELD) {
			// System.out.println(getStackValue(frames[i], 0));
			return getStackValue(frames[i], 0);
		} else if (insn.getOpcode() == Opcodes.PUTFIELD) {
			// System.out.println(getStackValue(frames[i], 1));
			return getStackValue(frames[i], 1);
		}
		return null;
	}

	private static Value getStackValue(final Frame f, final int index) {
		final int top = f.getStackSize() - 1;
		return index <= top ? f.getStack(top - index) : null;
	}

	@Override
	public InsnList Generate(final JoinPointShadow shadow,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector) {
		// TODO Auto-generated method stub
		final InsnList dataInsnList = new InsnList();
		for (int i = 0; i < joinPointInfoExpVector.size(); i++) {
			if (joinPointInfoExpVector.get(i).getType()
					.equalsIgnoreCase(shadow.getType())) {

			}
		}
		return dataInsnList;
	}
}
