package lamdas;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveIf {

	public static void main(String[] args) {
		List<String> bunnies = new ArrayList<>();
	
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		bunnies.add("happy");
		
		System.out.print("bunnies: ");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.print("bunnies: ");
		System.out.println(bunnies); // [hoppy]

	}

}
