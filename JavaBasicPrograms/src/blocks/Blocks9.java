package blocks;

public class Blocks9 {
	final static int age ;
	final double salary ;
	Blocks9() {
		
		 System.out.println(" I am a Blocks9 class cons" );
	}
	void print() {
		 System.out.println(" age : "+age);
		 System.out.println(" salary : "+salary);

	}

	public static void main(String[] args) {
		System.out.println("main() starts..");
		Blocks9 b1 = new Blocks9();
		System.out.println("main() ends..");
		
		// TODO Auto-generated method stub

	}
/* non-static block */
	{
		
		salary = 80000;
		print();
	}
	static {
		age = 25;
	}
}
