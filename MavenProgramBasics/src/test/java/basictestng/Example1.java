package basictestng;

import org.testng.annotations.Test;

public class Example1 {
  @Test
  public void testCase1() {
	  System.out.println("Hello I an test case 1 .");
  }
  @Test
  public void testCase2() {
	  
	  System.out.println("I am test case 2.");
	  testCase3();
  }
  
  public void testCase3() {
	  
	  System.out.println("I am TC3, will not be include in testcount as test Method not generated");
	  
  }
  
}
