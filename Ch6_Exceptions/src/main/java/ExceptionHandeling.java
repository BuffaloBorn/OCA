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

	/**
	 * 
	 */
	private static final long serialVersionUID = -8016246380987393560L;
}

class ExhibitClosed extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6066878022293509404L;
}

class ExhibitClosedForLunch extends ExhibitClosed {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4604554296074088598L;
}