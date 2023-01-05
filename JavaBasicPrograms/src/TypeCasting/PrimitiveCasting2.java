package TypeCasting;

public class PrimitiveCasting2 {

	public static void main(String[] args) {
		int A = 90;
		double B = (double)A;     //explicit widening
		System.out.println("Integer A : "+A);
		System.out.println("Double B : "+B);
		
		System.out.println("--------------------------------------");
		double P = 5.5d;
		float Q = (float)P;      //explicit widening
		System.out.println("double P : "+P);
		System.out.println("float Q : "+Q);
		
		// TODO Auto-generated method stub

	}

}
