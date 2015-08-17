/**
 * Created by vitaly on 17.08.15.
 */

import static initialization.A.*;

public class InitializationOrder {
    private String name = "Torchie";                    //5
    { System.out.println(name); }                       //6

    private static int COUNT = 0;                       //1
    static { System.out.println(COUNT); }               //2
    {COUNT++; System.out.println(COUNT);}               //7

    public InitializationOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
//        A a; //requared an import initialization.A;
        System.out.println("read to constructor" + COUNTER);       //3
        new InitializationOrder();                       //4
    }
}

