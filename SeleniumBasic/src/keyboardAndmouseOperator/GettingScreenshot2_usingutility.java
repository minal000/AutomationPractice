package keyboardAndmouseOperator;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GettingScreenshot2_usingutility {

	public static void main(String[] args) {
		
		SeleniumUtility m1 =new SeleniumUtility();
		WebDriver driver = m1.setUp("chrome", "https://www.google.com");
		//type cast WebDriver instance into TakesScreenshot interface
		m1.takeScreenshot(".\\screenshots\\google.jpg");
	}

	
}
