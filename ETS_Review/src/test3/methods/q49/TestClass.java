package test3.methods.q49;

class TestClass{ 
	static TestClass ref; 
	String[] arguments; 
	
	public static void main(String args[]){ 
		ref = new TestClass(); 
		ref.func(args);
	 } 
	
	public void func(String[] args){ 
		ref.arguments = args;
	} 
} 
