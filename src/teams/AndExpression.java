package teams;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.MethodNode;

public class AndExpression implements PointCutExpressionInterface {
	PointCutExpressionInterface leftOperand;
	PointCutExpressionInterface rightOperand;

	public AndExpression() {
	}

	/*@Override
	public Vector<JoinPointInfoInterface> getRequiredDataList(final String joinPointName) {
		// TODO Auto-generated method stub
		final Vector<JoinPointInfoInterface> joinPointInfoInterface = leftOperand
				.getRequiredDataList(joinPointName);
		if (joinPointInfoInterface != null) {
			joinPointInfoInterface.addAll(rightOperand
					.getRequiredDataList(joinPointName));
			return joinPointInfoInterface;
		} else if (rightOperand
				.getRequiredDataList(joinPointName) != null) {
			return rightOperand
					.getRequiredDataList(joinPointName);
		} else {
			return null;
		}
	}*/

	@Override
	public Set<JoinPointShadow> interpret(final MethodNode methodNode,
			PointcutExpression PCE, int pc
	/* Map<String, Expression> variables */) {
		final Set<JoinPointShadow> temp = leftOperand.interpret(methodNode,
				PCE/* variables */, pc);
		final Iterator<JoinPointShadow> it = temp.iterator();
		if (it.hasNext()) {
			return temp;
		} else {
			return rightOperand.interpret(methodNode, PCE/* variables */, pc);
			/*
			 * if(it.hasNext()) { JoinPointShadow current = it.next();
			 * if(current.getMethodName().equals("wholeMethod") ||
			 * current.getClassName().equals("wholeClass")) {
			 * Set<JoinPointShadow> temp1 =rightOperand.interpret(methodNode);
			 * Iterator<JoinPointShadow> it1 = temp1.iterator();
			 * if(it1.hasNext()) { JoinPointShadow current1 = it.next();
			 * if(current1.getMethodName().equals("wholeMethod") ||
			 * current1.getClassName().equals("wholeClass")) { return temp1; }
			 * else return temp1; } else return temp; }else{
			 * Set<JoinPointShadow> temp1 =rightOperand.interpret(methodNode);
			 * Iterator<JoinPointShadow> it1 = temp1.iterator();
			 * if(it1.hasNext()) { JoinPointShadow current1 = it1.next();
			 * if(current1.getMethodName().equals("wholeMethod") ||
			 * current1.getClassName().equals("wholeClass")) { return temp; }
			 * else { temp.retainAll(temp1); return temp; } } else return temp;
			 * } } else return rightOperand.interpret(methodNode);
			 */
		}
	}

	@Override
	public boolean interpret(final String className) {
		// TODO Auto-generated method stub
		final boolean temp = leftOperand.interpret(className/* variables */);
		if (temp) {
			if (rightOperand.interpret(className/* variables */)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@Override
	public boolean interpretWithincode(final String methodName) {
		// TODO Auto-generated method stub
		// System.out.println("In And withincode");
		final boolean temp = leftOperand
				.interpretWithincode(methodName/* variables */);
		if (temp) {
			if (rightOperand.interpretWithincode(methodName/* variables */)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public void setOperand(final PointCutExpressionInterface e1,
			final PointCutExpressionInterface e2) {
		leftOperand = e1;// .getPC();
		rightOperand = e2;// .getPC();
	}
}