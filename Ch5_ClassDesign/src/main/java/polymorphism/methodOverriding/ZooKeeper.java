package polymorphism.methodOverriding;

public class ZooKeeper {
	public static void main(String[] args) {
		Animal animal = new Gorilla();
		System.out.println(animal.getName());
	}
}
