package interfaces.defaultMethodsAndMultipleInheritance;

public interface Walk {
	public default int getSpeed() {
		return 5;
	}
}
