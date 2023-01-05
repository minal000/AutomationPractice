package blocks;

public class Blocks8 {
	int age = 25 ;
	double salary = 50000 ;
	
	void print() {
		System.out.println("age : "+age);
		System.out.println("Salary : "+salary);
	}

	public static void main(String[] args) {
		System.out.println("main() Starts..");
		Blocks8 b1 = new Blocks8();
		b1.print();
		System.out.println("main() ends..");
		// TODO Auto-generated method stub

	}
	/*non-static block*/
	{
		salary = 55000 ;
	}

}
