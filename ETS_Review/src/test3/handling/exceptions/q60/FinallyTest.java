package test3.handling.exceptions.q60;


//Considering the following program, which of the options are true?

public class FinallyTest{
   public static void main(String args[]){
      try{
          if (args.length == 0) return;
          else throw new Exception("Some Exception");
      }
      catch(Exception e){
          System.out.println("Exception in Main");
          //System.exit(0);
      }
      finally{
          System.out.println("The end");
      }
   }
}

