package basictestng;

import org.testng.annotations.Test;

public class Sample1 {

	int age =25;
	void display() {
		System.out.println("I am display");
	}
	@Test
	public void testCase1() {
		System.out.println(" Test Case 1...");
		System.out.println("age : "+age);
		display();
	}
	
	/**
	 * Test run count depends on method having @test annotation
	 */
}
