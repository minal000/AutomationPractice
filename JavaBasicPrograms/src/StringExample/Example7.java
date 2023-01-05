package StringExample;

public class Example7 {

	public static void main(String[] args) {
		String s1 = "I am Minal, from Pune, Student.";
		System.out.println("Actual Strig to be print : "+s1);
		
	String[] strAry = s1.split(" ");
		for(String s : strAry) {
			System.out.println(s);
		}
//		for(int i=0 ; i<s1.length(); i++) {
//			System.out.println(strAry);
//		}
		
System.out.println("------------------------------------------");
        String s2 = "I am a tester";
        System.out.println("Actual string of s2 to print : "+s2);
        
        String[] strAry2 = s2.split(" ",3);
        for(String s : strAry2) {
        	System.out.println(s);
        }
 System.out.println("-------------------------------------------");
//        String s3 = "Hello, Good Morning Everyone";
//        System.out.println("Actual string of S3 to print : "+s3);
//        
//        String str[] = s3.split(" ");
//        String temp = "" ;
//        for(String s : str) {
//        	System.out.println(s);
//        }
//        for( int i=str.length-1 ; i>=0 ; i--) {
//        	temp = temp+" "+str[i];
//        }
//        System.out.println("Reverse statement : "+temp);
        System.out.println("-----------------------------");
        String s4 = "     I am a Girl     ";
        System.out.println("String with actual spaces : "+s4);
        System.out.println("Actual length of String : "+s4.length());
        System.out.println("Actual String without spaces : "+s4.trim());
        System.out.println("Actual string Length without spaces : "+s4.trim().length());
        System.out.println("-----------------------");
        
        String s5 = "I am    a Girl";
        System.out.println("String with actual spaces : "+s5);
        System.out.println("Actual length of String : "+s5.length());
        System.out.println("Actual String without spaces : "+s5.trim());
        System.out.println("Actual string Length without spaces : "+s5.trim().length());
	}
	
	
	

	}
	// TODO Auto-generated method stub


		

	


