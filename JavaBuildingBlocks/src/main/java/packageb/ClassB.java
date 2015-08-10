package packageb;

import org.apache.commons.collections4.bag.HashBag;
import packagea.ClassA;
/**
 * Created by Vitaly on 09.08.2015.
 */
//command to compile this code
//javac -cp ".;D:\Java\OCA\JavaBuildingBlocks\commons-collections4-4.0.jar" packageb/ClassB.java
//command to start the code
//java -cp ".;D:\Java\OCA\JavaBuildingBlocks\commons-collections4-4.0.jar" packageb.ClassB
public class ClassB {
    public static void main(String[] args) {
        ClassA a;
        System.out.println("Go it!");
        HashBag<String> bag = new HashBag<String>();
        bag.add("Hello", 3);
        bag.add("World", 2);
        System.out.println(bag);
    }
}
