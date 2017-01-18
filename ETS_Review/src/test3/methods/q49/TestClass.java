package test3.methods.q49;

class TestClass{ 
	static TestClass ref; 
	String[] arguments; 
	boolean switchHolder; 
	
	public static void main(String args[]){ 
		ref = new TestClass(); 
		System.out.println(ref.switchHolder);
		ref.func(args);
		System.out.println(ref.switchHolder);
	 } 
	
	public void func(String[] args){ 
		ref.arguments = args;
		ref.switchHolder = true;
	} 
} 
