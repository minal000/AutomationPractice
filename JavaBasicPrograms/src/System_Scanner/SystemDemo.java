package System_Scanner;

public class SystemDemo {

	public static void main(String[] args) {
		//checking the specific property
		System.out.println("System User Dir: "+System.getProperty("user.home"));
		//System.exit(0);  //stop/terminates the execution after this line
		//clearing this property
		System.out.println("user.home");
		System.out.println(System.getProperty("user.home"));  //null
		//setting specific property
		//System.setProperty("user.home""F:\\GitAutomation\\MorningBatch1");
		System.out.println("updated system Dir: "+System.getProperty("user.home"));
		//setting specific property
		System.setProperty( "user.country" ,"IND"); 
		//checking property
		System.out.println(System.getProperty("user.country"));
		
		//checking property other than system property
		//illustriting getProperty(String key, String def)
		
		System.out.println("other than system property: "+System.getProperty("user.password", "none of your business"));
		
		System.out.println("difference between the current time and midnight, January1,1970 UTC is : "+System.currentTimeMillis());
		
		System.out.println("current time in "+"nano sec: "+System.nanoTime());
		
		// TODO Auto-generated method stub

	}

}
