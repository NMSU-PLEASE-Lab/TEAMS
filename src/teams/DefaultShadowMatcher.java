package teams;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.MethodNode;

public class DefaultShadowMatcher implements PCDShadowMatcher {

	@Override
	public void makeArgumentValue(final JoinPointShadow joinPointShadow,
			final MethodNode methodNode, final Vector<JoinPointInfoExp> infoExp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<JoinPointShadow> match(final MethodNode methodNode,
			final Argument argument,
			final Vector<JoinPointInfoExp> joinPointInfoExp, final int pc) {
		// TODO Auto-generated method stub
		final Set<JoinPointShadow> result = new HashSet<JoinPointShadow>();
		// System.out.println("Defualt ShadowMatcher");
		return result;
	}

}