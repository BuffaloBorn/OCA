package polymorphism;
/**
 * Created by Vitaly on 21.08.2015.
 * Moved and updated by BuffaloBorn on 11/15/2016
 */
//        1.  Casting an object from a subclass to a superclass doesnâ€™t require an explicit cast.
//        2.  Casting an object from a superclass to a subclass requires an explicit cast.
//        3.  The compiler will not allow casts to unrelated types.
//        4.  Even when the code compiles without issue, an exception may be thrown at runtime
//            if the object being cast is not actually an instance of that class.

public class Polymorphism {
	
    public static void main(String[] args) {
    	
    	Lemur lemur = new Lemur();
    	System.out.println(lemur.age);
    	
    	HasTail hasTail = lemur;
    	System.out.println(hasTail.isTailStriped());
    	
    	Primate primate = lemur;
    	System.out.println(primate.hasHair());

//     In this example, the reference hasTail has direct access only to methods defined with
//     the HasTail interface; therefore, it doesn’t know the variable age is part of the object.
//     Likewise, the reference primate has access only to methods defined in the Primate class,
//     and it doesn’t have direct access to the isTailStriped() method.
//       
//       HasTail hasTail = lemur;
//       System.out.println(hasTail.age); // DOES NOT COMPILE
//       
//       Primate primate1 = lemur;
//       System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
   
    }
}

