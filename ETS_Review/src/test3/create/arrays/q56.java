package test3.create.arrays;

public class q56 {

	public static void main(String[] args) {
		double daaa[][][] = new double[3][][]; 
		double d = 100.0; 
		double[][] daa = new double[1][1];

		//daaa[0] = d;
		daaa[0] = daa;
		//daaa[0] = daa[0];
		//daa[1][1] = d;
		daa = daaa[0];
		System.out.println("Done");
	}
}
