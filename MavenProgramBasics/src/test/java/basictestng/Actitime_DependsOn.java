package basictestng;

import org.testng.annotations.Test;

public class Actitime_DependsOn {
	
  @Test(enabled=true, priority=1)
  public void OpenBrowserAndAppUrl() {
	  
	  int i= 1/0;
	   System.out.println("Open Browser and enter app URL");
  }
  
  @Test(enabled=true, priority=2, dependsOnMethods="OpenBrowserAndAppUrl")
  public void login() {
	  
	  System.out.println("Enter username, Password and click on login button");
	  
  }
  
  @Test(enabled=true, priority=3, dependsOnMethods="login")
  public void CreateTask() {
	  
	  System.out.println("Create new Task");
  }
  
  @Test(enabled=true, priority=4, dependsOnMethods="CreateTask")
  public void logOutClose() {
	  
	  System.out.println("Logout from application and close the browser");  
  }
}
