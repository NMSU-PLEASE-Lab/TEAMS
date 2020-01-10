package teams;

public interface TeamsDataGeneratorFactory {
	/**
	 * Creates an ShadowMatcher object based on your designator type.
	 * 
	 * @param type
	 *            is the designator type.
	 */
	public DataGenerator createGenerator(String type);
}
