package MethodOverloading;

public class SimpleInterest {
	static double p, r, t ;

	public static void main(String[] args) {
		Method();
		double A =SimpleInterest.Method( 12000, 5, 3 );
		double B =SimpleInterest.Method(20000, 5.5f , 3 );
		//System.out.println(SimpleInterest.Method());
		System.out.println("Simple interest " +A);
		System.out.println("Simple interest "+B);
		
		// TODO Auto-generated method stub

	} 
	public static double Method (int p, float r, int t) {
		double interest1 = (p*r*t)/100;
		return (interest1);
		}
	public static double Method (int p, int r, int t) {
		double interest2 = (p*r*t)/100;
		return interest2;
	}
	static void Method() {
		double interest3 = (p*r*t)/100;
		//return;
	}

}
