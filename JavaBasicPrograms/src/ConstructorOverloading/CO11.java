package ConstructorOverloading;

public class CO11 {
	static int age ;
	double salary ;
	CO11() {
		System.out.println("Constructor with zero parameter..");
		System.out.println("Having no Parameter..");
		System.out.println("Here zero parameter constructor ends..");
	}
	CO11(int a) {
		System.out.println("Constructor with single parameter..");
		System.out.println("Having integer parameter..");
		age= a;
		System.out.println("Here single interger parameter constructor ends..");
	}
	CO11(double b) {
		System.out.println("Constructor with single parameter..");
		System.out.println("Having double parameter..");
		salary= b;
		System.out.println("Here single double parameter constructor ends..");
	}
	CO11(int c, double d){
		System.out.println("Constructor with int-double parameter..");
		System.out.println("Having two Parameter..");
		age= c ;
		salary = d;
		System.out.println("Here zero parameter constructor ends..");

	}

	public static void main(String[] args) {
		CO11 C1 = new CO11();
		System.out.println("Age of Zero parameter constructor "+CO11.age);  //as age is static global, we should call it by using class name.
		System.out.println("Age of Zero parameter constructor "+C1.age); //but we can call it as reference variable, as ref.variable also become its class name when obj created		
		//System.out.println("Salary of Zero parameter constructor "+CO11.salary);// this will show error , as salary is non static , it can call only by ref.variable,which shows in next line
		System.out.println("Salary of Zero parameter constructor "+C1.salary);
		
		CO11 C2 =  new CO11(20);
		//System.out.println("Age of Zero parameter constructor "+CO11.age);
		System.out.println("Age of Zero parameter constructor "+C2.age);
		System.out.println("Salary of Zero parameter constructor "+C2.salary);
		
		CO11 C3 = new CO11(22000);
		//System.out.println("Age of Zero parameter constructor "+CO11.age);
		System.out.println("Age of Zero parameter constructor "+C3.age);
		System.out.println("Salary of Zero parameter constructor "+C3.salary);
		
		CO11 C4 = new CO11(25, 450000);
		//System.out.println("Age of Zero parameter constructor "+CO11.age);
		System.out.println("Age of Zero parameter constructor "+C4.age);
		System.out.println("Salary of Zero parameter constructor "+C4.salary);
		
		// TODO Auto-generated method stub

	}

}
