package test5.inheritance.q16;

class Super { static String ID = "QBANK"; }

class Sub extends Super{
   static { System.out.print("In Sub"); }
}
public class Test{
   public static void main(String[] args){
	  // Sub o = new Sub();
      System.out.println(Sub.ID);
   }
}

//What will be the output when class Test is run?
