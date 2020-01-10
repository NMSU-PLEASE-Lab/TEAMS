package teams;

import java.util.Set;

import org.objectweb.asm.tree.MethodNode;

public class NotExpression implements PointCutExpressionInterface {
	PointCutExpressionInterface operand;

	public NotExpression() {
	}

	@Override
	public Set<JoinPointShadow> interpret(final MethodNode testMethod,
			PointcutExpression PCE/*
								 * Map< String , Expression > variables
								 */, int pc) {
		// MethodNode testMethod = new MethodNode() ;
		final Set<JoinPointShadow> temp = operand
				.interpret(testMethod, PCE/* variables */, pc);
		/*
		 * It needs to implement not operation on temp
		 */
		return temp;
	}

	@Override
	public boolean interpret(final String className) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean interpretWithincode(final String className) {
		// TODO Auto-generated method stub
		return false;
	}

	public void setOperand(final PointCutExpressionInterface e) {
		operand = e;
	}

	/*
	 * @Override public Vector<JoinPointInfoInterface>
	 * getRequiredDataList(String joinPontName) { // TODO Auto-generated method
	 * stub return null; }
	 */
}
