package test5.methods.overloading.q40;


//What should be placed in the two blanks so that the following code will compile without errors:

class XXX{
    public void m() {
        throw new RuntimeException();
    }
}

//Original code snippet 
//class YYY extends XXX{
//    public void m() throws Exception{
//      throw new Exception();
//    }
//}

class YYY extends XXX{
    public void m() throws NumberFormatException{
      throw new NumberFormatException();
    }
}
public class TestClass {
    public static void main(String[] args) {
        XXX obj = new XXX();
        obj.m();
    }
}