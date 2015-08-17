/**
 * Created by Vitaly on 16.08.2015.
 */
public class Varargs {
    public static void walk(int start, int... numbers) {
        System.out.println(numbers.length);
    }

    public static void main(String[] args) {
        walk(1); //numbers = new int[0]
        walk(1, 1);
        walk(1, 2, 3);
        walk(1, new int[]{1, 2,});
        walk(1, null); //throws NullPointerException
    }
}
