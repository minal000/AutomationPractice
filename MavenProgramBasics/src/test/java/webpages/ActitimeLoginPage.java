package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility{
	
	//Initialize current web page Elements
	public ActitimeLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	//username
	@FindBy(css="#username")
	private WebElement usernameInputField;
	
	//password
	@FindBy(xpath="[//input[@name='pwd']")
	private WebElement passwordInputField;
	
	//loginButton
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void loginInActitime(String username, String password) {
		typeInput(usernameInputField, username);
		typeInput(passwordInputField, password);
        clickOnElement(loginButton);
	}

	public String actitimeLoginPageTitle() {
		return getCurrentTitleOfApplication();
	}

}
