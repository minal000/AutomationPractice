package Oops;
class fruitA {
	fruitA() {
		int fruitage1 = 45 ;
		System.out.println(" parent FruitA class constructor ..");
	}
	public void taste () {
		System.out.println("Fruits are Sweet in taste..");
	}
}
    class Mango1 extends fruitA {
	Mango1() {
		int Mango1age = 50 ;
		//parent class fruitA default super statement execute
		System.out.println(" child Mango class constructor..");
	}
    public void taste() {
	System.out.println("Mango is sweet and sour in taste..");
}
    public void shape() {
	System.out.println("Mango is round and big in shape..");
	System.out.println("f1.fruitage1" );  //super
}
    
}
public class Inheritance8_superkeyword {

	public static void main(String[] args) {
		fruitA f1 = new fruitA() ;
		f1.taste();
		System.out.println("f1.fruitage1" );
		
		Mango1 m1 = new Mango1();
		m1.taste();
		m1.shape();
		System.out.println("m1.Mango1age" );
		// TODO Auto-generated method stub

	}

}
