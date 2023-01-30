package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class OrangeHrmLoginPage extends SeleniumUtility {
	
	//Initialize current web page Elements
	public OrangeHrmLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//username
	@FindBy(name="username")
	private WebElement userNameInputField ;
	
	//password
	@FindBy(name="password")
	private WebElement passwordInputField;
	
	//login
	@FindBy(css=".oxd-button")
	private WebElement loginButton;
	
	public void loginOrangeHrm(String username, String password) {
		typeInput(userNameInputField, username);
		typeInput(passwordInputField, password);
		clickOnElement(loginButton);
		
	}
	
	public String OrangeHrmLoginPageTitle() {
		 return getCurrentTitleOfApplication();
	}
	
}
