package q20161219023840;

import java.util.function.Predicate;

public class Panda {
	int age; 
	int weight; 

	public static void main(String[] args) {
		Panda p1 = new Panda();
		p1.age = 7;
		p1.weight = 190;
		check(p1, (Panda p) -> p.age < 5);
		check(p1,  w -> w.weight > 180);
		//check(p1,  o -> o.age < 5);
		//check(p1, Panda p -> p.age < 5);
	}
	
	private static void check(Panda panda, Predicate<Panda> pred){
		String result = pred.test(panda) ? "match" : "not match";
		System.out.println(result);
		
	}

}
