package MethodOverloading;

public class ForNonStatic {
	
	public void cube() {
		System.out.println("With zero parameter non-static method overloading");
	}
	
	private void cube(int number) {
		 int result = number*number*number;
		System.out.println("With interger parameter non static method overloading "+result);
	}
	
	public void cube (float number) {
		float result = number*number*number ;
		System.out.println("With float parameter non static method overloading "+result);
	}

	public static void main(String[] args) {
		//obj created as non static
		ForNonStatic C1 = new ForNonStatic();
		C1.cube();
		C1.cube(12);
		C1.cube(11f); //need to right f for float, otherwise it will take it as double, and here is not method with double parameter
		C1.cube(3l);    //method with long parameter is not here, but float can store long so float paramater method called in this case
		
		// TODO Auto-generated method stub

	}

}
