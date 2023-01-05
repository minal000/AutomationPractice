package Thiskeyword;

public class Student3 {
	int a;
	int b;
	 
	Student3(int a, int b) {
		 
		this.a = a;
		this.b = b;
		
		}
	void display() {
		System.out.println(a+ "  "+b);
	}

	public static void main(String[] args) {
		Student3 H = new Student3(45,55);
		  H.display();
		  System.out.println("Value of a "+H.a);
		  System.out.println("Value of v "+H.b);
		  
		 Student3 G = new Student3(90,91);
		 G.display();
		 System.out.println("Value of a "+G.a);
		  System.out.println("Value of v "+G.b);
		// TODO Auto-generated method stub

	}

}
