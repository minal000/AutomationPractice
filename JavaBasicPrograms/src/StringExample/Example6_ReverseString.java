package StringExample;

import java.util.Scanner;


public class Example6_ReverseString {

	public static void main(String[] args) {
		String str1 = "Dhanori Pune";
//		
//		//to  print one by one character of String
//		for(int i=0 ; i<str1.length() ; i++) {
//			System.out.println(str1.charAt(i));
//		}
//		System.out.println("*****************************");
//		
//		
//		//to print one by one character of string from the last index
//		for(int i =str1.length()-1 ; i>=0 ; i--) {
//			System.out.println(str1.charAt(i));
//		}
//		System.out.println("***************************************");
		
		String temp ="";
		for(int i = str1.length()-1 ; i>=0 ; i--) {
		     temp = temp + str1.charAt(i);
		}
		System.out.println("str1 : "+str1);
		System.out.println("temp : "+temp);
		System.out.println(reverseString("Dhanori Pune"));
		
		String s1 ="Banglore" ;
		System.out.println(reverseString(s1));
		
		Scanner scn= new Scanner(System.in);
		String s2;
		System.out.println("Enter string to be reverse : ");
		s2 = scn.next();
		System.out.println("reverse String is : "+reverseString(s2));
		
		//System.out.println(palinString("abcd"));
        String s3 ;
        System.out.println("Enter string to check for Palindrome ");
        s3 =scn.next();
        palinString(s3);
		
		
	}

	  static void palinString(String str) {
		
		String s = str;
		String temp = "";
		for(int i = s.length()-1 ; i>=0 ; i--) {
			temp = temp + s.charAt(i);
		}
		if(temp.equals(s)) {
			System.out.println("Given string is a palindrome : "+str);
		}
		else {
			System.out.println("Given string is not a palindrome : "+str);
		}
	}

	static String reverseString(String str) {
		String temp ="";
		
		for( int i=str.length()-1 ; i>=0 ; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}

}
