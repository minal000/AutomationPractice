package ObjectClass;
class Demo123 {
	void display() {
		System.out.println("I am display() of class Demo123..");
	}
}
public class Example3 extends Demo123 {

		int last_roll =100;
		int roll_no ;
		//Constructor
		Example3() {
			roll_no = last_roll;
			roll_no++ ;
		}
		@Override
		void display() {
			System.out.println("display() of class Example3..");
		}
		@Override
		public int hashCode() {
			return roll_no;
		}
//Driver Code
	public static void main(String[] args) {
		Example3 d = new Example3();
		System.out.println(d.toString());
		System.out.println("hashCode() value from object class Example3 : "+d.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println("*******************************************************");
		
		Demo123 d1 = new Demo123();
		System.out.println(d1);
		System.out.println(d1.toString());
		System.out.println(d1.hashCode());
		System.out.println("hashCode() value from object class Demo123.."+d1.hashCode());
		// TODO Auto-generated method stub

	}

}
