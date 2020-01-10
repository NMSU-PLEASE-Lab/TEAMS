package teams;

import java.util.Vector;

import org.objectweb.asm.tree.InsnList;

public class DefaultDataGenerator implements DataGenerator {

	@Override
	public InsnList Generate(final JoinPointShadow shadow,
			final Vector<JoinPointInfoExp> joinPointInfoExpVector) {
		// TODO Auto-generated method stub
		final InsnList insnList = new InsnList();
		return insnList;

	}

}