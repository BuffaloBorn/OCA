package test5.inheritance.q53;


interface I{
}
class A implements I{

	@Override
	public String toString() {
		return "A [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

class B extends A {

	@Override
	public String toString() {
		return "B [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

class C extends B{

	@Override
	public String toString() {
		return "C [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}

public class TestClass {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		//a = (B)(I)b;
		//System.out.println(a.toString());
		//b = (B)(I) a;
		//System.out.println(b.toString());
		//a = (I) b;
		//System.out.println(a.toString());
		//I i = (C) a;
		//System.out.println(i.toString());
		
	}

}
