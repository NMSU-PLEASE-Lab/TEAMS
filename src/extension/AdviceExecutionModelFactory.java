package extension;

import teams.AdviceExecutionModel;
import teams.TEAMSAdviceExecutionModelFactory;

public class AdviceExecutionModelFactory implements
		TEAMSAdviceExecutionModelFactory {
	/**
	 * @author Gholamali Rahnavard This class is used to create appropriate
	 *         object depends on requested execution model. It plays the factory
	 *         class role.
	 */
	enum AdviceExecutionModelNames {
		AFTER, BEFORE
	};

	/**
	 * Creates and Advice Exection object based on a defined model by
	 * developers.
	 */
	@Override
	public AdviceExecutionModel createEmbedder(final String executionModelName) {
		// TODO Auto-generated method stub
		final AdviceExecutionModelNames adviceExecutionModelNames = AdviceExecutionModelNames
				.valueOf(executionModelName.toUpperCase());
		switch (adviceExecutionModelNames) {
		case BEFORE:
         System.err.println("JEC: Enum selected before AEM!");
			return new BeforeAdviceExecutionModel();
		case AFTER:
         System.err.println("JEC: Enum selected after AEM!");
			return new AfterAdviceExecutionModel();
		default:
         System.err.println("JEC: Enum selection failed!");
			return new BeforeAdviceExecutionModel();

		}
	}
}
