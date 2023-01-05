package Method;

public class Circle {
	public static double areaofcircle (double pi, double r)
	{
		double area ;
		area= pi*r*r ;
		System.out.println("Area of circle is "+area);
		return(area) ;
	}
	

	public static void main(String[] args) {
		areaofcircle( 3.14 , 4 );
		areaofcircle(3.14, 3);
		// TODO Auto-generated method stub

	}

}




//Access modifier = public
//non access modifier = static
//return type = double
//method name = areaofcircle
//parameter/argument = double double
//return value or statement = double i.e area