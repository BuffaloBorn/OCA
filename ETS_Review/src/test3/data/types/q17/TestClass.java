package test3.data.types.q17;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

        //al.add(111);
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));
        //Double d = al.get(al.length);
     }
}

/*
 * Note that al is declared as ArrayList<Double>, 
 * therefore the add method is typed to accept only a Double. 
 * */
