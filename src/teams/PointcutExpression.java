package teams;

import java.util.Vector;

public class PointcutExpression {
	private Vector<Argument> args = new Vector<Argument>();
	private String name;
	private PointCutExpressionInterface PC;

	public Vector<Argument> getArgs() {
		return args;
	}

	public String getName() {
		return name;
	}

	public PointCutExpressionInterface getPC() {
		return PC;
	}

	public void setArgs(final Vector<Argument> args) {
		this.args = args;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPC(final PointCutExpressionInterface pC) {
		PC = pC;
	}
}
