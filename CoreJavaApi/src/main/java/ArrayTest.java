import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaly on 13.08.15.
 */
public class ArrayTest {
    public static void main(String[] args) {
        String[] strings = {"1", "2", "3"};
        Object[] objects = strings;
//        objects[0] = new Object(); //ArrayStoreException

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

    }
}
