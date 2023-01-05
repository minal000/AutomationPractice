package blocks;

public class Blocks4 {
	Blocks4() {
		System.out.println("Zero parameter constructor..");
	}
	/*non-static block*/
	{
		System.out.println("Running non-static-block-1 of class Blocks4..");
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");
		 Blocks4 b1 = new Blocks4();      // first nonstatic block will exicute, then constructor exicute
		 
		 System.out.println("==================================");
		 
		 Blocks4 b2 = new Blocks4();
		 System.out.println("main() ends");
		// TODO Auto-generated method stub

	}
	/* non-static block or IIB */
	{
		System.out.println("Running non-static-block-2 of class Blocks4..");
	}

}
