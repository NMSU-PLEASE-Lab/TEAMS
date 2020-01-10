package teams;

import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.ClassNode;

public class CommaExpression implements AdviceExecutionModel {
	AdviceExecutionModel leftOperand;
	AdviceExecutionModel rightOperand;

	public CommaExpression() {
	}

	@Override
	public Vector<String> adviceInterprete() {
		// TODO Auto-generated method stub
		final Vector<String> temp = leftOperand.adviceInterprete();
		if (temp != null) {
			temp.addAll(rightOperand.adviceInterprete());
			return temp;
		} else {
			return rightOperand.adviceInterprete();
		}
	}

	@Override
	public void embed(final ClassNode classNode,
			final Set<JoinPointShadow> shadows, final String PCEName,
			final String aspectName, final int pc) {
		// TODO Auto-generated method stub

	}

	public void setOperand(final AdviceExecutionModel e1,
			final AdviceExecutionModel e2) {
		leftOperand = e1;// .getPC();
		rightOperand = e2;// .getPC();
	}
}