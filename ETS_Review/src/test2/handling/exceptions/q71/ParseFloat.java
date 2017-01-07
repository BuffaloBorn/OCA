package test2.handling.exceptions.q71;


//What can be done to get the following code to compile and run? (Assume that the options are independent of each other.)


public class ParseFloat{
	
	public float parseFloat(String s){
		
	     float f = 0.0f;      // 1
	     try{
	          f = Float.valueOf( s ).floatValue();    // 2
	         // return f ;      // 3
	     }
	     catch(NumberFormatException nfe){
	        f = Float.NaN ;    // 4
	       //return f;     // 5
	     }
	     finally {
	       //  return f;     // 6
	     }
	     //return f ;    // 7
		return f;
	  }

	
}
