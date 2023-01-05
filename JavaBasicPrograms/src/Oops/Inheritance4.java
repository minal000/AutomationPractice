package Oops;
//parent class
class Vehicle1 {
	public void wheels() {
		System.out.println("Every vehicle differ in wheels.");
	}
	
}
//1st child of parent class vehicle
class Scooter1 extends Vehicle1{
	public void countS() {
		System.out.println("Scooter has two wheel.");
	}
}
//2nd child of parent class vehicle
class car1 extends Vehicle1 {
	public void countC() {
		System.out.println("Car has 4 wheel..");
	}
}
//3rd child of parent class vehicle
class bike1 extends Vehicle1 {
	public void countB() {
		System.out.println("Bike has 2 wheel..");
	}
	
}
public class Inheritance4 {

	public static void main(String[] args) {
		Scooter1 S1 = new Scooter1() ;
		S1.wheels();
		S1.countS();
		
		car1 C1 = new car1();
		C1.wheels();
		C1.countC();
		
		bike1 B1 = new bike1() ;
		B1.wheels();
		B1.countB();
		// TODO Auto-generated method stub

	}

}
