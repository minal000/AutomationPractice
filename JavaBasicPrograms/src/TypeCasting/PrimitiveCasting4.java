package TypeCasting;
class sample {
	void test1(double d) {
		System.out.println("value of d "+d);
	}
	void test2(int k) {
		System.out.println("value of  k : "+k);
	}
}
public class PrimitiveCasting4 {

	public static void main(String[] args) {
		sample s = new sample();
		s.test1(6);
		s.test1(5.5f);
		
		//casting happeing on line no. 14 and 15,  int to double and float to double, widening
		// TODO Auto-generated method stub

	}

}
