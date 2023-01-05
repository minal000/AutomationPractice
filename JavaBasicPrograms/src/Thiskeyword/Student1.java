package Thiskeyword;
class Demo1 {
	
	int rollno;
	float fee;
	Demo1( int rollno, float fee ) {
		
		System.out.println("Local variable roll no "+rollno);
		System.out.println("Local variable fee "+fee);
		System.out.println("Global variable roll "+this.rollno);  
		System.out.println("Global variable fee "+this.fee);      
		//global variable = local variable 
		System.out.println("======================================");
		this.rollno = rollno;
		this.fee = fee;
		
		System.out.println("Local variable roll no "+rollno);
		System.out.println("Local variable fee "+fee);
		System.out.println("Global variable roll "+this.rollno); 
		System.out.println("Global variable fee "+this.fee);     
		}
	
 void display() {
	 System.out.println(rollno + "  " + fee);
 }
 
}
		
		
public class Student1 {

	public static void main(String[] args) {
		Demo1 d1 = new Demo1(111, 50000f);
		System.out.println("==================================");
		Demo1 d2 = new Demo1(222, 25000f);
		d1.display();
		d2.display();
		// TODO Auto-generated method stub

	}

}
