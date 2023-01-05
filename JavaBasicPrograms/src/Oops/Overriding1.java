package Oops;
class Animal12 {
	void move() {
		System.out.println("Animals can move..");
	}
}
class Dog12 extends Animal12 {
	void move() {
		System.out.println("Dogs can move..");
	}
	void bark() {
		System.out.println("Dogs can bark..");
	}
}
public class Overriding1 {

	public static void main(String[] args) {
		Animal12 a1 = new Animal12();
		a1.move();
		System.out.println("------------------------------------------------");
		Dog12 d1 = new Dog12();
		d1.move();
		d1.bark();
		System.out.println("--------------------------------------------------");
		Animal12 a2 = new Dog12() ;
		a2.move();     //override
		// TODO Auto-generated method stub

	}

}
