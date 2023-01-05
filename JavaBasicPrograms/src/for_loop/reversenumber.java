package for_loop;

public class reversenumber {

	public static void main(String[] args) {
		
	int num= 1234, rev= 0;
	
	//using for loop
	for( ; num!=0 ; num=num/10 )
	{
		int remainder= num % 10 ;
		rev = rev*10 + remainder ;
	}	 
		System.out.println("Reverse of the number is "+rev);
				
	
	 
	//using while loop
		int num1 =2345;
		int rev1 =0;
	while(num1!=0) {
		rev1= rev1*10+num1%10 ;
		num1= num1/10 ;
	}
		System.out.println("Reverse Number : "+rev1);
	
	// TODO Auto-generated method stub

	}

}
