package pound.duck;

/**
 * Created by Vitaly on 16.08.2015.
 */
public class FatherDuck {
    private String noise = "quack";

    public void makeNoise() {
        quack();
    }

    protected void quack() {
        System.out.println(noise);
    }

}
