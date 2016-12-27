import java.time.LocalDate;
import java.time.Month;
import java.util.Locale;

/**
 * Created by Vitaly on 22.08.2015.
 */
public class ExcessiveExceptionHandeling extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -3888846598239246110L;

    public static void main(String[] args) {
        foo();
//        try {
//            foo();
////            throw new ExcessiveExceptionHandeling();
//        } catch (ExcessiveExceptionHandeling e) {
//            System.out.println(e);
//        }

    }

    public static void foo() {
        int g = 1;
        char f = '4';
        LABEL: for (int i = 0; i < 8; i++) {
            continue LABEL;
        }
        switch (f) {
            default:
                case ' ':
            case 'c':
                System.out.println("sdf");
        }

//        String s = "".charAt(0);
//        s += f > 4 ? "greater" : false;
//        do
//            System.out.println();
//         while (true);
        System.out.println(LocalDate.of(2015, Month.APRIL, 30).of(1986, Month.AUGUST, 13).plusMonths(-1).plusYears(10));
    }
}
