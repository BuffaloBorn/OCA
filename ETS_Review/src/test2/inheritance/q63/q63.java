package test2.inheritance.q63;


//Given the following definitions and reference declarations:

interface I1 { }
interface I2 { }
class C1 implements I1 { }
class C2 implements I2 { }
class C3 extends C1 implements I2 { }

// Which of these statements are legal?

class C4 extends C3 implements I1, I2 { }


public class q63 {

	public static void main(String[] args) {
		C1 o1;
		C2 o2;
		C3 o3 = null;

	//	o3 = o1;
		
	//	o3 = o2;
		
		I1 i1 = o3; I2 i2 = (I2) i1;

		I1 b = o3;
	}

}
