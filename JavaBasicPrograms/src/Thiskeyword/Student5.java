package Thiskeyword;

public class Student5 {
	 int age;
	 void call() {
		 System.out.println(" I am call method ..");
	 }
	 void m(int age) {
		 System.out.println("Local age "+age );
		 System.out.println("Global age "+this.age);  //this.age is glovbal age value 
		// call();
		 this.call();
		 System.out.println("this keyword value is "+this );  //prints same reference ID
	 }

	public static void main(String[] args) {
		Student5 Z = new Student5();
		
		System.out.println("object Z value is "+Z );    //prints the reference ID
		Z.m(12);
		// TODO Auto-generated method stub

	}

}
