package test2.data.types.q52;
//How many objects have been created by the time the main method reaches its end in the following code?

public class Noobs {
	static int count;
    public Noobs(){
    	count++;
        try{
            throw new MyException();
        }catch(Exception e){
        }
    }
    public static void main(String[] args) {
        Noobs a = new Noobs();
        Noobs b = new Noobs();
        Noobs c = a;
        System.out.println("count:" + count);
    }
}
class MyException extends Exception{
    
}
