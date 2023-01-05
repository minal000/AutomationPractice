package blocks;

public class Blocks5 {
	/*static block or  SIB */
	static {
		System.out.println("Running static-block-1 of class Blocks5..");
	}
	/* non-static block */
	{
		System.out.println("Running non-static-block-1 of class Blocks5..");
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");
		Blocks5 b1 = new Blocks5();
		System.out.println("===================================");
		Blocks5 b2 = new Blocks5();
		System.out.println("main() Ends..");
		// TODO Auto-generated method stub

	}

}
