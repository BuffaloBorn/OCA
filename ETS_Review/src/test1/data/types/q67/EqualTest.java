package test1.data.types.q67;


//Note: Although Wrapper classes are not explicitly mentioned in the exam objectives, we have seen some candidates get questions on this aspect of Wrapper classes.

//What will be the output of the following program?

public class EqualTest{
   public static void main(String args[]){
      Integer i = new Integer(1) ;
      Long m = new Long(1);
      if( i.equals(m)) System.out.println("equal");   // 1
      else System.out.println("not equal");
   }
}

