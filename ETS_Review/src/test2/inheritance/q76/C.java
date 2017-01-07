package test2.inheritance.q76;

//Given the following classes and declarations, which of these statements about //1 and //2 are true?

class A{
   private int i = 10;
   public void f(){System.out.println("f() called");}
   public void g(){System.out.println("g() called");}
}

class B extends A{
   public int i = 20;
   public void g(){System.out.println("g() called");}
}

public class C{
  
   
   public static void main(String[] args) {
	   A a = new A();//1
	   A b = new B();//2
	   
	   //System.out.println(b.i); //will print 10.
	   //System.out.println(b.i); //will print 20
	   b.f();
   }
}

/*
 * Remember that variables and static methods are not overridden and so access to 
 * variables and static methods is determined at compile time based on the type of 
 * the variable (instead of type of the object referred to by the variable, as is 
 * the case with instance methods.) In the given code, 
 * if you declare b to be of type B i.e. V b = new B();, you can access b.i. 
 * */
