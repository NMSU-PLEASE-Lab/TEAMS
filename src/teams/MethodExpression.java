package teams;

import java.util.Vector;

public class MethodExpression implements Argument {
	private String returnType;
	private String expression;
	private Vector<Argument> args = new Vector<Argument>();

	public Vector<Argument> getArgs() {
		return args;
	}

	public void setArgs(Vector<Argument> args) {
		this.args = args;
	}

	public String getReturnType() {
		return returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	@Override
	public String getExpression() {
		return expression;
	}

	@Override
	public void setExpression(String expression) {
		this.expression = expression;
	}

}
