package advancetestng;

import org.testng.annotations.Test;

public class IncludeAndExcludeTestMethods {
  @Test
  public void addLocationTestCase() {
	  System.out.println("I'm in add location test case");
  }
  
  @Test
  public void addDepartmentTestCase() {
	  System.out.println("I'm in add department test case");
  }
  
  @Test
  public void addEmployeeTestCase() {
	  System.out.println("I'm in add employee test case");
  }
}