package string_assignment;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		String str ="Java J2EE Java JSP J2EE";
		int t = str.length();
		System.out.println(" Total Length of String : "+t);
        int r = str.replaceAll("J", "").length();
        System.out.println("Length of string after removing J : "+r);
        
        int countOfCharOcc = t-r ;
        System.out.println("count of occurance of J in given string : "+countOfCharOcc);
	}

}
