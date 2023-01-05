package Oops;

abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	protected void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing Circle");
	}
}
//In real Scenario method is called by Programmer or user
public class AbstractClass2 {

	public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();
		Shape s1 = new Rectangle();
		s1.draw();
		// TODO Auto-generated method stub

	}

}
