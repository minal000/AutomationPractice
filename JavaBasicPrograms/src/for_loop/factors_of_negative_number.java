package for_loop;

public class factors_of_negative_number {

	public static void main(String[] args) {
		int num = -15;
		for(int i=num ; i<= Math.abs (num) ; i++)
		{
			if(num%i==0)
			{
				System.out.println(i );
			}
			else
			{
				continue;        //no meaning
			}
		}
		// TODO Auto-generated method stub

	

	}

}
