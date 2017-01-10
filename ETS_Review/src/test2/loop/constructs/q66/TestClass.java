package test2.loop.constructs.q66;


//What can you do to make the following code compile?

public class TestClass {
    public static void main(String[] args) {
        int[] values = { 10, 20, 30 };
        
        for(int k : values){}
        //for(int k in values){}  ->  Syntax error on token "in"
        //for(int k; k<0; k++){} -> -> k must be initialized first. So it should be: int k=0; k<0; k++
        for(;;){}
        //for(; k<values.length;k++){} -> k needs to be declared first.
    }
}
