package Oops_Interface;

interface Bank {
	float RateofInterest(); //by default---.public abstract
}
class SBI1 implements Bank {
	public float RateofInterest() {
		return 9.15f ;
	}
}
class PNB1 implements Bank {
	public float RateofInterest() {
		return 9.7f ;
	}
}
public class Interface2 {

	public static void main(String[] args) {
		SBI1 s1 = new SBI1();
		System.out.println("SBI1 rate of interest : "+s1.RateofInterest());
		
		PNB1 p1 = new PNB1() ;
		System.out.println("PNB1 rate of Interest : "+p1.RateofInterest());
		
		Bank b = new SBI1() ;
		System.out.println("Rate of Interest : "+b.RateofInterest());
		// TODO Auto-generated method stub

	}

}
