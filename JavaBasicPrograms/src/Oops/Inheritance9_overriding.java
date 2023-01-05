package Oops;
class Company1 {
	void display() {
		System.out.println("display method of parent class Company1..");
	}
}
class Employee1 extends Company1 {
	void display() {
		System.out.println("display method of child class employee..");
		super.display();
	}
	void callme() {
	System.out.println("callme method of class employee..");	
	}
}
public class Inheritance9_overriding {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.display();
		e1.callme();
		
		Company1 c1 = new Company1();
		c1.display();
		
		Company1 c2 = new Employee1();  //overriding
		c2.display();
		
		// TODO Auto-generated method stub

	}

}
