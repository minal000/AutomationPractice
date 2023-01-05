package Oops;
//parent class or super class
class A1 {
	//java compiler will write default constructor
	static int a = 90;
	char b ='P';
	double c = 25.25;
}
//child class or sub class , B1 inherites class A1 non static members
class B1 extends A1 {
	//java compiler will write default constructor with default super statement
	static int p = 91;
	char q = 'Q' ;
	double r = 26.26 ;
}
// C1 inherites class B1 non static members
class C1 extends B1 {
	//java compiler will write default constructor with default super statement
	static int x = 92 ;
	char y = 'R';
	double z = 27.27 ;
}
public class Inheritance1 {

	public static void main(String[] args) {
		//Access static member of all class
		
		System.out.println("Static member of class A "+A.a);
		System.out.println("Static member of class B "+B.p);
		System.out.println("Static member of class C "+C.x);
		
		//Access non static member 
		C1 obj = new C1() ;         // it will have all the non static members of class A1 B1 C1 i.e b,c,q,r,y,z
		System.out.println("Non static member of class A1 "+obj.b);
		System.out.println("Non static member of class A1 "+obj.c);
		System.out.println("Non static member of Class B1 "+obj.q);
		System.out.println("Non static member of class B1 "+obj.r);
		System.out.println("Non static member of class C1 "+obj.y);
		System.out.println("Non static member of class C1 "+obj.z);
		
		B1 obj2 = new B1() ;    // it will have all the non static members of class A1 and B1
		System.out.println("Non static member of class A1 "+obj.b);
		System.out.println("Non static member of class A1 "+obj.c);
		System.out.println("Non static member of class of B1 "+obj.q);
		System.out.println("Non static member of class B1 "+obj.r);
		// TODO Auto-generated method stub

	}

}



