package test2.loop.contructs.q44;

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
            while( (x = getX()) != 0 ){
                for(int m = 10; m>=0; m--){
                    x = m;
                }
            }
            
       }     
}
