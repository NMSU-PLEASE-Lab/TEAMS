package extension;

import teams.DefaultShadowMatcher;
import teams.PCDShadowMatcher;
import teams.TeamsPCDShadowMatcherFactory;

/**
 * @author Gholamali Rahnavard
 * 
 */
public class PCDShadowMatcherFactory implements TeamsPCDShadowMatcherFactory {
	/**
	 * This includes all key words for designators that they will use to create
	 * the correspond object
	 */
	enum desigantors {
		BASICBLOCK, CALL, EXECUTION, FIELDACCESS, LOOP, LOOPX, WITHIN, WITHINCODE
	};

	/**
	 * Creates an ShadowMatcher object based on your designator type. Should add
	 * a case in the switch statement to check the PCD type and create a
	 * correspond object.
	 * 
	 * @see teams.TeamsPCDShadowMatcherFactory#createMatcher(java.lang.String)
	 */
	@Override
	public PCDShadowMatcher createMatcher(final String type) {
		final desigantors designator = desigantors.valueOf(type.toUpperCase());
		switch (designator) {
		case CALL:
			return new CallShadowMatcher();
		case EXECUTION:
			return new ExecutionShadowMatcher();
		case FIELDACCESS:
			return new FieldAccessShadowMatcher();
		case BASICBLOCK:
			return new BasicBlockShadowMatcher();
		case LOOPX:
			return new LoopXShadowMatcher();
		case LOOP:
			return new LoopShadowMatcher();
		default:
			return new DefaultShadowMatcher();

		}
	}
}
