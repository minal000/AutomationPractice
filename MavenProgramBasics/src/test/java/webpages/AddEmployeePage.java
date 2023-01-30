package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class AddEmployeePage extends SeleniumUtility {
	
    public AddEmployeePage(WebDriver driver) 
    {
    PageFactory.initElements(driver, this);	
    }
    
    //First Name
    @FindBy()
    private WebElement firstNameInputField;
    
    
    //Last Name
    
    
    //Employee ID
    
    
    //Save Button
    
    
    //Function : addEmployee
    
}
