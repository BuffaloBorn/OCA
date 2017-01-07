package test2.opdec.constructs.q27;

public class q27 {

	public static void main(String[] args) {
		int s = 5;
		s += s + mx(s) + ++s;
		System.out.println(s);
	}
	
	static int mx(int s){
		for (int i = 0; i < 3; i++) {
			s =s +i;
		}
		return s;
	}

}