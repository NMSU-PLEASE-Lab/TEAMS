package teams;

public class PathExpression implements Argument {
	private String expression;

	@Override
	public String getExpression() {
		return expression;
	}

	@Override
	public void setExpression(String expression) {
		this.expression = expression;
	}

}
