/**
 * Created by vitaly on 20.08.15.
 */
public class HidingVariables {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        mouse.getRodentDetails();				//[Parent tail lentgth=4.0]
        mouse.getMouseDetails();                //[tail=8, parentTail=4.0] 
        Rodent rodent = mouse;
        System.out.println(rodent.tailLength);  //4.0              
        System.out.println(mouse.tailLength);   //8                
        System.out.println(rodent.name);        //Rodent           
        System.out.println(mouse.name);         //Mouse            
        System.out.println(rodent);             //Mouse tailLength8
        System.out.println(mouse);              //Mouse tailLength8
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