package project5_browserOptions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentValidation {

	public static void main(String[] args) {
		//set required browser driver executable path using System.setProperty(key,value)
		System.setProperty("webdriver.chrome.driver", ".//drivers\\chromedriver.exe");
		
		//create an instance of required browser class
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the required url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		// identify first name input field
		WebElement addressInputField = driver.findElement(By.className("form-control"));
		
		/*
		 * visible --> isDisplayed()
		 * Editable --> isEnabled()
		 * Default value --> getAttribute(String attributename)
		 */
		
		System.out.println("First name i/p field visible or not ? "+addressInputField.isDisplayed());
		
		System.out.println("First name i/p field editable or not? "+addressInputField.isEnabled());
		
	//	String firstNameInputFieldValue = addressInputField.getAttribute("placeholder");
		
		//System.out.println("Default value validation status : "+addressInputFieldValue.equals(""));
		
		//identify male radio button
		WebElement maleRadioBtn = driver.findElement(By.name("radiooptions"));
		
		/*
		 *visible
		 *functional
		 *by default should not be selected
		 *select and verify,now its selected or not 
		 */
		System.out.println("male radio button visible or not ? "+maleRadioBtn.isDisplayed());
		
		System.out.println("male radio button functional or not ? "+maleRadioBtn.isEnabled());
		
		System.out.println("male radio button default selection status? "+maleRadioBtn.isSelected());
		maleRadioBtn.click();
		System.out.println("After selection, male radio button selection status ? "+maleRadioBtn.isSelected());

		//identify submit button
		WebElement submitBtn = driver.findElement(By.id("submitbtn"));
		
		/*
		 * visible -- isDisplayed()
		 * functional --- isEnabled()
		 * default value -- button name is coming from inner HTML text, so we will be using getText()
		 * 
		 */
		
		System.out.println("submit button visible or not ? "+submitBtn.isDisplayed());
		
		System.out.println("submit button functional or not ? "+submitBtn.isEnabled());
		
		String actualButtonName = submitBtn.getText().trim();   //text has additional spaces,
		                                                        //to remove that use trim()
		System.out.println("submit button name validation status ? "+actualButtonName.equals("Submit"));
		
		
		
		// TODO Auto-generated method stub

	}

}
