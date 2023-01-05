package FinalKeyword;
class A0 {
	static int a = 50 ;
	final double b = 60 ;
}
public class Final2 {

	public static void main(String[] args) {
		System.out.println("Value of a is "+A0.a);
		
		A0 obj = new A0() ;
		System.out.println("Value of b is "+obj.b);
		
	//	obj.b = 70 ;           //this shows error as b is declared with final keyword , it is constant,c
		                           //and here we are trying to change itS
		// TODO Auto-generated method stub

	}

}
