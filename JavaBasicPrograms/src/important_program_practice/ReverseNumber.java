package important_program_practice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
     System.out.println("Enter a number : ");
     int num = scn.nextInt();
     
     //By using Algorithem
//       int rev =0;
//       while(num!=0) {
//    	   rev= rev*10 + num%10 ;
//    	   num= num/10 ;
//    	   
//       }
//       System.out.println("Reverse Number is : "+rev);
       
//       //By using StringBuffer
//       StringBuffer sb = new StringBuffer(String.valueOf(num));//String.valueof() will convert num into string as String buffer require string
//       StringBuffer rev = sb.reverse();
//       System.out.println("Reverse Number is : "+rev);
//     
       //By using StringBuilder 
       StringBuilder sbl = new StringBuilder();
       sbl.append(num);
       StringBuilder rev = sbl.reverse();
       System.out.println("Reverse Number is  : "+rev);
       
	}
     
}
