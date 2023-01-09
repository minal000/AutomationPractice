package dropDown_handling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Dropdown_Handling {

	public static void main(String[] args) {
		
	//set the executable path of the driver
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				
	//create an instance of ChromeDriver
	WebDriver driver = new ChromeDriver();
				
	//maximize the window
	driver.manage().window().maximize();
				
	//implicit wait
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
	//get the url
    driver.get("https://omayo.blogspot.com/");
				
	//identify dropdown list 
    WebElement carDropdown = driver.findElement(By.id("multiselect1")) ;
    
    //create an instance of select class and pass above element into its constructor
    Select selectSkill = new Select(carDropdown);
    
    //check whether dropdown is multiselect or not 
    System.out.println(" dropdown is allowing you to select multiple option or not : "+selectSkill.isMultiple());
    
    //get default or already selected option
    //WebElement selectedOption =selectSkill.getFirstSelectedOption();
    //String selectedOptionName = selectedOption.getText();
    //System.out.println("already selected option name : "+selectSkill.getFirstSelectedOption().getText());
    
    //get option count
    List<WebElement> options = selectSkill.getOptions();
    System.out.println("Option count is : "+options.size());
    
    //get dropdown option names
    for( int i=0 ; i<options.size() ; i++) {
    	System.out.println("option "+i+": "+options.get(i).getText());
    	
    }
    //select options from dropdown
    selectSkill.selectByIndex(0);
    selectSkill.selectByIndex(2);
    selectSkill.selectByIndex(3);
    //selectSkill.selectByValue("volvox");
   // selectSkill.selectByVisibleText("Audi");
    
    //get the all selected option
    List<WebElement> selectCars =selectSkill.getAllSelectedOptions();
    System.out.println("count of selected cars : "+selectCars.size());
    
    //unselect already selected options
    selectSkill.deselectByIndex(0);
    selectSkill.deselectByValue("volvox");
    selectSkill.deselectByVisibleText("Audi");
        //or
    selectSkill.deselectAll();
    
	}

}
