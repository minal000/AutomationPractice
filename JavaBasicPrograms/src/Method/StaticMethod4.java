package Method;

public class StaticMethod4 {
static double a=10, b=20, c=30;

	public static void main(String[] args) {
		System.out.println("Value of  a is "+a);
		System.out.println("Value of b is "+b);
		System.out.println("Value of c is "+c);
		//double res= a+b+c/3;
		//System.out.println("Average of abc "+res);
		
	//	average();
	  //  average(24 , 24);
		//average (25, 25, 26);
		System.out.println("New average "+average(24,24));
		System.out.println("New average "+average(25,25,26));
		
		double res1=average();
		System.out.println("New average "+res1);
		
		
		// TODO Auto-generated method stub

	}
	static double average(int a, int b ) {
		return ((a+b)/2);
	}
	
	static double average(int p, int q, int r) {
		
	double res = (p+q+r)/3 ;
	return(res);
	}
	static double average() {
		
		return((a+b+c)/3);
		
	}

}
