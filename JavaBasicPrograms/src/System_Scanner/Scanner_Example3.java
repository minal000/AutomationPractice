package System_Scanner;
import java.util.Scanner;

public class Scanner_Example3 {

	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in) ;
		System.out.println("enter your adderess: ");
		String address= scnObj.nextLine();
		System.out.println("My address is : "+address);
		// TODO Auto-generated method stub

	}

}
