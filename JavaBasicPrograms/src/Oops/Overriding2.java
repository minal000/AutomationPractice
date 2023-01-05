package Oops;
class Animal13 {
	public void move() {
		System.out.println("Parent class Animal can move.. ");
	}
	void display() {
		System.out.println("Parent Animal13 class display..");
	}
}
class Dog13 extends Animal13 {
	public void move() {
		//super.move();    //parent class move ---
		//or
		//Animal13 a1 = new Animal13();
		//a1.move();
		System.out.println("child class Dog can move..");
		display(); 
	}
}
public class Overriding2 {

	public static void main(String[] args) {
		System.out.println("-------------------------------------------");
		Animal13 b = new Dog13();    //override  ---referece of animal class and obj of dog class 
		b.move();
		b.display(); 
		// TODO Auto-generated method stub

	}

}
