package pound.swan;

import pound.duck.FatherDuck;
import pound.duck.MotherDuck;

/**
 * Created by Vitaly on 16.08.2015.
 */
public class BadCygnet extends FatherDuck{
    public void makeNoise() {
//        MotherDuck duck = new MotherDuck();
//        duck.quack();                       // DOES NOT COMPILE
//        System.out.println(duck.noise);     // DOES NOT COMPILE
        FatherDuck duck = new FatherDuck();
        quack();
        BadCygnet duck1 = new BadCygnet();
        duck1.quack();
    }
}

class A extends BadCygnet{
    public static void main(String[] args) {
//        BadCygnet duck1 = new BadCygnet();
        A duck1 = new A();
        duck1.quack();
    }
}