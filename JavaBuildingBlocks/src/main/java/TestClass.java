/**
 * Created by vitaly on 10.08.15.
 */
public class TestClass {
    public static void main(String[] args) {
        typeImplicitCasting();
    }

    private static void typeImplicitCasting() {
//        float value1 = 102;
//        float value2 = (int)102.0;
//        float value3 = 1f * 0.0;
//        float value4 = 1f * (short)0.0;
//        float value5 = 1f * (boolean)0;
//        float f = 10.2f % 3.1f;
//        byte b = (byte) 1245;
//        System.out.println(f);
//        System.out.println(b);
        double d = 1599999999.33333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333;

//        float f = 15999999999;
    }

}

interface I {
    void getI();
}

interface J {
    void getI();
}

abstract class AC implements I, J {
//    public void getI(){};
}

class C extends AC{
    @Override
    public void getI() {

    }
}
