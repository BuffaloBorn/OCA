package test3.java.api.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {

//What will the following code snippet print?

        List s1 = new ArrayList( );
        try{
            while(true){
                s1.add("sdfa");
            }
        }catch(OutOfMemoryError o){
           System.out.println("OutOfMemoryError!!");
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(s1.size());


	}

}
