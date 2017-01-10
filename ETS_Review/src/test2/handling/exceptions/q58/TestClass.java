package test2.handling.exceptions.q58;

//What will be the result of attempting to compile and run the following program?
class TestClass{
   public static void main(String args[]){
	  int i = 0;
      
      loop :         // 1
      {
         System.out.println("Loop Lable line");
         try{
            for (  ;  true ;  i++ ){
               if( i >5) break loop;       // 2
            }
         }
         catch(Exception e){
            System.out.println("Exception in loop.");
         }
         finally{
            System.out.println("In Finally");      // 3
         }
      }
   }
}

/*
 * You can apply a label to any code block or a block level statement (such as a for statement) 
 * but not to declarations. For example: loopX : int i = 10;
 * 
 * A break without a label breaks the current loop (i.e. no iterations any more) and a break 
 * with a label tries to pass the control to the given label. 'Tries to' means that if the 
 * break is in a try block and the try block has a finally clause associated with it then it 
 * will be executed.
 * */
