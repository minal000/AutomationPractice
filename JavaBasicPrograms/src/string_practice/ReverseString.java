package string_practice;

public class ReverseString {

	public static void main(String[] args) {
		//Using string concatination operator
    String s1 = "Minal";
	String temp = "";
	
//	System.out.println("s1 length : "+s1.length()); 
//	
//	for(int i=s1.length()-1 ; i>=0 ; i--) {
//		temp = temp + s1.charAt(i);
//	}
//	System.out.println("original String : "+s1);
//	System.out.println("Reverse String : "+temp);
	
	
	
	//using char Array
	char a[] = s1.toCharArray();
	int L = a.length ;     //get arry length
	for(int i=L-1 ; i>=0 ; i--) {
		temp = temp+s1.charAt(i);
		
	}
	System.out.println("original String : "+s1);
	System.out.println("Reverse String : "+temp);
	
	
	//Reverse string using buffer class method
//	StringBuffer sb = new StringBuffer(s1);
//	System.out.println(sb.reverse());
	
    
	}
	
	
	 
	}


