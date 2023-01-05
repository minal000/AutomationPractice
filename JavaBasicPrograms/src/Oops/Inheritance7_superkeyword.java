package Oops;

class Fruit1 {
	
Fruit1() {
	      int fruitage = 7 ;
	System.out.println("Fruit class constructor..");
}
 public void Taste() {
	System.out.println("Fruit are Sweet..");
}
}
class Orange2 extends Fruit1 {
	int fruitage;
	Orange2() {
		//default super statement of parent class execute
		System.out.println("Orange class constructor..");
		fruitage= 5;
	}
	public void Taste() {
		System.out.println("Orange are Sweet..");
	}
	public void Shape() {
		System.out.println("Orange is round in shape..");
		System.out.println("Orange fruitage is "+fruitage );
		System.out.println("Fruits fruitage is "+fruitage );  //need to use superkeyword to print parent age 
		Taste();
		super.Taste();   //super keyword indicates it is parent class method, as child and parent contain same method 
	}
}

public class Inheritance7_superkeyword {

	public static void main(String[] args) {
		System.out.println("--------------------------------------------------");
		Orange2 O1 = new Orange2() ;
		O1.Taste();
		O1.Shape();
		
		// TODO Auto-generated method stub

	}

}
