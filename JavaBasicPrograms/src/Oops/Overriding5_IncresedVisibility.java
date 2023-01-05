package Oops;
class Parent11{
	private void m1() {
		System.out.println("From parent m1()");
	}
	protected void m2() {
		System.out.println("From parent m2()");
	}
}
class Child22 extends Parent11{
	private void m1() {                        //new m1() method, no overriding here as it is private method, unique to child class
		System.out.println("From child m1()");
	}
//	@override with incresed visibility 
	public void m2() {
		System.out.println("From child m2()");
	}
}
public class Overriding5_IncresedVisibility {

	public static void main(String[] args) {
		Parent11 p = new Parent11();
		// p.m1();   //this will gives error, As m1 is private it access only within the class 
		p.m2();
		
		Parent11 p1 = new Child22();
		// p1.m1();          //this will gives error, As m1 is private it access only within the class
		p1.m2();            //overrriding
		// TODO Auto-generated method stub
	}

}
