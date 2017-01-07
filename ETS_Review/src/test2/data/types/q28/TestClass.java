package test2.data.types.q28;

public class TestClass {

	public static void main(String[] args) {
		
		boolean a;
		if(a = (Boolean.parseBoolean("true") == true)){System.out.println("a: " + a);} else{System.out.println("a: " + a);};
		
		boolean b;
		if(b = (Boolean.parseBoolean("TrUe") == new Boolean(null))){System.out.println("b: " +b);}else{System.out.println("b: " + b);};
		
		boolean c;
		if( c =(new Boolean("TrUe") == new Boolean(true))){System.out.println("c: " +c);}else{System.out.println("c: " + c);};

		//boolean d;
		//if(d=(new Boolean() == false)){System.out.println(d);}
		
		boolean e;
		if(e = new Boolean("true") == Boolean.TRUE){ System.out.println("e: " +e);}else{System.out.println("e: " + e);};
		
		boolean f;
		if(f = (new Boolean("no") == false)){ System.out.println("f: " +f);}else{System.out.println("f: " + f);};

	}

}
