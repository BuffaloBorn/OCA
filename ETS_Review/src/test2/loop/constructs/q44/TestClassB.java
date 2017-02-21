package test2.loop.constructs.q44;

//What will the following code print?
public class TestClassB{
        int x = 5;
        int getX(){ return x; }

        public static void main(String args[]) throws Exception{
            TestClassB tc = new TestClassB();
            tc.looper();
            System.out.println(tc.x);
        }
        
        public void looper(){
            int x = 0;
            int counter =0; 
            while( (x = getX()) != 0 ){
            	System.out.println("counter: " + counter);
            	System.out.println("x: " + x);
                for(int m = 10; m>=0; m--){
                    x = m;
                }
                counter++;
                if (counter == 200) {
                	System.exit(1);
                }
            }
            
       }     
}
