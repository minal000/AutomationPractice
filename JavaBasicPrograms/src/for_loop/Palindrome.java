package for_loop;

public class Palindrome {

	public static void main(String[] args) {
		int num =123, temp =0 ;
		while(num!=0) {
			temp =temp*10+num%10;
			num = num/10;
			
		}
		System.out.println(temp);
		
		if(num==temp) {
			System.out.println("Given num is palindrome");
		} 
		else {
			System.out.println("Given num is not palindrome");
		}
	}

}
