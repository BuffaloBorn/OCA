package review.questions.q20;
/*
 * Created by BuffaloBorn on 11/16/16
 * */
public class Bird {
	private void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {
		//Bird bird = new Pelican();
		Pelican bird = new Pelican(); // testing out the alternative portion
		bird.fly();
	}
}

/**
 * The code compiles and runs without issue, so options C, D, and E are incorrect.
The trick here is that the method fly() is marked as private in the parent class Bird,
which means it may only be hidden, not overridden. With hidden methods, the specific
method used depends on where it is referenced. Since it is referenced within the Bird
class, the method declared on line 2 was used, and option A is correct. Alternatively,
if the method was referenced within the Pelican class, or if the method in the parent
class was marked as protected and overridden in the subclass, then the method on line
9 would have been used. 
 */
 