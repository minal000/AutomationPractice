package MethodOverloading;

class adder {
	
	public static double add(int a, int b) {
		return (a+b);
		
	}
	
	public static double add(float a, int b) {
		return (a+b);
	}
}

public class Method2 {

	public static void main(String[] args) {
		double A1 = adder.add( 22,24 );  //here we store addition in A1 variable , and printing that
		double A2 = adder.add(12f, 12);
		System.out.println("Addition of a and b "+A1);
		System.out.println("Addition of a and b "+A2);
		
		// directly can print
		System.out.println(adder.add(10, 10));
		System.out.println(adder.add(13f,14));
		// TODO Auto-generated method stub

	}

}
