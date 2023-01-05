package Oops;
class Acceleration1 {
	
	//can't be overriden as final makes method or variable constant
	final void show() {
		System.out.println("final method of class parent Acceleration1..");
	}
}
class Acceleration2 extends Acceleration1 {
	
	//this would produce error
	
	//void show() {
//		System.out.println("show method of child class Acceleration2");
	}
//}
public class Overriding6_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
