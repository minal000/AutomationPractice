package dropDown_handling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StandardHtmlDropdown {

	public static void main(String[] args) {
		//set the executable path of browser
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		
		//create an instance of ChromeDriver
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter the url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify dropdown list 
		WebElement skillDropdown = driver.findElement(By.id("Skills"));
		
		//create an instance of select class and pass above element into its constructor
		Select selectSkill = new Select(skillDropdown);
		
		//check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option : "+selectSkill.isMultiple());
		
		//**** get default or already select option
//		WebElement selectOption = selectSkill.getFirstSelectedOption();
//		String selectOptionName = selectOption.getText();
//		System.out.println("already selected option name : "+selectOptionName);
		//or
		System.out.println("Already selected option name : "+selectSkill.getFirstSelectedOption().getText());
		
		//get option count
		List<WebElement> option = selectSkill.getOptions();
		System.out.println("count of Options : "+option.size());
		
		//Get dropdown option  names
		 for(int i=0 ; i<option.size() ; i++) {
			 System.out.println("Option " + i + ": "+option.get(i).getText());
			 
		 }
		
		 
		 //TODO:  validation dropdown skills are getting displayed in ascending order
		 selectSkill.selectByIndex(4);
		 System.out.println("already selected option name : "+ selectSkill.getFirstSelectedOption().getText());
		 //or
		 selectSkill.selectByValue("Backup Management");
		 System.out.println("already selected option name : "+selectSkill.getFirstSelectedOption().getText());
		 //or
		 selectSkill.selectByVisibleText("Analytics");
		 System.out.println("already seleccted option name : "+selectSkill.getFirstSelectedOption().getText());
		 
		 //checking the order of skills
		 String actual_skillName="";
		 //get dropdown option names
		 for(int i =1; i<option.size(); i++) {
			 if((option.size()-1)!=i) {
				 actual_skillName = actual_skillName+option.get(i).getText();
			 }else {
					 actual_skillName = actual_skillName+option.get(i).getText();
				 }
			 }
		 //Expected skills
		 String exp_skillName = "Adobe InDesign, Adobe photoshop, Analytics, Android, APIs, Art Design, AutoCAD" ;
		 System.out.println("actual skill name : "+actual_skillName);
	     System.out.println("expected skill name : "+exp_skillName);
	     System.out.println("skills are in sorted or not : "+actual_skillName.equals(exp_skillName));
		 
		 //TODO : perform validation on following
//		 1. Year(ascending order validation)
//		 2. Month(month sequence validation)
//		 3. Days(ascending order validation)
		 
		Select dayDrop = new Select(driver.findElement(By.id("daybox")));
		List<Integer> days = new ArrayList<Integer>();
		for(int i=1 ; i<dayDrop.getOptions().size() ; i++) {
			String day = dayDrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));         //get text returns string,to convert it into integer
		}
		List<Integer> dupDays = new ArrayList<Integer>(days);
		//dupDays.addAll(days);
		Collections.sort(dupDays);
		System.out.println(days.equals(dupDays));
		
	}
}

