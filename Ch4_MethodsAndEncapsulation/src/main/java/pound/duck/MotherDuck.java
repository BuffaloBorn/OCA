package pound.duck;

/**
 * Created by Vitaly on 16.08.2015.
 */
public class MotherDuck {
    String noise = "quack";

    void quack() {
        System.out.println(noise);     // default access is ok
    }

    private void makeNoise() {
        quack();// default access is ok
    }

}