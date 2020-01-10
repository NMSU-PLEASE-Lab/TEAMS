package teams;

import extension.BasicBlockDataGenerator;
import extension.CallDataGenerator;
import extension.ExecutionDataGenerator;
import extension.FieldAccessDataGenerator;

/**
 * @author Gholamali Rahnavard
 * 
 */
public class DataGeneratorFactory implements TeamsDataGeneratorFactory {
	/**
	 * This includes all key words for designators that they will use to create
	 * the correspond object
	 */
	enum Data {
		BASICBLOCK, CALL, EXECUTION, FIELDACCESS, WITHIN, WITHINCODE
	};

	/**
	 * Creates an ShadowMatcher object based on your designator type. Should add
	 * a case in the switch statement to check the PCD type and create a
	 * correspond object.
	 * 
	 * @see teams.TeamsPCDShadowMatcherFactory#createMatcher(java.lang.String)
	 */
	@Override
	public DataGenerator createGenerator(final String type) {
		final Data data = Data.valueOf(type.toUpperCase());
		switch (data) {
		case CALL:
			return new CallDataGenerator();
		case EXECUTION:
			return new ExecutionDataGenerator();
		case FIELDACCESS:
			// System.out.print("field");
			return new FieldAccessDataGenerator();
		case BASICBLOCK:
			return new BasicBlockDataGenerator();
		default:
			return new DefaultDataGenerator();

		}
	}
}
