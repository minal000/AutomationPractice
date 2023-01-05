package blocks;

public class Blocks6 {
	static {
		System.out.println("Running static-block-1 of class Blocks6..");
	}
	/*non static block*/
	{
		System.out.println("running non-static-block-1 of class Blocks6..");
	}

	public static void main(String[] args) {
		System.out.println("main() Starts..");
		Blocks6 b1 = new Blocks6();
		
		System.out.println("=====================");
		
		Blocks6 b2 = new Blocks6();
		System.out.println("main() Ends..");
		
		// TODO Auto-generated method stub

	}
	static {
		System.out.println("Running static-block-2 of class Blocks6..");
	}
	/*non-static block*/
	{
		System.out.println("Running non-static-block-2 of class Blocks6..");
	}

}
