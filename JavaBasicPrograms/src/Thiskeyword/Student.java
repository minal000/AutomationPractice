package Thiskeyword;

class Demo {
	
	int rollno;
	float fee;
	Demo( int rollno, float fee ) {
		rollno = rollno;
		fee = fee;
		}
 void display() {
	 System.out.println(rollno + "  " + fee);
 }
}

public class Student {

	public static void main(String[] args) {
		Demo d1 = new Demo(111, 50000f);
		Demo d2 = new Demo(222, 25000f);
		d1.display();
		d2.display();
		
		// TODO Auto-generated method stub

	}

}



