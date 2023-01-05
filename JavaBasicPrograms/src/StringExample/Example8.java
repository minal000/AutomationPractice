package StringExample;

public class Example8 {

	public static void main(String[] args) {
		String str = "Pune"+1536;
		System.out.println(str);
		
		System.out.println("*****************************************");
		
		String s1 = "Mumbai";
		System.out.println(s1.concat("pune"));//in string concat need to give string,null is not considering
		
		String str1 = str.concat(null);   //this will give you error, as durinh concat null is not used
		System.out.println(str1);
		// TODO Auto-generated method stub

	}

}
