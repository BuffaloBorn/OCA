package lamdas;
/*
 * Updated by BuffaloBorn on 11/18/2016
 * */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by vitaly on 18.08.15.
 */
public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public String toString() {
        return species;
    }

    public boolean isCanHop() {
        return canHop;
    }

    public boolean isCanSwim() {
        return canSwim;
    }
    
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        // list of animals     
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("salmon", true, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        System.out.println("Can only hop....");
        print(animals, a -> a.isCanHop());
        System.out.println();
        System.out.println("Can hop and swim....");
        print(animals, a -> a.isCanHop() && a.isCanSwim());

        Predicate<Animal> predicate = a -> a.isCanHop() && a.isCanSwim();
        DoubleCheckTrait checker = (a, s) -> s.startsWith("Checker");
        
        //Valid Lamdas
//         print(() -> true);                                       // 0 parameters
//         print(a -> a.startsWith("test"));                        // 1 parameter
//         print((String a) -> a.startsWith("test"));               // 1 parameter
//         print((a, b) -> a.startsWith("test"));                   // 2 parameters
//         print((String a, String b) -> a.startsWith("test"));     // 2 parameters

        //INVALID LAMDAS
//        print(a, b -> a.startsWith("test"));                 // DOES NOT COMPILE
//        print(a -> { a.startsWith("test"); });               // DOES NOT COMPILE
//        print(a -> { return a.startsWith("test") });         // DOES NOT COMPILE
    }

    public static  void print(List<Animal> animalList, CheckTrait checker) {
        for (Animal animal : animalList) {
            if (checker.test(animal)) {
                System.out.println(animal);
            }
        }

    }
}

interface CheckTrait {
    boolean test(Animal animal);
}

interface DoubleCheckTrait {
    boolean test(Animal animal, String s);
}

class CheckIfHopper implements CheckTrait {

    public boolean test(Animal animal) {
        return animal.isCanHop();
    }
}