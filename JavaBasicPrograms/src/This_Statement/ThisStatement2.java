package This_Statement;
class A2 {
	 
	A2() {
		  this( 5); 
		  System.out.println("Hello a");
	}
	A2(int x) {
		System.out.println("x");
		System.out.println("Value of x "+x);
	}
}


public class ThisStatement2 {

	public static void main(String[] args) {
		A2 a = new A2(10);
		System.out.println("==============================================");
		A2 b =  new A2();
		// TODO Auto-generated method stub

	}

}
