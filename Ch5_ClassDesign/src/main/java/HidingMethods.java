/**
 * Created by Vitaly on 19.08.2015.
 */
//        1.  The method in the child class must have the same signature as the method in the parent class.
//        2.  The method in the child class must be at least as accessible or more accessible than the method in the parent class.
//        3.  The method in the child class may not throw a checked exception that is new or
//            broader than the class of any exception thrown in the parent class method.
//        4.  If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
//        5.  The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding). Likewise, the method must not be marked as static in the child class if it is not marked as static in the parent class (method o v e rri din g ) .
public class HidingMethods {
    public static void main(String[] args) {
        Panda panda = new Panda();
        panda.sneeze();
        panda.hibernate();
    }
}

class Bear {
    public static void sneeze() {
        System.out.println("Bear Sneeze");
    }

    public void hibernate() {
        System.out.println("Bear hibernate");
    }
}

class Panda extends Bear {
    public static void sneeze() {
        System.out.println("Panda Sneeze");
    }

    @Override
    public void hibernate() {
        System.out.println("Panda hibernate");
    }

    //    public void sneeze() {System.out.println("Panda sneeze");} //DON'T COMPILE it is have to be HIDING
//
//    public static void hibernate() { System.out.println("Panda hibernate"); } //DON'T COMPILE it is have to be OVERRIDING
}