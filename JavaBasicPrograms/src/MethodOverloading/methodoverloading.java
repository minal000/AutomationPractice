package MethodOverloading;

class displayoverloading {
	//non static
	public void display(char a ) {
		
		System.out.println("Given character "+a);
		
	}
	
	void display(char a, int b) {
		
		System.out.println("Print character "+a+" Print number "+b);
		
	}
	
	
}

public class methodoverloading {

	public static void main(String[] args) {
		//object created as method non static
		displayoverloading  Z = new displayoverloading() ;
		Z.display('W');
		Z.display('M', 68);
		
		
		
		// TODO Auto-generated method stub

	}

}
