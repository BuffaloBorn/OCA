import rope.*;
import static rope.Rope.*;

public class RopeSwing {
	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	{
		System.out.println(rope1.length);
		System.out.println("hit");
	}

	public static void main(String[] args) {
		//RopeSwing p = new RopeSwing();
		rope1.length = 2;
		rope2.length = 8;
		System.out.println(rope1.length);
	}
}

/*
 * There are two details to notice in this code. First, note that RopeSwing has an
 * instance initializer and not a static initializer. Since RopeSwing is never constructed,
 * the instance initializer does not run. The other detail is that length is static. 
 * Changes from one object update this common static variable.
 * 
 * */