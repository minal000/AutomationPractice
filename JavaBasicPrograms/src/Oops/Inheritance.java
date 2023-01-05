package Oops;
class A {
	static int a = 90;
	char b ='P';
	double c = 25.25;
}
class B {
	static int p = 91;
	char q = 'Q' ;
	double r = 26.26 ;
}
class C {
	static int x = 92 ;
	char y = 'R';
	double z = 27.27 ;
}

public class Inheritance {

	public static void main(String[] args) {
		//Access static member of all class
		
				System.out.println("Static member of class A "+A.a);
				System.out.println("Static member of class B "+B.p);
				System.out.println("Static member of class C "+C.x);
				
				//Access non static member of all class by 
				
				A a1 = new A() ;
				System.out.println("Non Static member of class A "+a1.b);
				System.out.println("Non Static member of class A "+a1.c);
				
				B b1 = new B() ;
				System.out.println("Non Static member of class B "+b1.q);
				System.out.println("Non Static member of class B "+b1.r);
				
				C c1 = new C() ;
				System.out.println("Non Static member of class C "+c1.y);
				System.out.println("Non Static member of class C "+c1.z);
				// TODO Auto-generated method stub

		// TODO Auto-generated method stub

	}

}


/*
 * What we studied before according to that , we done in this program i.e to call static member of
 * class we use class name.variable name.
 * for non static, we create object of each class to call non static member)
 */
