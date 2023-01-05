package StringExample;

public class StringSampleProgram1 {

	public static void main(String[] args) {
		String s1 = "CoreJavaBasics" ;             //by using literals
	            	//or
	//	String s1 = new String ("CoreJavaBasics") ;  //by using new keyword
		
    //Returns the number of characters in the string.
		System.out.println("String length = "+ s1.length());  //14 -->0-13
		
	//Returns the number of character at ith index.
		System.out.println("Character at 3rd position = "+s1.charAt(2));
		
	///Return the substring from the ith index character
	//to end of string
		System.out.println("substring from index 3 : "+s1.substring(3)); //eJavaBasics
		
	//Return the substring from i to j-1 index.
		System.out.println("Substring from 2 to 5 : "+s1.substring(2,5));    //rej
		System.out.println("Substring from 4 to 8 : "+s1.substring(4,8));    //Java
		//Concatenates string2 to the end of string1
		String s2 = "Core";
		String s3 = "JavaBasic";
		System.out.println("First value of s2 : "+s2); //Core 
		System.out.println("First value of s3 : "+s3); //JavaBasic
		System.out.println("concatinated string : "+s2.concat(s3)); //CoreJavaBasic
		System.out.println("After Concatenated value of s2 : "+s2); //Core
		System.out.println("After Concatenated value of s3 : "+s3); //JavaBasic
		String p1 ="Pune";
		String p2 = "Mumbai";
		
		String x1 = s2.concat(s3);  //CoreJavaBasic
		String x2 = p1.concat(p2);  //PuneMumbai
		String x3 = p1+p2 ; //PuneMumbai
		String x4 = x1.concat(x2) ;  //CoreJavaBasicPuneMumbai
		
		//String d2 = p1.concat(25);  //error
		//String d1 = p1+25;
		
		//Return the index within the string of the first occurence of the specified string
		String s5 = "Learn Share Learn Share";
		System.out.println("String s5 size : "+s5.length());
		System.out.println("Index of 'Share' starts from : "+s5.indexOf("Share"));  //6
		//Returns the index within the string of the first occurence of the specified string, Starting at the specified index
		System.out.println("Index of a = "+s5.indexOf('a', 4));  //next occurence(index) of 'a' after index 3
		System.out.println("Index of e = "+s5.indexOf('e', 11));  //next occurence(index) of 'e' after index 11
		
		//Checking equality of Strings
        String s6 = "Selenium";
		String s7 = "Selenium";
		String s8 = "Selenium";
		System.out.println("Checking equality of s6 and s7 : "+s6.equals(s7));
		System.out.println("Checking equality of s6 and s8 : "+s6.equals(s8));
		System.out.println("Checking equality of s6 and s7 with ignore case : "+s6.equalsIgnoreCase(s7));
		
		//Converting cases
		String word1 = "CoreJava" ;
		System.out.println("Changing to Lower case "+word1.toLowerCase());  //corejava
		
		//Converting cases
		String word2 = "CoreJava" ;
		System.out.println("Changing to Upper case "+word2.toUpperCase());  // COREJAVA
		
		//Trimming the word
		String word4 = "     Learn Share Learn     ";
		System.out.println("Actual string : "+word4);                    //    Learn Share Learn
		System.out.println("Actual string length : "+word4.length());    //27
		System.out.println("After trim is "+word4.trim());              //Learn Share Learn
		System.out.println("After trim length is "+word4.trim().length());   //17
		
		//Replacing characters
		String str1 = "CoreJavaBasic" ;
		System.out.println("Original string "+str1);  //CoreJavaBasic
		String str2 = str1.replace('a' , 'x');
		System.out.println("Replaced a with x --> "+ str2); //CoreJxvxBxsic
		
		String str3 = str1.replace("Java" , "Net"); 
		System.out.println("Replaced 'java' with 'Net' ---> "+str3); //CoreNetBasic
		
		String str4 = str1.replaceFirst("a" , "W");
		System.out.println("Replaced first a with w --> "+str4);   //CoreJWvaBasic
		
		String str5 = " ";
		System.out.println("str5 is empty or not : "+str5.isEmpty());
		
		String str6 = new String() ;
		System.out.println("str6 is empty or not : "+str6.isEmpty());
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
