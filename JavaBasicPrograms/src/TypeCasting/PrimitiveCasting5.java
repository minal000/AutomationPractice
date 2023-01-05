package TypeCasting;
class sample1{
	double x=10;
	double test3() {
		System.out.println("Running test3...");
		return 5;   //double to int , auto/implicit widening
	}
	
}
public class PrimitiveCasting5 {

	public static void main(String[] args) {
		System.out.println("Program Starts..");
		sample1 s1 = new sample1();
		int res = (int)s1.test3();        //explicit narrowing
		System.out.println("value of res "+res);
		System.out.println("Program Ends...");
		// TODO Auto-generated method stub

	}

}
