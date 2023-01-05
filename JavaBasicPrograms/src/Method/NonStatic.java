package Method;

public class NonStatic {
double a=10, b=12;
// non static global variable
	public static void main(String[] args) {
		NonStatic R1 = new NonStatic();
		System.out.println("Non static global member a "+R1.a);
	    System.out.println("Non static global member b "+R1.b);
	    System.out.println("Sum of non static global member is "+R1.sumofnum(10,12));
	
		// TODO Auto-generated method stub

	}
	double sumofnum (int a, int b) {
		double res = a+b;
		return(res);
	}

}
