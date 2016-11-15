package polymorphism.methodOverriding;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public class Gorilla extends Animal {
//	protected String getName() { // DOES NOT COMPILE
//		return "Gorilla";
//	}
	
	// For the purpose of this discussion, we’ll ignore the fact that the implementation of
	// getName() in the Gorilla class doesn’t compile because it is less accessible than the version
	// it is overriding in the Animal class. 
	//
	// Remember the accessible levels: public -> protected -> (default) -> private
	//
	// This creates a contradiction in that the
	// compiler should not allow access to this method, but because it is 
	// being referenced as an instance of Animal, it is allowed. Therefore, 
	// Java eliminates this contradiction, thus disallowing
	// a method from being overridden by a less accessible version of the method.
}
