import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class MockLamda {

	public static void main(String[] args) {
		main1();
		main2();
	}
	
	public static void main2(){
		ArrayList<Data> al = new ArrayList<Data>();
		
		Data d = new Data(1); al.add(d);
        d = new Data(2); al.add(d);
        d = new Data(3); al.add(d);

       // filterData(al, d -> d.value%2 == 0 );
        filterData(al, (Data x) -> x.value%2 == 0 );
       // filterData(al, (Data y) -> y.value%2  );
       // filterData(al, d -> return d.value%2 ); 
       System.out.println(al);
	}
	
	public static void main1() {

		ArrayList<Data> al = new ArrayList<Data>();
		al.add(new Data(1));
		al.add(new Data(2));
		al.add(new Data(3));

		printUsefulData(al, (Data d) -> {
			return d.value > 2;
		});
		printUsefulData(al, d -> d.value > 2);
		// printUsefulData(al, (d)-> return d.value>2;  );
		// printUsefulData(al, Data d-> d.value>2  );
		// printUsefulData(al, d -> d.value>2;   );
	}
	
	public static void printUsefulData(ArrayList<Data> dataList, Predicate<Data> p) {
		for (Data d : dataList) {
			if (p.test(d))
				System.out.println(d.value);
		}
	}

	public static void filterData(ArrayList<Data> dataList, Predicate<Data> p) {
		Iterator<Data> i = dataList.iterator();
		while (i.hasNext()) {
			if (p.test(i.next())) {
				i.remove();
			}
		}
	}

}
