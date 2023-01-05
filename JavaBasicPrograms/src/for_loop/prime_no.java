package for_loop;

public class prime_no {

	public static void main(String[] args) {
		int num= 7, count=0;
		for(int i=1 ; i<=num ; i++)
		{
			if ( num%i == 0 )
			{
				count++ ;
			}
			if (count == 2)
			{
				System.out.println("Given number is prime. ");
			}
			else
			{
				System.out.println("Number is not Prime.");
			}
		}
		// TODO Auto-generated method stub

	}

}
