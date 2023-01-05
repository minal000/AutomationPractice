package Method;

public class Method_2 {
	public static void main(String[] args) {
		addnumbers (45, 46);         // directly called by method
		addnumbers (100, 104);
		Method_2.addnumbers(34, 78);    //called using class name
		Method_2.addnumbers(46, 89);

}
	static double addnumbers (int a, int  b) {
		int result = a + b;
		System.out.println("Value of a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Addition of two numbers is "+result);
		return (result) ;
	}
	
}


