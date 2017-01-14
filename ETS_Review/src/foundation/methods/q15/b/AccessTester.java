package foundation.methods.q15.b;

//In file AccessTester.java 
import foundation.methods.q15.a.AccessTest; 

class SubAccessTester extends AccessTester{ }

public class AccessTester extends AccessTest{ 
	public static void main(String[] args) { 
		AccessTest ref = new AccessTest();
		//ref.a();
		//ref.b();
		//ref.c();
		ref.d();
		
		SubAccessTester subref = new SubAccessTester(); 
		subref.c(); //this is valid
		subref.h =0;
		
	} 
}