/**
 * Created by Vitaly on 21.08.2015.
 */
//        1.  Casting an object from a subclass to a superclass doesn’t require an explicit cast.
//        2.  Casting an object from a superclass to a subclass requires an explicit cast.
//        3.  The compiler will not allow casts to unrelated types.
//        4.  Even when the code compiles without issue, an exception may be thrown at runtime
//            if the object being cast is not actually an instance of that class.
public class Polimorphism {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Primate primate = lemur;
        Lemur lemur1 = (Lemur) primate;
        Object objectLemur = lemur;
        try {
            String string = (String) objectLemur;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Primate {
    public boolean hasTail() {
        return true;
    }
}

interface HasTail {
    boolean IsTailStriped();
}

class Lemur extends Primate implements HasTail {
    public int age = 10;
    @Override
    public boolean IsTailStriped() {
        return false;
    }
}