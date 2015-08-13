/**
 * Created by Vitaly on 09.08.2015.
 */
public class TestClass {

//    private static final String STRING = "0";

    public static void main(String[] args) {
//        double d = 1599999999.33333333333333333333333333333333333333333333333333333333;
//        long l = 999_999_999_999_999_999L;
//        System.out.println(2147483647 + 1);  // -2147483648
////        System.out.println(2147483648);  // wrong integer
//
//        short x = 10;
//        short y = 3;
////        short z = x * y;  // DOES NOT COMPILE x(int) * y(int) = int
//
//        boolean b = true || (++y < 4);
//        System.out.println(b);
//        System.out.println(y);

//        int y = 10;
//        int x = (y > 5) ? 2 * y : 3 * y;
//        final String STRING = "0";
//        String i = new String("0");
//        System.out.println(i == "1234567");
//        switch (i) {
//
//            case STRING:
//                System.out.println(i + "0");
//            default:
//                System.out.println("default");
//                break;
//            case "1":
//                System.out.println(i + "1");
//
//            case "1234567":
//                System.out.println(i + "2");
//        }
        int x = 1, y = 1, z = 1, n = 1;
//        n = x += 2 * ++z * z++ / (z -= 1 > n || z++ >3 ? ++z:z++);
//             0            0
//        n = ((z -= 1) > n || z++ >3 ? ++z:z++);
//          6   1 5  2  4  3
//        n = z++ + ++z * z++;
//        n = z++ * ++z + z++;
//        n = z++ * ++z + (z++ > 4 && ++z < 2?z++:++z);
        n = ++z - z++;
        byte a = 2, b = 5;
        byte c = (byte) ((byte) a + b);
        System.out.println(n);
    }
}
