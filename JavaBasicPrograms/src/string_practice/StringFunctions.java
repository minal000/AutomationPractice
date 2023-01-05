package string_practice;

public class StringFunctions {

	public static void main(String[] args) {
		String s1 = "MinalYogesh";
		
		System.out.println("length of String s1 : "+s1.length());
		
		System.out.println("char at particular place : "+s1.charAt(1));
		
		System.out.println("sub part of string : "+s1.substring(4));
		
		System.out.println("sub part of Sting : "+s1.substring(2, 8));
		
		String s2 = "Minal";
		String s3 = "Khamankar";
		String s = s2+s3;
		//concat
		System.out.println(s2.concat(s3));
		System.out.println(s1.concat(s3));
		System.out.println(s2.concat(s));
		
		String s4 ="25";

		/*give you errror as 25 is not string its integer
		 to concat it convert it into string by using Integer.parseInt()
		*/
		int num = Integer.parseInt(s4);
		int sum = num+100;
		System.out.println(sum);
		
		String s5 = "Earn and Learn ,Earn and Learn";
		//char comes after index
		System.out.println("Index of Earn : "+s5.indexOf("Learn"));
		System.out.println("Index of L : "+s5.indexOf('L', 24));
		System.out.println("Index of a : "+s5.indexOf('a', 2));
		
		//equality of String
		String s6 ="Hello";
		String s7 ="Helo";
		String s8 = "Hello";
        System.out.println("Equality between s6 & s7 : "+s6.equals(s7));
        System.out.println("Equality between s6 & s8 : "+s6.equals(s8));
       System.out.println("Equality between s6 & s7 : "+s6.equalsIgnoreCase(s7));
       System.out.println("Equality between s6 & s8 : "+s6.equalsIgnoreCase(s8));
       
       String s9 = "Automation";
       System.out.println("coverting into lower case : "+s9.toLowerCase());
       System.out.println("converting into upper case : "+s9.toUpperCase());
       
       //trim
       String s10 = "   India is my country   ";
       System.out.println("actual length of string s10 : "+s10.length());
       System.out.println("trimming S10 : "+s10.trim());
       System.out.println("length after trimming the string : "+s10.trim().length());
       
       //replace
       String s11 ="Automate the java Script";
       System.out.println("replace j with r in s11 : "+s11.replace('j', 'r'));
       System.out.println("replace Automate with Write : "+s11.replace("Automate", "Write"));
       System.out.println("replace : "+s11.replaceFirst("t", "u"));
       
       //empty
       String s12 = " ";
       String s13 = new String();
       
       String s14 ="";
       String s15 = new String("Hello");
       
       System.out.println("S12 is empty or not :"+s12.isEmpty());
       System.out.println("s13 is empty or not : "+s13.isEmpty());
       System.out.println("s14 is empty? : "+s14.isEmpty());
       System.out.println("s15 is Empty : "+s15.isEmpty());
	}

}
