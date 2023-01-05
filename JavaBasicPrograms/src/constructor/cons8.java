package constructor;
 class B{
    int i=10;
   B() {
          int i=23;
          System.out.println("class B constructor calling..");   
}

}




public class cons8 {

	public static void main(String[] args) {System.out.println("main() class cons8 is static..");
	B b1 = new B();
	System.out.println("Global variable of class B is "+b1.i);
	
	System.out.println("=====================================");
	
	B b2 = new B();
	System.out.println("Global variable of class B is "+b2.i);
	System.out.println("Main() of class cons8 is ended..");
	
		// TODO Auto-generated method stub

	}

}
