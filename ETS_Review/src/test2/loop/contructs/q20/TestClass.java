package test2.loop.contructs.q20;

public class TestClass {

	public static void main(String[] args) {
		int k = 0;
		int m = 0;
		for (int i = 0; i <=3; i++) {
			k++;
			if(i == 2){
				//i = 4;     //-> 3,3
				//i=m++;     //-> 4,5
				continue;  //-> 3,3
				//break;		 //-> 3,2
			}
			m++;
		}
		System.out.println(k + "," + m);
	}

}
