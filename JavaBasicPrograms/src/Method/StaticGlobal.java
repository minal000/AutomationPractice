package Method;

public class StaticGlobal {
	//static global variable salary empid age
	static int empid =3456;
	static double salary = 40000;
	static int age = 25 ;
	
	public static int worker() {
		System.out.println(" Age of person is "+age);
		//System.out.println("empid of person is "+empid);
		return (age);
	}
	private static void man() {
	 System.out.println("Salary of person is "+salary);
		
	}
	

	public static void main(String[] args) {
		System.out.println("Program Starts.");
		//worker();                   //directly called method
		//man();
		StaticGlobal.worker();       //using class name ,called method
		StaticGlobal.man();
		System.out.println("Program Ends..");
		//System.out.println(man());   //compile time error as void method won't return any value to jvm
		// TODO Auto-generated method stub

	}

}
