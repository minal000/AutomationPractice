package Oops;
class Parent00{
	static void m1() {
		System.out.println("From parent "+"static m1()");
	}
	void m2() {
		System.out.println("From parent "+ "non static m2() ");
	}
}
class Child99 extends Parent00 {
	static void m1() {
		System.out.println("From child"+"static m1()");
	}
	//@ override
	void m2() {
		System.out.println("From child"+"non static m2()");
	}
}
public class Overriding7_static {

	public static void main(String[] args) {
		Parent00 obj = new Child99();
		obj.m1();     //static member can't override  , parent class m1() by using refer.variable obj as allias name of class
		obj.m2();   //override
		// TODO Auto-generated method stub

	}

}
