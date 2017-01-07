package test3.methods.q39;


//What will be the result of attempting to compile and run the following class?

public class InitTest{
   static String s1 = sM1("a");{
      s1 = sM1("b");
   }
   static{
      s1 = sM1("c");
   }
   public static void main(String args[]){
      InitTest it = new InitTest();
   }
   private static String sM1(String s){
      System.out.println(s);  return s;
   }
}
