package google.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class GoogleSearchPage extends SeleniumUtility {

	//Initialize current page using page factory
	public GoogleSearchPage(WebDriver driver) {
		//this driver = driver ;
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(name="q")
	private WebElement searchInputField;
	
	@FindBy(css = "ul>li>div>div:nth-of-type(2)>*:first-child>span")
	private List<WebElement> googleSuggestionsList;
	
	public List<WebElement> searchTextAndGetSuggestions(String text){
	  typeInput(searchInputField, text);
	  return googleSuggestionsList;
	}
	
	public void searchText(String text) {
		typeInput(searchInputField,text);
		getActiveElement().sendKeys(Keys.ENTER);
	}
	
}
