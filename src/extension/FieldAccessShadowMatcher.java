package extension;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

import teams.Argument;
import teams.GeneralJoinPointInfo;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;
import teams.PCDShadowMatcher;

public class FieldAccessShadowMatcher implements PCDShadowMatcher {
	private boolean fieldAccessStatus;

	private String fieldName = null;

	/**
	 * @return the fieldName
	 */
	public String getFieldName() {
		return fieldName;
	}

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
						.equalsIgnoreCase("Name")) {
					dataInsnList.add(new LdcInsnNode(getFieldName()));
					continue;
				}
				if (joinPointinfoExpVect.get(i).getName()
						.equalsIgnoreCase("Status")) {
					dataInsnList.add(new LdcInsnNode(fieldAccessStatus));
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
		final Set<JoinPointShadow> shadows = new HashSet<JoinPointShadow>();

		final Iterator<AbstractInsnNode> insnNodes = methodNode.instructions
				.iterator();
		final InsnList insList = methodNode.instructions;
		while (insnNodes.hasNext()) {
			final AbstractInsnNode insn = insnNodes.next();
			if (insn.getType() == AbstractInsnNode.FIELD_INSN) {
				final FieldInsnNode fieldInsnNode = (FieldInsnNode) insn;
				if (fieldInsnNode.getOpcode() != Opcodes.PUTFIELD
						|| fieldInsnNode.getOpcode() == Opcodes.PUTSTATIC) {
					fieldAccessStatus = true;
				}
				if (fieldInsnNode.getOpcode() != Opcodes.GETFIELD
						|| fieldInsnNode.getOpcode() == Opcodes.GETSTATIC) {
					fieldAccessStatus = false;
				}

				// System.out.println("Hi: " + fieldInsnNode.name);
				setFieldName(fieldInsnNode.name);
				final Class aClass = FieldAccessShadowMatcher.class;
				Field field;
				try {
					field = aClass.getDeclaredField("fieldName");
					// System.out.println(field.toString());
					final FieldAccessShadowMatcher objectInstance = new FieldAccessShadowMatcher();
					field.get(objectInstance);
				} catch (final SecurityException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				} catch (final NoSuchFieldException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				} catch (final IllegalArgumentException e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
				} catch (final IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// field.set(objetInstance, value);
				final JoinPointShadow currentShadow = new JoinPointShadow();
				currentShadow.methodNode = methodNode;
				currentShadow.setType("fieldAccess");
				currentShadow.setInstructionStartNumber(insList.indexOf(insn));
				final Vector<Integer> ends = new Vector<Integer>();
				ends.add(insList.indexOf(insn));
				currentShadow.setInstructionEndNumber(ends);
				if (joinPointInfoExpVector.size() > 0) {
					makeArgumentValue(currentShadow, methodNode,
							joinPointInfoExpVector);
				}
				shadows.add(currentShadow);
				// System.out.println("Hi: " + fieldInsnNode.name);
			}
		}
		return shadows;
	}

	/**
	 * @param fieldName
	 *            the fieldName to set
	 */
	public void setFieldName(final String fieldName) {
		this.fieldName = fieldName;
	}
}
