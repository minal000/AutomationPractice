package Thiskeyword;
class RRR {
	
	void m() {
		System.out.println("Hello m..");
		}
	void n() {
		System.out.println("Hello n..");
	//	m();
		this.m();   // ek non static member ko dusare non static member se access kiya
	}
	}

public class Student4 {
	void Method1() {
		System.out.println("Inside Method one..");
	}
	void Method2() {
		System.out.println("Inside Method Two..");
		//Method1();
		this.Method1();   //in method 2 , method 1 called... ek non static member ko dusare non static member ko access kiya
	}

	public static void main(String[] args) {
		Student4 OOO = new Student4();
		OOO.Method2();
		RRR Obj = new RRR();
		Obj.n();
		// TODO Auto-generated method stub

	}

}
