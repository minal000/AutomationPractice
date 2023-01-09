package keyboardAndmouseOperator;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class GetScreenShot {

	public static void main(String[] args) {
		
		SeleniumUtility m1 =new SeleniumUtility();
		WebDriver driver = m1.setUp("chrome", "https://www.google.com");
		//type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot)driver;
		//get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file = ts.getScreenshotAs(OutputType.FILE);
		//store above screenshot into required location
		FileUtils.copyFile(file,new File(".\\screenshots\\google.jpg"));

	}

}
