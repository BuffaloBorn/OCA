
public class PQOnAssignment {

	public static void main(String[] args) {
		int x = 10 % 2;
		int y = 3 / 5 + ++x;
		// int z += 4 * x; -- not yet defined in the. The left-hand side of
		//					  the expression must reference a variable that 
		//					  is already declared.
		int z = 0; // will work
		z += 4 * x;// will work
		System.out.println(x+"," + y + "," + z);

	}

}
