public class Egg {
    public Egg() { number = 5; }//Third execute the constructor

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
        long l = 0xFF_FF_FF_FF_FL;
        double d = 1.3;
        System.out.println(++d);
    }

    private int number = 3;//First, initialize fields and initialization blocks

    {number = 4; }//Second in order or appearance in code
}