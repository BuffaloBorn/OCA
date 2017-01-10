package test2.data.types.q36;

//What can be done to make this code compile and run?

//Given:
public class Square {
    private double side = 0;  // LINE 2
    //replace LINE 2 with: private int side = 0; 
    // replace LINE 2 with: public int side = 0;
  
    public static void main(String[] args) {   // LINE 4
        Square sq = new Square();  // LINE 5
        // replace LINE 5 with: double sq = new Square();
        
        //side = 10;  // LINE 6
        
        //replace LINE 6 with: sq.side = 10;
   }
}



/*
 * side is not a "global variable" that you can access directly (Note that Java doesn't have the concept of 
 * a global variable). side is an instance field in Square class, which means, only objects of Square class 
 * will have this field. Therefore, you need to specify which Square object's side you are trying to access. 
 * You are doing that here by using the reference sq that points to an instance of Square class.  
 * 
 * Remember that private members of a class are accessible from the same class. The main method is within 
 * Square class and that is why you can access the side field of Square class from this method.  An integer 
 * can be assigned to a double without a cast but not vice versa.
 * 
 */