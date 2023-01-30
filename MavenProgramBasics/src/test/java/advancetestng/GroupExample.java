package advancetestng;

import org.testng.annotations.Test;

public class GroupExample {
  @Test(groups = "Regression")
  public void testCaseOne() {
	  
	  System.out.println("I am in testcase one - in Regression groups");
  }
  
  @Test(groups = "Regression")
  public void testCaseTwo() {
	  
	  System.out.println("I am in test case 2 - in Regresson groups");
  }
  
  @Test(groups = "Smoke Test")
  public void testCaseThree() {
	  
	  System.out.println("I'm test Case 3 - in Smoke group");
  }
  
  @Test(groups = "Regression")
  public void testCaseFour() {
	  
	  System.out.println("I'm test case 4 - in Regression group");
  
  }
  
  @Test(groups = "Smoke Test")
  public void testCaseFive() {
	  
	  System.out.println("I'm test case 5 - in smoke test group");
  }
  
}
