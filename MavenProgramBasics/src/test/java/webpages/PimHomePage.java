package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities2.SeleniumUtility;

public class PimHomePage extends SeleniumUtility{
	
	public PimHomePage(WebDriver driver) {
		PageFactory.initElements(driver,this );	
	}

	@FindBy(css=".orangehrm-paper-container>div>button")
	private WebElement addButton;
	
	@FindBy(xpath="//div[div[label[text()='Employee Id']]]/div[2]/input")
	private WebElement employeeIdInputField;
	
	@FindBy(css=".oxd-form-actions>button:nth-child(2)")
	private WebElement searchButtonOnPimPage;
	
	@FindBy(css=".orangehrm-vertical-padding>span")
	private WebElement searchResultCountMsg;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) label>input")
	private WebElement firstEmpCheckBox;
	
	@FindBy(css=".oxd-table-body>div:nth-child(1) .oxd-icon.bi-pencil-fill")
	private WebElement firstEmpEditSymbol;
	
	@FindBy(css= ".oxd-table-body>div:nth-child(1) .oxd-icon.bi-trash")
	private WebElement firstEmpDeleteSymbol;
	
	@FindBy(css=".orangehrm-modal-footer>button:nth-child(2)")
	private WebElement yesButtonOnConfirmPopup;
	
	//Function: search employee
	public void searchCreatedEmployee(String employeeId) {
	  typeInput(employeeIdInputField,employeeId);
	clickOnElement(searchButtonOnPimPage);
	}
	
	//Function: getSearchResultMsg
	public String getSearchResultMsg() {
		return getTextFromElement(searchResultCountMsg);
	}
	//Function: deleteCreatedEmployee
	public void deleteCreatedEmployee() {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpDeleteSymbol);
		clickOnElement(yesButtonOnConfirmPopup);
	}
	//Function: clickOnEditSymbolOfCreatedEmployee
	public void editCreatedEmployee(String jobTitle) {
		clickOnElement(firstEmpCheckBox);
		clickOnElement(firstEmpEditSymbol);
	}
	
}
