package q20161219023840;

import java.util.function.Predicate;

public class Panda {
	int age; 

	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 7;
		check(p1, (Panda p) -> p.age < 5);
		//check(p1, Panda p -> p.age < 5);
	}
	
	private static void check(Panda panda, Predicate<Panda> pred){
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
		
	}

}
