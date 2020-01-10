package teams;

import java.util.Vector;

import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.analysis.AnalyzerException;

/**
 * @author Gholamali Rahnavard
 * 
 */
public interface DataGenerator {
	/**
	 * This methods finds the points in @methodNode that match with @argument,
	 * and uses @aspect to extract or produce the nesseray data that are defined
	 * in the aspect.
	 * 
	 * @param methodNode
	 *            is an object from class MothodNode in asm.tree package that
	 *            will find the shadows inside it.
	 * @param currentShadow
	 * @param joinPointInfoExpVector
	 * @param argument
	 *            is an object that can be from MethodExpression,
	 *            PathExpression, or SimpleArgument which have implemented
	 *            Argument interface. This uses as a comparison element to find
	 *            match shadows.
	 * @param aspect
	 *            is an object from class Aspect that includes our aspect
	 *            elements as an object such as necessary data.
	 * @return Set<JoinPointShadow> of join-point shadows as the result.
	 * @throws AnalyzerException
	 */

	public InsnList Generate(JoinPointShadow currentShadow,
			Vector<JoinPointInfoExp> joinPointInfoExpVector);
	/*
	 * Possible extension i/f for getting data items into shadow public
	 * AdviceData genDataCode(String dataItem);
	 */
}

/*
 * Example of how the basicblock extension might implement genDataCode
 * 
 * public AdviceData genDataCode(String dataItem) { if
 * (dataItem.equals("blockid")) { generate blockid Type string and intruction
 * sequence return it; } }
 */
