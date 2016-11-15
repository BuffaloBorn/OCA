package interfaces.overridesDefaultMethod;

public interface SharkFamily extends HasFins {
	public default int getNumberOfFins() {
		return 8;
	}

	public double getLongestFinLength();

	public default boolean doFinsHaveScales() { // You see that we create our own default method same as the parent
	return false;
	}
	
//	public boolean doFinsHaveScales() { // DOES NOT COMPILE - not marked as a default method
//		return false;
//		}
}
