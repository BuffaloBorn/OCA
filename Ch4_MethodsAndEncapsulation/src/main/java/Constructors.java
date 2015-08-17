/**
 * Created by vitaly on 17.08.15.
 * CONSTRUCTOR CHAIN :)
 */

public class Constructors {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(15);
        System.out.println(mouse);
    }
}

class Mouse {
    public static final int DEFAULT_WEIGHT = 10;
    private final int i = 7;
    private int weight;
    private int numTeeth;
    private int numWhiskers;

    public Mouse() {
//        this(weight); //нельзя использовпть вызов членов классв перед вызовом конструктора
        this(getDefaultWeight() + DEFAULT_WEIGHT); //Мозно испоьзовать вызов статических членов, так как они инициализируютмя первыми
    }

    public Mouse(int weight) {
        this(weight, 16);
    }

    public Mouse(int weight, int numTeeth) {
        this(weight, numTeeth, 6);
    }

    public Mouse(int weight, int numTeeth, int numWhiskers) {
        this.weight = weight;
        this.numTeeth = numTeeth;
        this.numWhiskers = numWhiskers;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumTeeth() {
        return numTeeth;
    }

    public void setNumTeeth(int numTeeth) {
        this.numTeeth = numTeeth;
    }

    public int getNumWhiskers() {
        return numWhiskers;
    }

    public void setNumWhiskers(int numWhiskers) {
        this.numWhiskers = numWhiskers;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mouse{");
        sb.append("weight=").append(weight);
        sb.append(", teeth=").append(numTeeth);
        sb.append(", whiskers=").append(numWhiskers);
        sb.append('}');
        return sb.toString();
    }

    private static int getDefaultWeight() {
        return DEFAULT_WEIGHT;
    }
}