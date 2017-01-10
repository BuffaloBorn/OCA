package test2.handling.exceptions.q42;

class TestClass{ 
	
	public static void main(String[] args) throws Exception{ 
		int[] a = null; 
		int i = a[m1()];
	} 
	
	public static int m1() throws Exception{ 
		throw new Exception("Some Exception");
	} 
}
/*
 * A NullPointerException never occurs because the index expression must be completely evaluated before any part 
 * of the indexing operation occurs, and that includes the check as to whether the value of the left-hand operand 
 * is null. If the array reference expression produces null instead of a reference to an array, then a 
 * NullPointerException is thrown at runtime, but only after all parts of the array reference expression have been
 * evaluated and only if these evaluations completed normally.  In an array access, the expression to the left of 
 * the brackets appears to be fully evaluated before any part of the expression within the brackets is evaluated. 
 * 
 * Note that if evaluation of the expression to the left of the brackets completes abruptly, no part of the 
 * expression within the brackets will appear to have been evaluated.  Here, m1() is called first, which throws 
 * Exception and so a is never accessed and NullPointerException is never thrown.
 * */
 