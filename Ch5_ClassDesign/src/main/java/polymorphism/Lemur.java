package polymorphism;
/*
 * Created by BuffaloBorn on 11/15/16
 * */
public class Lemur extends Primate implements HasTail {
	public int age = 10;

	@Override
	public boolean isTailStriped() {
		return false;
	}
}