import java.lang.reflect.Field;

/**
 * Created by vitaly on 10.08.15.
 */
public class StringTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.    If both operands are numeric, + means numeric addition.
        //2.    If either operand is a String, + means concatenation.
        //3.    The expression is evaluated left to right.

        String s = null;
        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c
        System.out.println("" + 1 + 2 + "c");     // 12c   !!!!
        System.out.println(s + 2 + 2 * 2 + "c");     // null24c   !!!!
        System.out.println(2 + (s = "c" + 3 * 2));

        System.out.println("-----------------------------------------");

        s = "Animals";
        System.out.println(s);
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));
//        System.out.println(s.charAt(7));  // throws exception

        System.out.println("-----------------------------------------");

        //How to set String value accesible
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);
        char[] stringValue = (char[]) field.get(s);
        stringValue[0] = 'a';
        System.out.println(s);

        System.out.println("-----------------------------------------");

        System.out.println(s.indexOf('a')); // 0
        System.out.println(s.indexOf("al")); // 4
        System.out.println(s.indexOf('a', 4)); // 4
        System.out.println(s.indexOf("al", 5)); // -1

        System.out.println("-----------------------------------------");

        System.out.println(s.substring(4) == s.substring(4)); //false cause method substring create a new String instance
        System.out.println(s.substring(3)); //mals
        System.out.println(s.substring(3, 4)); //m
        System.out.println(s.substring(3, 7)); //mals
        System.out.println(s.substring(s.indexOf('m'))); //mals
        System.out.println(s.substring(3, 3)); // empty string
        System.out.println(s.substring(7)); // empty string

        System.out.println("-----------------------------------------");

        System.out.println("abc".trim());           // abc
        System.out.println("\t   a b c\n  ".trim()); // a b c
        System.out.println((int)'\t' + "-" +(int)'\n');

        System.out.println("-----------------------------------------");

        System.out.println("aniMal   ".trim().toLowerCase().replace('a', 'A'));

        System.out.println("-----------------------------------------");

        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);
        }

        System.out.println(sb);

        sb = new StringBuilder("1234");
        sb.append("abcde".toCharArray(), 3, 1); //123d
        sb.append("abcde", 3, 4); //123dde
        sb.append('A'); //123ddeA
        sb.append((int)'A'); //123ddeA65
        sb.append((long)'A'); //123ddeA6565
        sb.append(3.2333); //123ddeA65653.2333
        sb.appendCodePoint(65); //123ddeA65653.2333A
        sb.insert(1, "$"); //1$23ddeA65653.2333A inserts before offset
//        System.out.println(sb.capacity());
        sb.delete(4, sb.length());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb);

        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");




    }
}