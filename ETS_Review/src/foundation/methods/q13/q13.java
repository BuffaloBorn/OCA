package foundation.methods.q13;

/*
 * If the class declares a field with a certain name, then the declaration 
 * of that field is said to hide any and all accessible declarations of fields 
 * with the same name in superclasses, and superinterfaces of the class.
 * */

class Base{ int i=10; final int h = 88; } 

class Sub extends Base{ 
	int i=20; //This i hides Base's i. 
	int h=30; //This h hides Base's h;   
}


public class q13 {

	public static void main(String[] args) {
		Sub s = new Sub(); 
		int k = s.i; //assigns 20 to k.
		int l = s.h;
		k = ((Base)s).i;//assigns 10 to k. The cast is used to show the Base's i.
		l = ((Base)s).h;//assigns 88 to h. The cast is used to show the Base's h.
		
		Base b = new Sub();
		k = b.i; /* assigns 10 to k because which field is accessed depends 
				 * on the class of the variable and not on the class of the actual 
				 * object. Same rule applies to static methods but the opposite is 
				 * true for instance methods.*/
		l = b.h;

	}

}
