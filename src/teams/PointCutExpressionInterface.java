package teams;

import java.util.Set;

import org.objectweb.asm.tree.MethodNode;

public interface PointCutExpressionInterface {
	public Set<JoinPointShadow> interpret(MethodNode methodNode,
			PointcutExpression PCE, int pc);

	public boolean interpret(String className);

	public boolean interpretWithincode(String className);

	// public Vector<JoinPointInfoInterface> getRequiredDataList(String
	// joinPointName);
}
