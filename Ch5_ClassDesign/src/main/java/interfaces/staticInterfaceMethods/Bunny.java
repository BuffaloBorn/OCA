package interfaces.staticInterfaceMethods;

public class Bunny implements Hop {

//  As you can see, without an explicit reference to the name of the interface the code will
//	not compile, even though Bunny implements Hop. In this manner, the static interface methods
//	are not inherited by a class implementing the interface.
//
//	public void printDetails() {
//		System.out.println(getJumpHeight()); // DOES NOT COMPILE
//	}

	public void printDetails() {
		System.out.println(Hop.getJumpHeight());
	}
	
}
