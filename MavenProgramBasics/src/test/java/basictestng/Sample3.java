package basictestng;

import org.testng.annotations.Test;

public class Sample3 {
	
	int age = 25; 
  @Test
  public void signUp() {
	  
	  System.out.println("I am sign up ..");
  }
  @Test
  public void login() {
	  System.out.println("I am login..");
  }
  @Test
  public void compose() {
	  System.out.println("I am compose..");
  }
}
