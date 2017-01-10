package test2.loop.constructs.q44;


//What will the following code print?

public class q44{
        int x = 5;
        int getX(){ return x; }

        public static void main(String args[]) throws Exception{
        	q44 tc = new q44();
            tc.looper();
            System.out.println(tc.x);
        }
        
        public void looper(){
          //  int x = 0;
            while( (x = getX()) != 0 ){
                for(int m = 10; m>=0; m--){
                    x = m;
                }
            }
            
       }     
}
