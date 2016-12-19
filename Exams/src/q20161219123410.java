
public class q20161219123410 {

	public static void main(String[] args) {
		String numbers = "2468";
		int total = 0;
		total += numbers.indexOf("6");
		total += numbers.length();
		char ch = numbers.charAt(4);
		System.out.println(total + " " + ch);
	}

}
