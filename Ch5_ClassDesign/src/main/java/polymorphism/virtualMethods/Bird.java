package polymorphism.virtualMethods;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public class Bird {
	public String getName() {
		return "Unknown";
	}

	public void displayInformation() {
		System.out.println("The bird name is: " + getName());
	}
}
