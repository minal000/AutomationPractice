package constructor;

public class cons3 {
	int rollno;
	double empid;
	                                 //here is also constructor not defined, hence it is default constructor
	void display() {
		System.out.println(rollno+ " " +empid);
	}

	public static void main(String[] args) {
		cons3 obj = new cons3();
		 obj.display();
		// TODO Auto-generated method stub

	}

}
