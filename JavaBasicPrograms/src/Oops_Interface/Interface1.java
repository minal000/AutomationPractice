package Oops_Interface;

interface i1 {
	//variable--->by default---->public static final
	//method ---->by default----.public abstract
	//no complete method/ non-abstract
	//no constructor
}
interface Drawable {
	int Salary = 25000 ;     //by default public static final int Salary= 25000;
	void draw();           //by default public abstract void draw();
}
class Rectangle2 implements Drawable{
	public void draw() {
		System.out.println("drawing rectangle..");
	}
}
class Circle1 implements Drawable{
	public void draw() {
		System.out.println("drawing Circle..");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		System.out.println("Interface Variable salary : "+Drawable.Salary);
		
		Rectangle2 r2 = new Rectangle2();
		r2.draw();      
		
		Circle1 c1 = new Circle1();
		c1.draw();
		
		Drawable d = new Circle1();            //here drawable is taken as reference, it can't take as object as it is interface, 
		d.draw();
		
		
		// TODO Auto-generated method stub

	}

}

