package Method;

public class M2 {

	public static void main(String[] args) {
		display ();
		display ();
		display ();      //Here directly called it.
		display ();
		M2.display ();   //static member can call by using class name
		// TODO Auto-generated method stub
}


   static void display()
   {
	   System.out.println("Hello I am a student");
	   System.out.println("I live in Pune.");
	   System.out.println("Studing Testing course in Acceleration.");
   }
}



//Access modifier = default
//non access modifier = static
//return type = void
//method name = display
//parameter/argument = not applied (NA)
//return value or statement = nothing .... As return type is void 