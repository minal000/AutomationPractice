package ObjectClass;
class Demo1{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Example2 extends Demo1 {
	static int last_roll = 100;
	int roll_no;
	
	Example2()               //constructor
	{
		roll_no = last_roll ;
		last_roll++ ;
	}

	public static void main(String[] args) {
		Example2 d = new Example2();
		//below two statements are equivalent
		System.out.println(d);               //String representation of an object
		System.out.println(d.toString());
		System.out.println(d.hashCode());  //it converts hexadeciamal address in to decimal and return the value
		
		System.out.println("************************************************");
		
		Demo1 d2 = new Demo1();
		System.out.println(d2);                      //String representation of an object
		System.out.println(d2.toString());
		System.out.println(d2.hashCode());          //it converts hexadeciamal address in to decimal and return the value
		 
		// TODO Auto-generated method stub

	}

}
