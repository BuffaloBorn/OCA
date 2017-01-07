package foundation.constructors.q60;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*public*/ class A1{
	  public A1()  // This constructor is automatically inserted by the compiler 
	  			   // because there is no other constructor defined by 
	  			   // the programmer explicitly.
	  {
	    super();  //Note that it calls the super class' default no-args constructor.
	  }
	}
/*public*/ class A2{
	  //Compiler will not generate any constructor because the programmer has 
	  // defined a constructor.
	  public A2(int i){
	     //do something
	  }
	}