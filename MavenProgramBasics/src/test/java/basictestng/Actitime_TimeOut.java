package basictestng;

import org.testng.annotations.Test;

public class Actitime_TimeOut {
  @Test(enabled=true, timeOut=200)
  public void OpenBrowserAndAppUrl() throws InterruptedException {
	  
	  Thread.sleep(180);
	  System.out.println("Open browser and enter app url");
  }
}
