package teams;

public interface TeamsPCDShadowMatcherFactory {
	/**
	 * Creates an ShadowMatcher object based on your designator type.
	 * 
	 * @param type
	 *            is the designator type.
	 */
	public PCDShadowMatcher createMatcher(String type);
}
