package TypeCasting;

public class PrimitiveCasting3 {

	public static void main(String[] args) {
		System.out.println("Primitive casting of widening...");
		byte b = 8;
		short s = b;
		int i = s ;
		long l = i ;
		float f = l ;
		double d = f ;
		System.out.println("value of b : "+b);
		System.out.println("value of s : "+s);
		System.out.println("value of i "+i);
		System.out.println("value of l : "+l);
		System.out.println("value of f : "+f);
		System.out.println("value of d : "+d);
		
		// TODO Auto-generated method stub

	}

}
