package foundation.opdec.constructs.q58;

public class q58 {

	public static void main(String[] args) {
		short s = Short.MAX_VALUE;
		// char c = s;
		// System.out.println(c == Short.MAX_VALUE);
		System.out.println(s);

	}
	
	//	This will not compile because a short VARIABLE can NEVER be assigned to a 
	//  char without explicit casting. A short CONSTANT can be assigned to a char 
	//  only if the value fits into a char.

	// short s1 = 1; byte b1 = s1; //=> this will also not compile because although 
								   //   value is small enough to be held by a byte 
								   //   but the Right Hand Side i.e. s is a variable 
								   //   and not a constant.
	final short s2 = 1; byte b2 = s2; //=> This is fine because s is a constant and 
									  //   the value fits into a byte.
	// final short s3 = 200; byte b3 = s3; //=> This is invalid because although s
										//   is a constant but the value does not 
										//   fit into a byte.

	// Implicit narrowing occurs only for byte, char, short, and int. 
	// Remember that it does not occur for long, float, or double. 
	// So, this will not compile: int i = 129L;

}
