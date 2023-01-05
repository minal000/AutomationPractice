package constructor;

class B{
	 int i = 10 ;
	 
	 B() {
		 
		 System.out.println("Running class B constructor..");
		 i = 23;
	 }
}

public class cons7 {

	public static void main(String[] args) {
		System.out.println("main() of class cons 7 is started..");
		
		B b1 = new B();
		System.out.println("class B global variable i =" + b1.i);
		
		System.out.println("========================================");
		
		B b2 = new B();
		System.out.println("class B global variable i = "+b2.i);
		System.out.println("Main() of class cons7 is ends here..");
		// TODO Auto-generated method stub

	}

}
