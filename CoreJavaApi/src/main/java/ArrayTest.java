import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vitaly on 13.08.15.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3"};
        Object[] objects = strings;
//        objects[0] = new Object(); //ArrayStoreException

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(123);
        list.add(1);
        System.out.println(list); //[10, 11, 2]
        list.remove(1); //removed element with index 1 (123)
        list.remove(new Integer(10)); //removed first entrence of object (10)
        System.out.println(list); //[1]

        Integer[] ints = {1, 836, 634, 92, 7, 963, 5, 9, 3, 98, 358,};
        List integers = Arrays.asList(ints);
        System.out.println("Before sorting:");
        System.out.println("integers = " + Arrays.toString(integers.toArray()));
        System.out.println("ints = " + Arrays.toString(ints));

        Arrays.sort(ints);

        System.out.println("Afrer sorting:");
        System.out.println("integers = " + Arrays.toString(integers.toArray()));
        System.out.println("ints = " + Arrays.toString(ints));

        //Wrappers
        Byte aByte = new Byte((byte) 4);
        Byte aByte1 = Byte.parseByte("4");
        Byte aByte2 = Byte.valueOf("7");
        byte b = Byte.valueOf("10");




    }
}
