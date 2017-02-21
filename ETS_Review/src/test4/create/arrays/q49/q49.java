package test4.create.arrays.q49;

import java.util.ArrayList;

public class q49 {

	public static void main(String[] args) {
		Object a[] = new Object[] {"aaa", new Object(), new ArrayList(), 10};
		//Object b[] = new Object[] {"aaa", new Object(), new ArrayList(), {}};
		Object arr[][] = new Object[][]{new String[5], {}}; // assigns valid Object[] object of length 0 to arr[1].
		Object c[] = new Object[]{"aaa", new Object(), new ArrayList(), new String[]{""}};
		//Object d[] = new Object[1]{new Object()};
	}

}
