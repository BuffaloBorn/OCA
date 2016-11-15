package interfaces.defaultMethodsAndMultipleInheritance;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public interface Run {
	public default int getSpeed() {
		return 10;
	}
}
