/**
 * Created by Vitaly on 22.08.2015.
 */
public class TryInFinally {
    static {int i = 5 / 0;}
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new NullPointerException();
        } finally {
            try {
                System.out.println(1);
                throw new ArrayIndexOutOfBoundsException();
//                System.out.println(2);
            } catch (Throwable e) {
                System.out.println("Exceptin catcht");
                throw new RuntimeException(e);
            }
        }
    }
}
