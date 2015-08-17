/**
 * Created by vitaly on 17.08.15.
 */
public class Overloading {

    public static void main(String[] args) {
        foo();
        foo("123");
        foo("123", "123");
        foo(23.5);
//        foo(10); //double conversion int->Integer->Long
    }

    public static void foo(String... args) {
        System.out.println("Vararg");
    }

//    public static void foo(String value, Object value2) {
//        System.out.println("String Object");
//    }

    public static void foo() {
        System.out.println("Empty.");
    }

    public static void foo(Float aFloat) {
        System.out.println("Float.");
    }

    public static void foo(Double aDouble) {
        System.out.println("Double");
    }

    public static void foo(String string) {
        System.out.println("String");
    }
//    public static void foo(Object object) {
//        System.out.println("Object");
//    }
//    public static void foo(Integer integer) {
//        System.out.println("Integer");
//    }
    public static void foo(Long aLong) {
        System.out.println("Long");
    }
//    public static void foo(long along) {
//        System.out.println("long");
//    }
    public static void foo(Short aShort) {
        System.out.println("Short");
    }
//    public static void foo(Number number) {
//        System.out.println("Number: Type=" + number.getClass().getSimpleName() + " value=" + number);
//    }
//    public static void foo() {
//        System.out.println("");
//    }
//    public static void foo() {
//        System.out.println("");
//    }
//    public static void foo() {
//        System.out.println("");
//    }
//    public static void foo() {
//
//    }
}
