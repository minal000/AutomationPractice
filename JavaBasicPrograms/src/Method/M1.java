package Method;

public class M1 {
	
	public static void PrintDetail(int age, int salary)
	{
		System.out.println("Hello, My name is Minal");
		System.out.println("My age is " +age);
		System.out.println("My salary is " +salary);
	}

	public static void main(String[] args) {
		 PrintDetail(25, 40000);              //Here we call it directly, as static member can call directly.
		 PrintDetail(35,80000);
		//M1.PrintDetail(25, 40000);         // Static member call by their standard way i.e by using method name.
	    //	M1.PrintDetail(35, 80000);
		// TODO Auto-generated method stub

	}

}
