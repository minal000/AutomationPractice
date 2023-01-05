package System_Scanner;
import java.util.Scanner;

public class Scanner_Example1 {
	
  public static void main(String[] args) {
	  String s = "Hello" ;
		//Create scanner Object and pass string in it
		Scanner scan = new Scanner(s);
		//check if the scanner has a token
		System.out.println("Boolean Result: "+scan.hasNext());
		//print the String
		System.out.println("String: "+ scan.nextLine());
		scan.close();
		System.out.println("----------Enter Your Details-------");
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = in.next() ;
		System.out.println("Name : "+name);
		System.out.println("Enter your age : ");
		int i = in.nextInt();
		System.out.println("Age : "+i);
		System.out.println("enter your  salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: "+d);
		in.close();
		// TODO Auto-generated method stub

	}

}
