package teams;

import java.util.Vector;

import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodNode;

public class GeneralJoinPointInfo {
	public InsnList generate(final MethodNode methodNode,
			final Vector<JoinPointInfoExp> joinPointinfoExpVect) {
		// TODO Auto-generated method stub
		String dataName = "";
		final InsnList dataInsnList = new InsnList();
		for (int i = 0; i < joinPointinfoExpVect.size(); i++) {
			if (joinPointinfoExpVect.get(i).getType()
					.equalsIgnoreCase("general")) {
				dataName = joinPointinfoExpVect.get(i).getName().toLowerCase();
				if (dataName.equals("methodname")) {
					dataInsnList.add(new LdcInsnNode(methodNode.name));
					continue;
				}
				if (dataName.equals("classname")) {
					dataInsnList.add(new LdcInsnNode(methodNode.getClass()
							.getName()));
					continue;
				}
				if (dataName.equals("methodsignature")) {
					dataInsnList.add(new LdcInsnNode(methodNode.signature));
					continue;
				}
			}
		}
		return dataInsnList;
	}

}
