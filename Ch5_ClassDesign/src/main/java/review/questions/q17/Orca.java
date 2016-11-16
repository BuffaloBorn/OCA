package review.questions.q17;

/*
 * Created by BuffaloBorn on 11/16/16
 * */
public class Orca extends Whale {

	public void dive(int depth) { System.out.println("Orca diving"); }

	@Override
	public void dive() {
		// TODO Auto-generated method stub
		System.out.println("Orca diving - no-aug");
	}

}
