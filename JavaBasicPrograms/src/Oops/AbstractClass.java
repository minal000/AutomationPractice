package Oops;
abstract class Animal {
	public abstract void animalsound();        //abstract method does not have body. it is imcomplete
	public void sleep() {                    //Regular method
		System.out.println("Zzzzzz..");
	}
}
class Pig extends Animal {
	public void animalsound() {
		System.out.println("The pig says : wee wee wee....");
	}
}
class Dogs extends Animal {
	public void animalsound() {
		System.out.println("The dog says : bow bow bow....");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Pig p1 = new Pig();
		p1.animalsound();
		p1.sleep();
		
		Dogs d1 = new Dogs();
		d1.animalsound();
		d1.sleep();
		// TODO Auto-generated method stub

	}

}
