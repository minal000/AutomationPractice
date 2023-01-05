package if_else.practiceprograms;

public class largestnumber {

	public static void main(String[] args) {
		int a=34, b=23, c=12;
		if(a>b || a>c)
		{
			System.out.println("largest number is a");
		}
		else if( b>a || b>c)
		{
			System.out.println("largest number is b");
		}
		else
		{
			System.out.println("largest number is c");
		}

	}

}
