package Oops;
abstract class Abs1{
	abstract void call1();
	abstract void call2();
	void display() {
		System.out.println("Hello..");
	}
}
abstract class Abs2{
	abstract void call1();
	abstract void call2();
}
//abstract class Abs3{
//	void display(()) {
		
//	}
//}
public class DemoAbstract extends Abs2 {
	void call1() {
		System.out.println("Hello..");
	}
	void call2() {
		System.out.println("He is ..");
	}

	public static void main(String[] args) {
		DemoAbstract d1 = new DemoAbstract() ;
		d1.call1();
		d1.call2();
		// TODO Auto-generated method stub

	}

}
