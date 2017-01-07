package test1.data.types.q61;

public class CastTest {
	public static void main(String args[]) {
		byte b = -127;
		int i = b;
		b = (byte) i;
		System.out.println(i + " " + b);
	}
}
