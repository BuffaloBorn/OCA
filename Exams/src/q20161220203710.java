
public class q20161220203710 {

	public static void main(String[] args) {
	int x = 5;
	int count = 0;
	while (x >= 0 ) {
		System.out.println("x: "+x);
		int y = 3;
		
		while (y > 0 ) {
			System.out.println("y: "+y);
			count++;
			System.out.println("count: "+count);
			if(count == 10)			
				System.exit(0);
			System.out.println("continue --x: "+x);
			if(x<2) continue;
			x--;y--;
			System.out.println(x*y+" =====");
		}
		
	}

	}

}
