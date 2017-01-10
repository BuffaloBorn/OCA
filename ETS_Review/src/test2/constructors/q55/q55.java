package test2.constructors.q55;

public class q55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Given the following code, which of the constructors shown in the options can be added to class B without causing a compilation to fail?

class A{
   int i;
   public A(int x) { this.i = x; }
}
class B extends A{
   int j;
   public B(int x, int y) { super(x);  this.j = y; }
   
   //B( ) { }
   //B(int y ) { j = y; }
   B(int y ) { super(y*2 ); j = y; }
   //B(int y ) { i = y; j = y*2; }
   // B(int z ) { this(z, z); } 
}

/*
 * 1. Remember that an instance of a class is also an instance of its parent class. 
 * Therefore, as a part of constructing an instance of a subclass, the JVM has to initialize 
 * those parts of the instance that are inherited from the super class as well. Further, the 
 * parts inherited from the super class need to be initialized first because the subclass may 
 * depend on them. Since it is the job of a constructor to initialize an instance, a 
 * constructor of the super class has to be invoked before the constructor of the subclass 
 * can proceed. The compiler ensures that at least one constructor of the super class is 
 * invoked if you do not explicitly call a super class's constructor by adding super(); 
 * (i.e. a call to the no-args constructor) as the first line of the sub class constructor. 
 * It automatically adds this call IF and ONLY IF the subclass's constructor does not 
 * explicitly call any of the super class's constructor in the first line of its code.  
 * 
 * Now, if the super class ( here, A ) does not have a no-args constructor, the call super(); 
 * will fail. Hence, choices B( ) { }, B(int y ) { j = y; } and B(int y ) { i = y; j = y*2; } 
 * are not valid and choice B(int y ) { super(y*2 ); j = y; } is valid because it explicitly 
 * calls super( int ), which is available in A.  
 * 
 * 2. Instead of calling a super class's constructor using super(<args>), you can also call 
 *  another constructor of the sub class in 
 *  the first line (as given in choice B(int z ) { this(z, z); } ). 
 * 
 *  Here, this(int, int) is called in the first line, which, in turn, calls super(int). 
 *  So the super class A is correctly instantiated before the sub class B begins initialization.
 */