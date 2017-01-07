package test2.inheritance.q56;


//Consider the following code:

class A{
   A() {  print();   }
   void print() { System.out.println("A"); }
}

class B extends AA{
   int i =   4;
   public static void main(String[] args){
      AA a = new B();
      a.print();
   }
   void print() { System.out.println(i); }
}

//What will be the output when class B is run ?

/*
 * Note that method print() is overridden in class B. Due to polymorphism, the method to be executed is 
 * selected depending on the class of the actual object. Here, when an object of class B is created, 
 * first A's constructor is called, which in turn calls print(). Now, since the class of actual object 
 * is B, B's print() is selected. At this point of time, variable i has not been initialized 
 * (because we are still initializing A at this point), so its default value i.e. 0 is printed. 
 * This happens because the method print() is non-private, hence polymorphic. 
 * 
 * */
