package test4.inheritance.q02;


//What will be the result of attempting to compile and run class B?


class A{
   final int fi = 10;
}

public class B extends A{
   int fi = 15;
   public static void main(String[] args){
       B b = new B();
       b.fi = 20;
       System.out.println(b.fi);
       System.out.println(  (  (A) b  ).fi  );
   }
}
