package polymorphism.castingObjects;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
import polymorphism.Lemur;
import polymorphism.Primate;

public class CastingObjects {

	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		Primate primate = lemur;
		
		// we created a single instance of a Lemur object and accessed it
		// via superclass and interface references. Once we changed the reference type, though,
		// we lost access to more specific methods defined in the subclass that still exist 
		// within the object.
		//
		// Lemur lemur2 = primate; // DOES NOT COMPILE
		
		Lemur lemur3 = (Lemur)primate;
		System.out.println(lemur3.age);
		
		// In this example, we first try to convert the primate reference back to a lemur reference,
		// lemur2, without an explicit cast. The result is that the code will not compile. In the second
		// example, though, we explicitly cast the object to a subclass of the object Primate and we
		// gain access to all the methods available to the Lemur class.
		//
		// Here are some basic rules to keep in mind when casting variables:
		// 	1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
		// 	2. Casting an object from a superclass to a subclass requires an explicit cast.
		// 	3. The compiler will not allow casts to unrelated types.
		// 	4. Even when the code compiles without issue, an exception may be thrown at runtime
		// 		if the object being cast is not actually an instance of that class.
			}

}
