package StringExample;

public class Example9 {

	public static void main(String[] args) {
		String s2 = "1235" ;
		System.out.println("S2 : "+s2);
		
		//int sum=s2+100 ;    //compile time error, because we cannot store string into int
		
		//if string object contains int value, then before using it for any arithmatic operation first convert it into int
		 int num = Integer.parseInt(s2);
		 int sum = num+100 ;
		 System.out.println("Result : "+sum);
		// TODO Auto-generated method stub

	}

}
