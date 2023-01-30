package basictestng;

import org.testng.annotations.Test;

public class ActiTime_Enabled {
  @Test(enabled=true)
  public void OpenBrowserAndAppUrl() {
	 
	  System.out.println("open browser and enter the app url");
  }
  @Test(enabled=false)
  public void login() {
	  
	 System.out.println("enter the username, password and click on login"); 
  }
  
  @Test(enabled=false)
  public void createNewTask() {
	  
	  System.out.println("create the new task");
  }
  
  @Test(enabled=false)
  public void logoutClose() {
	  
	  System.out.println("Logout from the application and close the browser");
  }
  
  
  /**
   * By default all @Test will have enabled=true
   */
}

