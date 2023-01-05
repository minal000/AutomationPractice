package blocks;

public class Blocks7 {
	static int age;
	double salary;
	/*static block*/
	static {
		age =30;
	}
	/* non-static */
	{
		salary = 45000;
	}

	public static void main(String[] args) {
		System.out.println("main() starts..");
		System.out.println(" age :"+Blocks7.age);  //static member access by using class name
		System.out.println("==================================");
		
		Blocks7 b1 = new Blocks7();
		System.out.println("Salary : "+b1.salary );
		System.out.println("main() Ends..");
		// TODO Auto-generated method stub

	}

}
