package polymorphism.objectVsReference;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
import polymorphism.Lemur;

public class ObjectVsReference {

	public static void main(String[] args) {
		
		Lemur lemur = new Lemur();
		Object lemurAsObject = lemur;
		
		try {
			String string = (String) lemurAsObject;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
