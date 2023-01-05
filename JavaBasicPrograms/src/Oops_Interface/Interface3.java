package Oops_Interface;

 interface Printable{
	 int age = 30;      //by default public static final
	 void print() ;     //by default public abstract
 }
 
 interface Showable{
	 public void show();
 }
 
public class Interface3 implements Printable, Showable {    //multiple inheritance by interface
	public static int age = 45 ;
	public void print() {
		System.out.println("Hello, Print..");
	}
	public void show() {
		System.out.println("Welcome, show..");
	}
	public static void main(String[] args) {
		Interface3 obj = new Interface3();
		obj.print();
		obj.show();
		
		System.out.println(Printable.age);
		System.out.println(Interface3.age);
		// TODO Auto-generated method stub

	}

}
