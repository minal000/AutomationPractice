package Oops;
abstract class Bike1{
	abstract void run();
	void speed(int spd ) {
		System.out.println("Bike speed : "+spd);
	}
}
class Honda4 extends Bike1 {
	void run() {
		System.out.println("Running Safely..");
	}
	void speed(int spd ) { 
		System.out.println("Honda4 Speed : "+spd);
		super.speed(120);
	}
	void color() {
		System.out.println("Honda1 color is blue");
	}
}
public class AbstractClass1 {

	public static void main(String[] args) {
		Honda4 obj = new Honda4() ;
		obj.run();
		obj.speed(60);
		obj.color();
		
		//Bike1 b1 = new Bike1();          //we can't make the obj of parent class bike as it is abstract class, and obj of abstract never done
		Bike1 b2 = new Honda4();  // here bike is taken as reference 
		b2.run();
		b2.speed(20);
		//b2.color();
		// TODO Auto-generated method stub

	}

}
