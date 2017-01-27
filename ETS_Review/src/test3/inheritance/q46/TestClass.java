package test3.inheritance.q46;

class A {
	int i = 10;

	public static void m1() {
		System.out.println("Class A - m1");
	}

	public void m2() {
		System.out.println("Class A - m2");
	}
}

class B extends A {
	int i = 20;

	public static void m1() {
		System.out.println("Class B - m1");
	}

	public void m2() {
		System.out.println("Class B - m2");
	}
}

public class TestClass {

	public static void main(String[] args) {
		A a  = new B();
		System.out.println(a.i);  //will print 10 instead of 20
		a.m1();  //will call A's m1
		a.m2();  //will call B's m2 as m2() is not static and so overrides A's m2()

	}

}
