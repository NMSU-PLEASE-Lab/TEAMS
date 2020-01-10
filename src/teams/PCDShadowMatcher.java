package teams;

import java.util.Set;
import java.util.Vector;

import org.objectweb.asm.tree.MethodNode;

/**
 * @author Gholamali Rahnavard
 * 
 */
public interface PCDShadowMatcher {
	public void makeArgumentValue(JoinPointShadow joinPointShadow,
			MethodNode methodNode, Vector<JoinPointInfoExp> infoExpVect);

	/*
	 * Possible extension i/f for getting data items into shadow public
	 * AdviceData genDataCode(String dataItem);
	 */
	/**
	 * This methods finds the points in @methodNode that match with @argument,
	 * and uses @aspect to extract or produce the necessary data that are
	 * defined in the aspect.
	 * 
	 * @param methodNode
	 *            is an object from class MothodNode in asm.tree package that
	 *            will find the shadows inside it.
	 * @param argument
	 *            is an object that can be from MethodExpression,
	 *            PathExpression, or SimpleArgument which have implemented
	 *            Argument interface. This uses as a comparison element to find
	 *            match shadows.
	 * @param aspect
	 *            is an object from class Aspect that includes our aspect
	 *            elements as an object such as necessary data.
	 * @return Set<JoinPointShadow> of join-point shadows as the result.
	 */

	public Set<JoinPointShadow> match(MethodNode methodNode, Argument argument,
			Vector<JoinPointInfoExp> joinPointInfoExpVector, int pc);
}

/*
 * Example of how the basicblock extension might implement genDataCode
 * 
 * public AdviceData genDataCode(String dataItem) { if
 * (dataItem.equals("blockid")) { generate blockid Type string and intruction
 * sequence return it; } }
 */
