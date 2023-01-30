package basictestng;

import org.testng.annotations.Test;

public class Actitime_Priority {
  @Test(priority=1, description="Open Browser and enter Url")
  public void OpenBrowserAndAppUrl() {
	  
	  System.out.println("Open browser and enter the app url");
  }
 
  @Test(priority=2)
 public void login() {
	 
	 System.out.println("enter username, password and click on login");
 }
 
  @Test(priority=3)
 public void CreateTask() {
	 System.out.println("Create a new task");
	 
 }
 @Test(priority=4)
 public void logoutClose() {
	 
	 System.out.println("logout from the application and close the broser");
 }
 
 /**
  * by default all @Test will priority as '0'
  */
}
