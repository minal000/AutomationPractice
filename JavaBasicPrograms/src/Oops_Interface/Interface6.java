package Oops_Interface;
interface Animal0 {
	
	int age = 20 ;    //by default public static final
	public void animalsound();   //by default public abstract
	public void sleep() ;   //by default public abstract
	
}
class Pig7 implements Animal0 {
	
	public void animalsound() {
		System.out.println("The pig says : wee wee..");
	}
	public void sleep() {
		System.out.println("Zzzz..");
	}
}

public class Interface6 {

	public static void main(String[] args) {
		Pig7 p1 = new Pig7() ;
		p1.animalsound();
		p1.sleep();
		
		System.out.println(Animal0.age);
		//Animal.age = 200; Error cannot change as final is constant
		// TODO Auto-generated method stub

	}

}
