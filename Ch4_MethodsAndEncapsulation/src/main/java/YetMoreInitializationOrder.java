/**
 * Created by vitaly on 17.08.15.
 */
public class YetMoreInitializationOrder {
    static {add(2);}
    static void add(int num) { System.out.println(num + " "); }

    public YetMoreInitializationOrder() {add(INIT); }
    static {add(4);}
    {add(6);}
    static {new YetMoreInitializationOrder();}

    static int INIT = 10;
    static {add(13);}
    {add(8);}

    public static void main(String[] args) {

    }
}
