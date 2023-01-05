package StringExample;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {

		String s1 = "CoreJavaBasic" ;
		System.out.println(s1.charAt(0)) ;
		System.out.println(s1.charAt(5)) ;
		System.out.println(s1.charAt(3)) ;
		System.out.println(s1.charAt(6)) ;
		
		for(int i=0 ; i<s1.length(); i++) {
			System.out.println("char At index "+i+": " +s1.charAt(i));
			
		}
		System.out.println("**************************************");
		
		String s2 = "Hi I am Minal staying in Yavatmal";
		for(int i=0 ; i<s2.length(); i++) {
			System.out.println("char At index "+i+": " +s2.charAt(i));
			
		}
		
		String name ;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name : ");
		name = scn.next();
		System.out.println("My name is "+name);
		
	    String[] names = new String[5];
		for( int i=0 ; i<names.length ; i++) {
			System.out.println("Enter emp names : ");
			names[i] = scn.next();
		}
		for (String n : names) {
			System.out.println(n);
		}
		// TODO Auto-generated method stub

	}
	

}
