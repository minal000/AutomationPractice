package Method;

public class M3 {

	public static void main(String[] args) {
		iseven(44);
		//M3.iseven()44;
		System.out.println("Given no. is "+iseven(44));  //we print it by using directly method.
		
		
	//	boolean result = iseven(44);  //we print it by storing it in another variable,here we store in result,
	//	System.out.println("Given number is "+result);
		
		
		// TODO Auto-generated method stub

	}
static boolean iseven (int num)
{
	if(num%2==0)
	{
		return( true);
	}
	else
	{
		return (false);
	}
}
}
