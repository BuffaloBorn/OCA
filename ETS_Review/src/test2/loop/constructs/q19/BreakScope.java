package test2.loop.constructs.q71;

public class BreakScope {

	public static void main(String[] args) {
		int c = 0;
		JACK: while(c<0){
			JILL:System.out.println(c);
			if(c<0) break JACK;	else c++;
		}
	}

}
