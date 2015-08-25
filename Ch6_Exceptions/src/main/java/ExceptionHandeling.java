/**
 * Created by Vitaly on 22.08.2015.
 */
public class ExceptionHandeling {
    public static void main(String[] args) {
        try {
            seeAnimal();
        } catch (AnimalsOutForAWalk e) {// first catch block
            System.out.print("try back later");
        } catch (ExhibitClosedForLunch e) {
            System.out.print("not today1");
        } catch (ExhibitClosed e) {// second catch block
            System.out.print("not today2");
        }
    }

    public static void seeAnimal() {
    }
}


class AnimalsOutForAWalk extends RuntimeException {
}

class ExhibitClosed extends RuntimeException {
}

class ExhibitClosedForLunch extends ExhibitClosed {
}