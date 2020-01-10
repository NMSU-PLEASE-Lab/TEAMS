package teams;

/**
 * @author Gholamali Rahnavard
 * 
 */
public interface TEAMSAdviceExecutionModelFactory {
	/**
	 * This method should be implemented to create the appropriate object based
	 * on the execution model name
	 * 
	 * @param executionModelName
	 * @return an object of AdviceExecutionModel that refers to
	 *         appropriate execution model
	 */
	public AdviceExecutionModel createEmbedder(
			String executionModelName);

}
