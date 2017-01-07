package test2.data.types.q45;

//Given the following class, which statements can be inserted at line 1 without causing the code to fail compilation?

public class TestClass{
   int a;
   int b = 0;
   static int c;
   public void m(){
      int d;
      int e = 0;
      a++;
      b++;
      c++;
      //d++;
      e++;
   }
}

// remember that variables are initialized at different level in the class level;  instance, class and locale 
// Local variables needs to be initialized before using them, not for instance and class variables. 