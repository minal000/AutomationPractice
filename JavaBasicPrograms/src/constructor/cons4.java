package constructor;

public class cons4 {
	int roll;
	double salary;
	cons4(int r, double s){
		roll=r;
		salary=s;
	}
	void display() {
		System.out.println(roll+ " " +salary);
	}

	public static void main(String[] args) {
		cons4 C1 = new cons4(1001, 999999);
		C1.display();
		cons4 C2 = new cons4(2002, 888888);
		C2.display();
		
		
		// TODO Auto-generated method stub

	}

}
