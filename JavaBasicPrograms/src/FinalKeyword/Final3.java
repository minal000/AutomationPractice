package FinalKeyword;

public class Final3 {
	final int speedlimit ;
	
	void Final3 () {
		
		speedlimit = 50 ;              //initialize variable through constructor
		System.out.println(speedlimit);
	}

	public static void main(String[] args) {
		
		Final3 obj1 = new Final3() ;
		System.out.println("Speedlimit of bike is "+obj1.speedlimit);
		
		// TODO Auto-generated method stub

	}

}
