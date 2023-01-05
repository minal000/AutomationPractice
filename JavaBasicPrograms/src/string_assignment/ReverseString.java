package string_assignment;

public class ReverseString {

	public static void main(String[] args) {
	 String str = "Good Morning Everyone ";
	 String temp ="";
	 System.out.println("Length of String : "+str.length());
	 
	 for(int i = str.length()-1 ; i>= 0 ; i-- ) {
		 temp =temp +str.charAt(i);
		 
		 }
System.out.println("Original String : "+str);
System.out.println("Reverse String : "+temp);
	}

}
