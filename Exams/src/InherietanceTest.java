class Vehicle{
		String type = "4W"; 
		int maxspeed = 100; 
		
		Vehicle(){} /*to make it work without call the 
		 				orginal constructor
		 			*/
		
		Vehicle(String type, int maxspeed){
			this.type = type;
			this.maxspeed = maxspeed;
		}
	}
	
	class Car extends Vehicle{
		String trans; 
		
		Car(String trans){
			//super(null, 0);/*to make it work*/
			this.trans = trans;
		}
		
		Car(String type, int maxspeed, String trans) {
			super(type, maxspeed);
			//this(trans); /*orginal code*/
			this.trans = trans; /*to make it work*/
		}
	
	}

public class InherietanceTest {
	
	public static void main(String[] args) {
		Car c1 = new Car("Auto");
		Car c2 = new Car("4W", 150, "Auto");
		System.out.println(c1.type + " " + c1.maxspeed + " " + c1.trans);
		System.out.println(c2.type + " " + c2.maxspeed + " " + c2.trans);
	}

}
