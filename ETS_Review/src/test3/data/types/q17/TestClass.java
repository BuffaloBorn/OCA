package test3.data.types.q17;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

        //al.add(111);
        System.out.println(al.indexOf(1.0));
        /* indexOf's accepts Object as a parameter. Although 1.0 is not an object, 
        it will be boxed into a Double object.
        */
        
        
        System.out.println(al.contains("string"));
        
        /* Double d = al.get(al.length);
         * ArrayList does not have a field named length. It does have a method named size() 
         * though. So you can do: Double d = al.get(al.size()); It will compile but will 
         * throw IndexOutOfBoundsException at run time in this case because al.size() will 
         * return 0 and al.get(0) will try to get the first element in the list.
         */
     }
}

/*
 * Note that al is declared as ArrayList<Double>, 
 * therefore the add method is typed to accept only a Double. 
 * */
