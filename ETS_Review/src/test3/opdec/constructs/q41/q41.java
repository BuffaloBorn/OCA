package test3.opdec.constructs.q41;

public class q41 {

	public static void main(String[] args) {
		System.out.println("a"+'b'+63);
		System.out.println("a"+63);
		System.out.println('b'+new Integer(63));
		String s = 'b'+63+"a";
		System.out.println(s);
		
		// String s1 = 63 + new Integer(10);
		 int i = 63 + new Integer(10);
		// Since neither of the operands of + operator is a String, it will not generate a String. 
	    // However, due to auto-unboxing of 10, it will generate an int value of 73.
	}

}

/*
 * + is overloaded such that if any one of its two operands is a String then it will convert the other
 * operand to a String and create a new string by concatenating the two.
 * Therefore, in 63+"a" and "a"+63, 63 is converted to "63" and 'b' +"a" and "a"+'b', 'b' is converted
 * to "b".Note that in 'b'+ 63 , 'b' is promoted to an int i.e. 98 giving 161.
 * */
