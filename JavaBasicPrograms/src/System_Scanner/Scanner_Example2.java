package System_Scanner;
import java.util.Scanner;

public class Scanner_Example2 {

	public static void main(String[] args) {
		int age = 25 ;
		System.out.println("Age : "+age);
		/*
		 * using scanner class you will be able to take input from the keyboard
		 */
		Scanner scnObj = new Scanner(System.in);
		int pin;
		double salary;
		char grade;
		boolean status ;
		System.out.println("Enter pin number: ");
		pin = scnObj.nextInt();
		System.out.println("Enter salry number : ");
		salary = scnObj.nextDouble();
		System.out.println("Enter grade number: ");
		grade = scnObj.next().charAt(0);
		System.out.println("Enter status number : ");
		status = scnObj.nextBoolean();
		
		System.out.println("------------------------------------------");
		System.out.println(pin +"\n"+salary+"\n"+grade+"\n"+status);
		
		System.out.println("Enter your name : ");
		String name = scnObj.next();
		System.out.println("Your name is : "+name);
		
		// TODO Auto-generated method stub

	}

}
