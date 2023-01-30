package basictestng;

import org.testng.annotations.Test;

public class Actitime_InvocationCount {
	
  @Test(enabled=true, invocationCount=5)
  public void OpenBrowserAndAppUrl() {
	  
   System.out.println("Open Browser and enter the app url");
   
  }
  
  /**
   * we can define multiple parameter in @Test by using comma separator
   *invocationCount means that method will execute no.given times
   */
}
