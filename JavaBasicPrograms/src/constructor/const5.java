package constructor;
class A {
	int i=23;
	A() {
		System.out.println("Running class A constructor..");
	}
	void display() {
		System.out.println("I am display of class A..");
	}
}
class X {
	int j=90;
	X() {
	
		System.out.println("Running class X constructor..")	;	
	}
	void display() {
		System.out.println("I am display of class X..");
	}
}

public class const5 {
	
	void display() {
		System.out.println("I am display of class const5 ");
	}

	public static void main(String[] args) {
		
		A a1 = new A();
		a1.display();
		System.out.println("Print int value of class A "+a1.i);	
		
		X x1 = new X();
		x1.display();
		System.out.println("Print int value of class X "+x1.j);
		
		const5 C1 = new const5();
		C1.display();
		System.out.println(" main method class const5 end here..");
		
		// TODO Auto-generated method stub

	}

}
