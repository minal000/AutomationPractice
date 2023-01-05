package array;

public class Array0 {

	public static void main(String[] args) {
		//String [] cars ;  //declaration
		//cars = new String[4];  // initialization
		      //or
		//cars[0]="volvo";
	    //cars[1]="BMW";
		//cars[2]="Ford";
	    //cars[3]="Mazda";
		     //or
		String cars[]= {"volvo", "BMW", "Ford", "Mazda"};
		//Access the elements of an array
		System.out.println(cars[0]);
		//change an array element
		cars[0]="opel";
		System.out.println(cars[0]);
		//array element count
		System.out.println(cars.length);
		System.out.println("-----------normal for loop----------");
		//iterate array element by using for loop
		for(int i =0 ; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println("--------for-each loop--------");
		//iterate array element using for-each loop
		for(String i : cars) {
			System.out.println(i);
		}
		
		
		// TODO Auto-generated method stub

	}

}
