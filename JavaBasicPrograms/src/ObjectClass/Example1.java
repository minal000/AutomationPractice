package ObjectClass;

class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class Example1 extends Demo {
	static int last_roll = 100;
	int roll_no;
	
	Example1()               //constructor
	{
		roll_no = last_roll ;
		last_roll++ ;
	}
//Driver code
	public static void main(String[] args) {
		Example1 d = new Example1();
		//below two statements are equivalent
		System.out.println(d);           //java compiler writes-->s.toString() ---->string representation of an object
		System.out.println(d.toString());  //String representation of an object
		
		System.out.println("******************************************");
		
		Demo d1 = new Demo() ;
		System.out.println(d1);   //d1.toString();
		
		System.out.println("*********************************************");
		
		Demo d2 = new Demo();
		System.out.println(d2);   //d2.toString();
		
		System.out.println("********************************************");
		
		Demo d3 = new Example1();
		System.out.println(d3);  //d3.toString();
		
		
		// TODO Auto-generated method stub
/**String  representation--->fullyqualifiedclassname@hexadecimaladdress
 *packagename.classname@hexadeciamaladdress
 * 
 */
	}

}
