package This_Statement;
class A1{
	A1(){
		this(25.36);
		System.out.println("Hello Zero Parameter..");
	}
	A1(double d){
		this(15);
		System.out.println("Hello Double parameter.."+d);
	}
	A1(int x){
		System.out.println("Hello integer parameter.."+x);
	}
}
public class ThisStatement1 {

	public static void main(String[] args) {
		A1 a1 = new A1 ();
		A1 a2 = new A1 (10);
		A1 a3 = new A1 (10.23);
		
		// TODO Auto-generated method stub

	}

}
