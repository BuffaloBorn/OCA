package test1.inheritance.q41;

public class q41 {

	public static void main(String[] args) {
		//A objectOfA = new A();
		B1 objectOfB1 = new B1();
		B2 objectOfB2 = new B2();
		C1 objectOfC1 = new C1();
		C2 objectOfC2 = new C2();

		objectOfC1.ml(); //will cause a compilation error.     C1 will inherit B1's m1() which in turn inherits m1() from A.
		objectOfC2.ml(); //will cause A's m1() to be called.   C2 has m1(), so its m1() will override A's m1().
		objectOfC1.ml(); //will cause A's m1() to be called.   C1 will inherit B1's m1() which in turn inherits m1() from A.
		objectOfB1.ml(); //will cause an exception at runtime. B1 will inherit m1() from A. So this is valid.
		objectOfB2.ml(); //will cause an exception at runtime. B2 overrides m1() of A. So there will be no exception.
		
	}

}

class A {
	public void ml(){}
}

class B1 extends A {
	
}

class B2 extends A {
	public void ml(){}
}

class C1 extends B1 {
	
}

class C2 extends B1 {
	public void ml(){}
}