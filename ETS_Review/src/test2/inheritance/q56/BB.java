package test2.inheritance.q56;



//Consider the following code:

class AA{
   AA() {  print();   }
   void print() { System.out.println("A"); }
}
class BB extends A{
	//final int i =   4;
	int i = 4;

   public static void main(String[] args){
      A a = new BB();
      a.print();
   }
   void print() { System.out.println(i); }
}

/*What will be the output when class B is run ?*/

// Remember that Java does dynamic method invocation
// Even through the reference variable 'a' is of type class 'A' 
// object 'B' is assigned to reference variable 'a' so all the methods of 
// class 'B' is called on reference variable 'a'. In the case, 
// if instance variable 'i' is declared in the class 'B' it will 
// hold the default values unless it was declared as a 'final' instance variable 
// in the that case it will have the assigned values during the initialize phase
