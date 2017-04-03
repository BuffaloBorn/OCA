package foundation.handling.exceptions.q78;

public class q78 {
	Object m1() {
		return new Object();
	}

	void m2() {
		String s = (String) m1();
	}

	public static void main(String[] args) {
		q78 obj = new q78();
		obj.m2();
		System.out.println(obj.m1() instanceof String);
	}
}
