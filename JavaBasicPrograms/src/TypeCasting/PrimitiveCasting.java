package TypeCasting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		int myInt=9;
		double myDouble = myInt;   //implicit widening, double myDouble = (double)myInt;
		double d = (double)myInt;  //explicit widening
		System.out.println(myInt);  
		System.out.println(myDouble);
		System.out.println(d);
		
		double salary =23000.678568568989;
		int sal = (int)salary;    //explicit narrowing
		long f = (long)salary;   //explicit narrowing 
		float f1 = (float)salary;  //explicit narrowing
		double var = sal ;      //implicit widening/ auto widening
		System.out.println("Actual salary : "+salary);
		System.out.println("Int salary : "+sal);
		System.out.println("long salary : "+f);
		System.out.println("float salary : "+f1);
		System.out.println("value of var : "+var);
		
		// TODO Auto-generated method stub

	}

}
