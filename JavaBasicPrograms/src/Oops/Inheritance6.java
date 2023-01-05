package Oops;

class Grandfather {
	
	Grandfather() {
		System.out.println("I am class grandfather constructor ..");
	}
	void myhome() {
		System.out.println("I am home of grandfather..");
	}
	
}
class Father extends Grandfather {
   Father() {
		//parent class default super statement will call by compiler as it zero parameterised no need to mentioned
		System.out.println("I am father class constructor of double..");
	}
	void mycar() {
		System.out.println("I am car of father..");
	}
	
}
class Child extends Father {
	Child(int i) {
		//super();
		System.out.println("I am child class constructor..");
	}
	void mybike() {
		System.out.println(" I am bike of child..");
	}
	
}
public class Inheritance6 {

	public static void main(String[] args) {
		Child c1 = new Child (10);
		c1.mybike();
		c1.mycar();
		c1.myhome();
		System.out.println("=========================================================");
		//creating an obj of child most class and referred by its parent
		//father f2 = new child(21);
		Father f1 = c1 ;   
		f1.mycar();           // bike will not visible
		f1.myhome();
		System.out.println("========================================================");
		
		Grandfather g1 = c1 ;
		g1.myhome();           //home but car bike not visible
		System.out.println("=====================================================");
		//creating obj of child most class and referred by its parent
		Grandfather g2 = new Father();  //home but car bike not visible
		g2.myhome();
		// TODO Auto-generated method stub

	}

}
