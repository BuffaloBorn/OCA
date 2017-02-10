package test4.handling.exceptions.q36;

//What will be the result of compiling and running the following program ?
class NewException extends Exception {}

class AnotherException extends Exception {}

public class ExceptionTest{
    public static void main(String[] args) throws Exception{
        try{
            m2();
        }
       
        finally{
            m3();
        }
        //catch (NewException e){}
        
        /*Because a catch block cannot follow a finally block!*/
       
    }

    public static void m2() throws NewException { throw new NewException(); }

    public static void m3() throws AnotherException{ throw new AnotherException(); }

}
