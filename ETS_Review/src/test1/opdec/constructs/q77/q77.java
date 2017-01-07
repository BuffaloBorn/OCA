package test1.opdec.constructs.q77;

public class q77 {

	public static void main(String[] args) {

//Given the following declarations, identify which statements will return true:

		Integer i1 = 1;
		Integer i2 = new Integer(1);
		int i3 = 1;
		Byte b1 = 1;
		Long g1 = 1L;
		
		boolean t1 = i1 == i2;       //1
		boolean t2 = i1 == i3;
		//boolean t3 = i1 == b1;
		boolean t4 = i1.equals(i2);
		boolean t5 = i1.equals(g1);
		boolean t6 = i1.equals(b1);
		
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
		//System.out.println("t3 = " + t3);
		System.out.println("t4 = " + t4);
		System.out.println("t5 = " + t5);
		System.out.println("t6 = " + t6);
	}

}
