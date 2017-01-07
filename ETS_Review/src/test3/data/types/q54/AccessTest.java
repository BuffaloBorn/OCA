package test3.data.types.q54;


//Note: This question may be considered too advanced for this exam.

//Which statements can be inserted at line 1 in the following code to make the program write x on the standard output when run?

/*public class q54{*/
public class AccessTest{
   String a = "x";
   static char b = 'x';
   String  c = "x";
   class Inner{
      String  a = "y";
      String  get(){
         String c = "temp";
         //c = c;
         //c = this.a;
         c = ""+AccessTest.b;
         c = AccessTest.this.a;
         c = ""+b;
         return c;
      }
   }

   AccessTest() { 
     System.out.println(  new Inner().get()  ); 
   }

   public static void main(String args[]) {  new AccessTest();  }
}
