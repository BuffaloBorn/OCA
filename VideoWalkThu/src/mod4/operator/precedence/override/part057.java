package mod4.operator.precedence.override;

public class part057 {

	public static void main(String[] args) {
		
//		ex1();
//		ex2();
//		ex3();
//		ex4();	
		ex5();

	}
	
	
	private static void ex5() {
		part057 t = new part057();
		int p = t.getAnArray()[2];
		System.out.println("original p value: " + p);
		p = ++t.getAnArray()[2];
		System.out.println("new p value: " + p);
	}


	private static void ex4() {
		short s = 8, t = 9;
		//	s = s + t; -> cannot convert from int to short
		t = s++;
	}


	private static void ex3() {
		short s = 99;
		byte b = 10;
		int j = 0; 
		
		//s = b + s; -> cannot convert from int to short
		j = b + s;
	}


	private static void ex1() {
		
		int xa[] = {0,1,2,3,4};
		int idx = 0; 
		
		System.out.println(xa[idx++] >= 0 && idx > 0);
	}


	static void ex2(){
			
		int xa[] = {0,1,2,3,4};
		int idx = 0;
		xa[++idx] = xa[idx] + 1000;
		for(int v : xa){
			System.out.println("> " + v);
		}
	}
	
	public int[] getAnArray(){
		
		int xa[] = {0,1,2,3,4};
		
		return xa;
		
	}

}
