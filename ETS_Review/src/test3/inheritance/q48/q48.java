package test3.inheritance.q48;;

//What will the following code print when compiled and run?

class Base{
   void methodA(){
      System.out.println("base - MethodA");
   }

public void methodB() {
	System.out.println("base - MethodB");
	
}
}

class Sub extends Base{
   public void methodA(){
      System.out.println("sub - MethodA");
   }
   public void methodB(){
      System.out.println("sub - MethodB");
   }
   public static void main(String args[]){
      Base b=new Sub(); //1
      b.methodA(); //2
      b.methodB(); //3 -> Compile time error, without declaring this method in Base class
   }
}

public class q48{
	
	public static void main(String args[]){
		Sub.main(args);
	   }
	
}

/*
 * The point to understand here is, b is declared to be a reference of class Base and methodB() is 
 * not defined in Base. So the compiler cannot accept the statement b.methodB() because it only verifies 
 * the validity of a call by looking at the declared class of the reference. For example, the compiler is 
 * able to verify that b.methodA() is a valid call because class Base has method methodA. But it does not 
 * "bind" the call. Call binding is done at runtime by the jvm and the jvm looks for the actual class of 
 * object referenced by the variable before invoking the method. 
 * 
 */
 