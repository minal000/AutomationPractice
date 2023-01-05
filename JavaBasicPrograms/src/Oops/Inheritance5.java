package Oops;
class A2 {
	void mesg() {
		System.out.println("Hello..");
	}
}
class B2 {
	void mesg() {
		System.out.println("Welcome..");
	}
}
public class Inheritance5 extends  A2  {    //two parents cannot extend together i.e multiple inheritance by using class is not possible
	Inheritance5() {                        //on line no 12 write B2 by  giving comma after A2
		super();
}

	public static void main(String[] args) {
		Inheritance5 obj = new Inheritance5() ;
		obj.mesg();
		// TODO Auto-generated method stub

	}

}
