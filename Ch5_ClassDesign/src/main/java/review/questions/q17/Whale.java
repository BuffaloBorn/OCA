package review.questions.q17;

/*
 * Created by BuffaloBorn on 11/16/16
 * */
public abstract class Whale {
	public abstract void dive() /* {} */;

	public static void main(String[] args) {
		Whale whale = new Orca();
		whale.dive();
	}
}
