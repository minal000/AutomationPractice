package Oops;

class Fruit {
	Fruit() {
		System.out.println("Called Fruit cons...");
	}
   public void Taste () {
		System.out.println("Every fruit have different taste..");
	}
	
}
class Apple extends Fruit {
	//apple inherite class Fruit, apple is child of parent Fruit
	Apple() {
		System.out.println("Called Apple cons..");
	}
	public void Shape() {
		System.out.println("Apple is round in shape.");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Apple obj1 = new Apple () ;
		
		obj1.Taste();
		obj1.Shape();
		
		// TODO Auto-generated method stub

	}

}
