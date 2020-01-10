package teams;

import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.ClassNode;

/**
 * @author Gholamali Rahnavard
 * 
 */
public class DefaultAdviceExecutionModel implements AdviceExecutionModel {
	private Vector<Argument> args = new Vector<Argument>();
	private String name;

	@Override
	public Vector<String> adviceInterprete() {
		// TODO Auto-generated method stub
		final Vector<String> temp = new Vector<String>();
		temp.add(getName());
		return temp;
	}

	@Override
	public void embed(final ClassNode classNode,
			final Set<JoinPointShadow> shadows, final String PCEName,
			final String aspectName, final int pc) {
		// TODO Auto-generated method stub

	}

	public Vector<Argument> getArgs() {
		return args;
	}

	public String getName() {
		return name;
	}

	public void setArgs(final Vector<Argument> args) {
		this.args = args;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
