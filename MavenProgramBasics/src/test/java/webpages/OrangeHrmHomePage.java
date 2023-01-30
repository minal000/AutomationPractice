package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class OrangeHrmHomePage extends SeleniumUtility {

	public OrangeHrmHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this );	
	}

	@FindBy(xpath="//*[text()='PIM']")
	private WebElement pim ;
	
	public void PIMclick() {
		clickOnElement(pim);
	}
	
}
