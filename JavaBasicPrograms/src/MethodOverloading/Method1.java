package MethodOverloading;
//For static
public class Method1 {
	/**Method Overloading : any method declare more than once in class body with
	 * anyone of below rules:
	 * 1. type of below arguments differ or
	 * 2. number of arguments/paraameters should differ
	 * 3. position of arguments/parameter should differ
	 */
static double result;

static public void square() {
	System.out.println("Method with Zero parameter called..");
}

static public void square(int a) { 
	
	result= a * a ;
	System.out.println(" Method with integer parameter called.."+result);
}

static public void square(double b) {
	result = b * b ;
	System.out.println("Method with double parameter called ."+result);
}

	public static void main(String[] args) {
		square();     //directly called
		square(40);   //as static we can called directly or by using class name
	Method1.square(2.6f); //using class name method called
	Method1.square(5l); //method with long parameter absent but double called it
		// TODO Auto-generated method stub

	}

}
