package interfaces.defaultMethodsAndMultipleInheritance;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
// Cat inherits the two default methods for getSpeed(), so which does it
// use? 
// 
// Since Walk and Run are considered siblings in terms of how they are used 
// in the Cat class, it is not clear whether the code should output 5 or 10.
//
//public class Cat implements Run, Walk { // DOES NOT COMPILE
//
//	public static void main(String[] args) {
//		System.out.println(new Cat().getSpeed());
//	}
//
//}

//  There is an exception to this rule, though: if
//  the subclass overrides the duplicate default methods, the code will compile without
//  issue—the ambiguity about which version of the method to call has been removed.

public class Cat implements Run, Walk { // DOES NOT COMPILE

	public static void main(String[] args) {
		System.out.println(new Cat().getSpeed());
	}

	public int getSpeed() {
		return 1;
	}
}