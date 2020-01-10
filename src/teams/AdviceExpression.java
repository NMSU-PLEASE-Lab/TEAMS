package teams;

import java.util.Vector;

public class AdviceExpression {
	private AdviceExecutionModel adviceExecutionModel;
	private Vector<Argument> args = new Vector<Argument>();
	private String name;
	private Vector<Argument> pointcutList = new Vector<Argument>();

	public AdviceExecutionModel getAdviceExecutionModel() {
		return adviceExecutionModel;
	}

	public Vector<Argument> getArgs() {
		return args;
	}

	public String getName() {
		return name;
	}

	public Vector<Argument> getPointcutList() {
		return pointcutList;
	}

	public void setAdvice(final AdviceExecutionModel Advice) {
		adviceExecutionModel = Advice;
	}

	public void setArgs(final Vector<Argument> args) {
		this.args = args;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPointcutList(final Vector<Argument> pointcutList) {
		this.pointcutList = pointcutList;
	}

}
