import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vitaly on 10.08.15.
 */
public class TestClass {
    public static void main(String[] args) {
        typeImplicitCasting();
    }

    public static void foo(Object... ints) throws IllegalArgumentException {
        System.out.println(Arrays.toString(ints));
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
        foo(new Integer[]{1,2,3}, new float[]{1,2,3});
        char c = 'A';
        "S".substring(1, 1);
        new StringBuilder();
//        List<Integer> list = new ArrayList<>();
//        list.add(null);
        List<String> list = Arrays.asList("30", "8", "3A", "FF");
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list, "8"));
        System.out.println(Collections.binarySearch(list, "4F"));

//        do {
//            int i = 0;
//        } while (i < 10);
//        boolean bb = "" == 7;
//        short st = c;
        int i = 123456789;
        double d1 = 011;
        System.out.println(d1);
        float f = i;
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
