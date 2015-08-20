/**
 * Created by vitaly on 20.08.15.
 */
public class HidingVariables {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();
        mouse.getMouseDetails();
        Rodent rodent = mouse;
        System.out.println(rodent.tailLength);
        System.out.println(mouse.tailLength);
        System.out.println(rodent.name);
        System.out.println(mouse.name);
        System.out.println(rodent);
        System.out.println(mouse);
    }
}

class Rodent {
    protected float tailLength = 4;
    public static String name = "Rodent";

    public void getRodentDetails() {
        System.out.println("[Parent tail lentgth=" + tailLength + "]");
    }

    @Override
    public String toString() {
        return name + " tailLength" + tailLength;
    }
}

class Mouse extends Rodent {
    protected int tailLength = 8;
    public static String name = "Mouse";

    public void getMouseDetails() {
        System.out.println("[tail=" + tailLength + ", parentTail=" + super.tailLength + "]");
    }

    @Override
    public String toString() {
        return name + " tailLength" + tailLength;
    }
}