package Oops;

abstract class RBIBank {
	abstract double getRate();
	final void loan() {
		System.out.println("As per RBI loan..");
	}
	
}
class SBI101 extends RBIBank {
	double getRate() {
		return 6.45 ;
	}
}
class PNB extends RBIBank {
	double getRate() {
		return 7.5 ;
	}
}
public class AbstractClass3 {

	public static void main(String[] args) {
		PNB p1 = new PNB() ;
		System.out.println("PNB rate of Interest is : "+p1.getRate);
		p1.loan();
		
		SBI101 s1 = new SBI101();
		System.out.println("SBI rate of interest is "+s1.getRate);
		s1.loan();
		
		RBIBank b1 = new SBI101();
		System.out.println("RBI reference obj of SBI rate is "+b1.getRate);
		
		RBIBank b2 = new PNB();
		System.out.println("RBI refer but obj of PNB rate "+b2.getRate);
		
		
		// TODO Auto-generated method stub

	}

}
