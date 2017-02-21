package test4.data.types.q41;

//Given:
public class Bandwidth{
    public int available = 0;
    public int getAvailable(){
        return available;
    }
    public Bandwidth(int quota){
        this.available = quota;
    }
    public void addMore(int more){
        available += more;
    } 
    
    
  //and another piece of code from another class:
    
    //and another piece of code from another class:
	
	public static void main(String args[]){
		Bandwidth bw = new Bandwidth(100);
	     //INSERT CODE HERE
		 //What can be inserted in the code above so that it will print 0?
		 //1. bw(0);
		//bw.available = 0;
		//3. bw.setAvailable(0);
		//4. bw = new Bandwidth();
		/*5.*/ bw.addMore(-bw.getAvailable());
		/*6. --bw.available;*/
		
		System.out.println(bw.getAvailable());
	}
   
}
