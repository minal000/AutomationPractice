package Thiskeyword;

public class Student2 {
	int x;
	//Constructor with parameter
	Student2(int x) {
		System.out.println("Local variable before this keyword using "+x);   //before using this keyword result
		System.out.println("Global variable before this keyword using "+this.x);
		
		this.x = x ; //due to 'this'keyword local variable and global variable can differentiate
	
		System.out.println("Local variable after this keyword using "+x);
		System.out.println("Local variable after this keyword using "+this.x);
		
	}                    //this.x is global , x is local.

	// call the constructor
	public static void main(String[] args) {
		Student2 S1 = new Student2(90) ;
		System.out.println("Value of X is "+S1.x);
		
	}

}
