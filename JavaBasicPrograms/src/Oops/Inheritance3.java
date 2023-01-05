package Oops;
class Fourwheelers {
	//default constructor 
	public void number() {
		System.out.println("Four wheelers only..");
	}
}
class Car extends Fourwheelers {
	//default constructor with default super() statement
	public void type () {
		System.out.println("I am a car.");
	}
}
class Maruti extends Car {
	//default constructor with default super() statement
	public void Company () {
	System.out.println("I am a Maruti..");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		
		Maruti M1 = new Maruti() ;
		 M1.number () ;
		 M1.type();
		 M1.Company();
		 
		 Car C1 = new Car() ;
		 C1.number();
		 C1.type();
		 
		// TODO Auto-generated method stub

	}

}
