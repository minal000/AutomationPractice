package Thiskeyword;

public class Student6 {
	//non static or global or instance variable
	int variable =5;
	int age = 10;

	public static void main(String[] args) {
		Student6 obj = new Student6();
		 obj.method();
		 obj.method(20);
		 
		 System.out.println("Value of instance variable "+obj.variable);
		// TODO Auto-generated method stub

	}
	void method(int variable) {
		System.out.println("Value of local variable "+variable);
		variable =10 ;
		System.out.println("Value of local variable "+variable);
		System.out.println("Value of instance variable "+this.variable);
		
		this.variable = variable;
		
		System.out.println("Value of local variable "+variable);
		System.out.println("Value of instance variable "+this.variable);
		
		
	}
	void method() {
		int variable = 40;
		System.out.println("Value of local variable "+variable);
		System.out.println("Value of instance variable "+this.variable);
		
		this.variable = variable;
		
		System.out.println("Value of local variable "+variable);
		System.out.println("Value of instance variable "+this.variable);
		
		
	}

}
