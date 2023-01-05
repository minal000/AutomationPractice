package Oops_Interface;

interface Printable1 {
	void print() ;   //by default public abstract
}

interface Showable1 {
	void print();   //by default public abstract
}

public class Interface4 implements Printable1, Showable1 {  //if two interface implement at the same time which having same method then
                                                            //implementation of that common method occurs one time in child class 
	public void print() {
	 System.out.println("Hello...");
 }
	public static void main(String[] args) {
		Interface4 obj = new Interface4();
		obj.print();
		
		Showable1 obj1 = new Interface4();
		obj1.print();
		
		Printable1 obj2 = new Interface4();
		obj2.print();
		
		// TODO Auto-generated method stub

	}

}
