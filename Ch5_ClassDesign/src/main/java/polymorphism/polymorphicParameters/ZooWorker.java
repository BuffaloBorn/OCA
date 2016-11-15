package polymorphism.polymorphicParameters;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public class ZooWorker {

	public static void feed(Reptile reptile) {
		System.out.println("Feeding reptile " + reptile.getName());
	}
	
	// Let’s focus on the feed(Reptile reptile) method in this example. As you can see, that
	// method was able to handle instances of Alligator and Crocodile without issue, because
	// both are subclasses of the Reptile class. It was also able to accept a matching type Reptile
	// class.

	public static void main(String[] args) {
		feed(new Alligator());
		feed(new Crocodile());
		feed(new Reptile());
	}

}
