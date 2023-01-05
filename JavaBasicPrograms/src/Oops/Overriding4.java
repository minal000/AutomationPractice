package Oops;
class ABC {
	public void Mymethod1() {
		System.out.println("method of ABC ");
	}
}
class XYZ extends ABC {
	public void Mymethod1() {
		super.Mymethod1();           //parent class method call
		System.out.println("Method of XYZ ");
	}
}

public class Overriding4 extends XYZ {
        public void Mymethod1() {
        	super.Mymethod1();
        	System.out.println("Method of overriding..");
        }
	public static void main(String[] args) {
		Overriding4 r1 = new Overriding4();
		r1.Mymethod1();
		// TODO Auto-generated method stub

	}

}
