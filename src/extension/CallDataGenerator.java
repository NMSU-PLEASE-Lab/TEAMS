package extension;

import java.util.Vector;

import org.objectweb.asm.tree.InsnList;

import teams.DataGenerator;
import teams.JoinPointInfoExp;
import teams.JoinPointShadow;

public class CallDataGenerator implements DataGenerator {

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
