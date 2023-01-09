package keyboardAndmouseOperator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpt2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.globalsqa.com/demo-site/");
		
		//identify all the elements of main menu
		List<WebElement> mainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li/a"));
        System.out.println("main menu options counts : "+mainMenu.size());
        
        //create an instance of Action class by passing required browser instance to its constructor
        Actions act = new Actions(driver);
        
        /**to do hover over the Home option*/
		act.moveToElement(mainMenu.get(2)).perform();
		
		/** to do hover over all the menu */
		for(int i=0 ; i<mainMenu.size() ; i++) {
		WebElement options = mainMenu.get(i);
			act.moveToElement(options);
			Thread.sleep(1000);
			
		}
        /**Mouse Hover using reusable function/method*/
		mouseHoverOverInTheElement(act,mainMenu.get(2));
    	mouseHover(act, mainMenu);
		
		/**Mouse hover with cords */
		act.moveToElement(mainMenu.get(2), 100, 0).perform();
		
		/**mouse hover with cords using reusable function*/
		mouseHoverWithCords(act ,mainMenu.get(1),100,0);
		
		/** Right click on required Element */
		rightClick(act, mainMenu.get(1));
		
	}

	    static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) {
		
		System.out.println("Options name is : "+option.getText());
	    act.moveToElement(option, x, y).perform();
	    
	    }
		
	static void rightClick(Actions act, WebElement option) {
		System.out.println("Options name is : "+option.getText());
		act.moveToElement(option).contextClick().build().perform();
		//act.contextClick().build().perform();
	}

	static void mouseHover(Actions act, List<WebElement> mainMenu) throws InterruptedException {
		for(int i=0 ; i<mainMenu.size() ; i++ ) {
			WebElement options = mainMenu.get(i);
			act.moveToElement(options);
		Thread.sleep(1000);
		}
		
	}

	static void mouseHoverOverInTheElement(Actions act, WebElement element) {
	act.moveToElement(element).perform();	
		
	}
	
}


