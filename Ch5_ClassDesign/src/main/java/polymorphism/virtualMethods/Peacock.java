package polymorphism.virtualMethods;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public class Peacock extends Bird {
	
//	More importantly, though, the value of the getName() method 
//	at runtime in the displayInformation() method is replaced with
//	the value of the implementation in the subclass Peacock.
	
	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation();
		
		// We emphasize this point by using a reference to the Bird class in the main() method,
		// although the result would have been the same if a reference to Peacock was used.
		
		Peacock peacock = new Peacock();
		peacock.displayInformation();
	}
}
