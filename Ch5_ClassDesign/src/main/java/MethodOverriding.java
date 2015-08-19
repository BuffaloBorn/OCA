/**
 * Created by Vitaly on 19.08.2015.
 */
public class MethodOverriding {
    public static void main(String[] args) throws Exception {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}

class Canine {
    public double getAverageWeight() throws Exception{
        return 50;
    }
}

class Wolf extends Canine {
    @Override
    public double getAverageWeight() throws {
        return 70;
    }
}