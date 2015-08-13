import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vitaly on 11.08.15.
 */
public class Loop {
    public static void main(String[] args) {
        //1. initialization
        //2. if boolean expretion is true
        //3. execute body statement
        //4. modify expretion
        //5. return to step 2

        //Infinity for
//        for (; ;) {
//            System.out.println("Infinity");
//        }

        //Multiple terms in for loop
        int x = 0;
        String s = String.valueOf(x += 1);
        for (long y = x += 1, z = 2; y < 5 && y < 10; x++, y++, s += "a") {
            System.out.print(y);
        }

        System.out.println(x);

        //Duplicate declaration before loop
//        int x = 0;
//        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++) {   // DOES NOT COMPILE
//            System.out.print(x + " ");
//        }

        //Declaration before loop
        int z;
        long y;
        for (y = 0, z = 4; z < 5 && y < 10; z++, y++) {
            System.out.print(z + " ");
        }

        System.out.println();

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Integer item = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext() && (((item = iterator.next()) != null) || true)) {
            System.out.println(item);
        }

        System.out.println();

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        OUTER_LOOP:
        for (int[] simpleArray : myComplexArray) {
            INNER_LOOP:
            for (int index = 0; index < simpleArray.length; index++) {
                int value = simpleArray[index];
//                if (value == 1)
//                    continue;
                System.out.print(value + "\t");
            }
            System.out.println();
        }

        System.out.println();

        SECTION:
        {
//        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
            OUTER_LOOP:
            for (int[] simpleArray : myComplexArray) {
                INNER_LOOP:
                for (int index = 0; index < simpleArray.length; index++) {
                    int value = simpleArray[index];
                    if (value % 2 == 0) {
//                    continue OUTER_LOOP;
//                    break OUTER_LOOP;
                        break SECTION;
                    }
//
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
            System.out.println("end of loop...");
        }
        System.out.println("end of section.");

        int x1 = 50, x2 = 75;
        boolean b = x1 >= x2;
        if (b = true)
            System.out.println("Success");
        else
            System.out.println("Failure");

        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }

        System.out.println(count);


    }

}

