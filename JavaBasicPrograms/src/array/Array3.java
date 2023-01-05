package array;

public class Array3 {

	public static void main(String[] args) {
		int numbers[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		double sum= 0;
		double average; 
		//access all elements using for each loop and each element in sum
		for (int number : numbers) {
			sum = sum + number;  //0+2=2+-9=-7+5=-2+12=10+-25=-15+22=7+9=16+8=24+12=36
			         //or
			// sum += number;  -->sum = sum+number;
			/*
			 * int age=25;
			 * age +=10; ---> age=age+10
			 */
		}
		//get the total number of elements
		int arraylength = numbers.length;
		//calculate the average convert the average from int to double
		average = sum/ arraylength;
		System.out.println("sum = "+ sum);
		System.out.println("average : "+average);
		// TODO Auto-generated method stub

	}

}
