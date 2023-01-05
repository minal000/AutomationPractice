package System_Scanner;
class Training{
	Training(){
		System.out.println("Training class Constructor");
	}
	void manualTesting() {
		System.out.println("I am from manual Testing");
	}
	void automationTesting() {
		System.out.println("I am from automation Testing");
	}
}

public final class SystemDemo2 {
	static Training t1 = new Training();
	public static void main(String[] args) {
		 Training t2 = new Training();
		 t2.manualTesting();
		 t2.automationTesting();
		 //accessing static member
		 SystemDemo2.t1.manualTesting();
		 SystemDemo2.t1.automationTesting();
		 System.out.println("Hi, I am Shailesh");
		 System.out.println("Hi, I am pune"); //to display some message  in the form of error
		// TODO Auto-generated method stub

	}

}
