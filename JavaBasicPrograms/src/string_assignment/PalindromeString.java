package string_assignment;

public class PalindromeString {

	public static void main(String[] args) {
		String orgStr = "MADAM";
		 int len = orgStr.length();
     System.out.println("Legth of String is : "+len);
     
     String rev ="";
     for(int i= len-1 ; i>=0 ; i--) {
    	 rev= rev+ orgStr.charAt(i);
    	 
     }
     System.out.println("Original String : "+orgStr);
     System.out.println("reverse String : "+rev);
     
     if(orgStr.equals(rev)) {
    	 System.out.println(" String is Palindrome");
     }
     else {
    	 System.out.println("String is not Palindrome");
     }
     
	}

}
