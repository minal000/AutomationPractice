package basictestng;

import org.testng.annotations.Test;

public class Sample2 {
	int age = 25 ; 
  @Test
  public void testCase1() {
	  System.out.println("Hi..");
  }
  @Test
  public void testCase2() {
	  System.out.println("I am test case 2 ..");
	  System.out.println("Age is : "+age);
  }
  @Test
  public void testCase3() {
	  System.out.println("I am test Case 3..");
	  System.out.println("TC 3 Age : "+age);
  }
  
  /**
   * If a class is having more than one test Method then all the test,
   * will be executed in alphabetical order
   */
}

