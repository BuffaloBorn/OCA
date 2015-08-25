import java.io.Serializable;
import java.time.format.DateTimeFormatter;

/**
 * Created by vitaly on 20.08.15.
 */

//        1.    Interfaces cannot be instantiated directly.
//        2.      An interface is not required to have any methods.
//        3.      An interface may not be marked as final.
//        4.      All top-level interfaces are assumed to have public or default access, and they must include
//                the abstract modifier in their definition. Therefore, marking an interface as private, protected,
//                or final will trigger a compiler error, since this is incompatible with these assumptions.
//        5.      All nondefault methods in an interface are assumed to have the modifiers abstractand public in their definition.
//                Therefore, marking a method as private, protected, or final will trigger compiler errors as these are
//                incompatible with the abstract and public keywords

//HERE ARE TWO INTERFACE VARIABLES RULES:
//        1.  Interface variables are assumed to be public, static, and final. Therefore, marking a variable
//            as private or protected will trigger a compiler error, as will marking any variable as abstract.
//        2.  The value of an interface variable must be set when it is declared since it is marked as final

//DEFAULT KEYWORD
//        1.  A default method may only be declared within an interface and not within a class or abstract class.
//        2.  A default method must be marked with the default keyword. If a method is marked as default, it must provide a method body.
//        3.  A default method is not assumed to be static, final, or abstract, as it may be used or overridden by a class
//            that implements the interface.
//        4.  Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected.

public class Interfaces {
    public static void main(String[] args) {
        FieldMouse mouse = new FieldMouse();
        CanBorrow canBorrow = mouse;
        CanBorrow2 canBorrow2 = mouse;
        CanBorrow3 canBorrow3 = mouse;
        System.out.println(canBorrow.MINIMUM_DEPTH);
        System.out.println(canBorrow2.MINIMUM_DEPTH);
        System.out.println(canBorrow3.MINIMUM_DEPTH);
//        Integer.parseInt()
    }
}

abstract interface CanBorrow {
    public static final int MINIMUM_DEPTH = 1;

    public abstract int getMaximunDepth();
//    static int getMaximunDepth() {
//        return 10;
//    }

    public abstract Serializable getSpeed();
}

interface CanBorrow2 {
    int MINIMUM_DEPTH = 2;

    //    int getMaximunDepth();
    Number getSpeed();
}

interface CanBorrow3 {
    int MINIMUM_DEPTH = 3;

    //    int getMaximunDepth();
    Long getSpeed();
}

interface IsWarmBlooded {
    double DEFAULT_TEMP = 36.6;

    boolean hasScales();

    default double getTemperature() {
        return 10;
    }

    static String getName() {
        return "";
    }

//    default Long getSpeed() {
//        return 1L;
//    }
}

class FieldMouse implements CanBorrow, CanBorrow2, CanBorrow3, IsWarmBlooded {
    @Override
    public int getMaximunDepth() {

        return 8;
    }

    @Override
    public Long getSpeed() {
        return 3L;
    }

    @Override
    public boolean hasScales() {
        String s = DEFAULT_TEMP + IsWarmBlooded.getName();
        return false;
    }

//    public static final String getName() {
//        return "";
//    }
}

class FieldMouse2 extends FieldMouse {
//    public static String getName() {
//
//    }
}