package Oops;
class Parent1 {
	void show() {
		System.out.println("Parent show method ..");
	}
}
class Child1 extends Parent1 {
	
//@ override
	void show() {
	System.out.println("Child show method..");	
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		Parent1 p1 = new Parent1();
		p1.show();
		
		Parent1 p2 = new Child1() ;
		p2.show();                  //override..... child body will get instead of parent as child override
		// TODO Auto-generated method stub

	}

}
