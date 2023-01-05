package constructor;

public class cons2 {
	int age;
	double salary;
	char alphabet;
	/**
	 * below is default constructor, that will be written by java compiler at compilation time
	 * cons2() {
	  
	      //Empty body
	 
	           }
	 */

	public static void main(String[] args) {
		cons2 C1 = new cons2();
		System.out.println("Value of age "+C1.age);
		System.out.println("Value of salary "+C1.salary);
		System.out.println(C1.alphabet+"Hello");
		
		//default value of char is space ..
		// TODO Auto-generated method stub

	}

}
