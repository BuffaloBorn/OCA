package q20170316152810;

abstract class Insect{
	public Insect(int age) {System.out.println("1");}
	public Insect(String color) {this(5); System.out.println("2");}
}

public class PrayingMantis extends Insect {
	public PrayingMantis(String color){
		super(0);
		System.out.println("3");
	}
	
	public static void main(String arg[]){
		new PrayingMantis("green");
	}
}
