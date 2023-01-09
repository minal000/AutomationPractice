package keyboardAndmouseOperator;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOpt3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        //Frame Handling
        WebElement frame = driver.findElement(By.cssSelector("iframe[class='demo-frame lazyloaded']"));
        driver.switchTo().frame(frame);
        //create an instance of Actions class by passing instance of  driver to its constructor
        Actions act = new Actions(driver);
        //first identify source and target element for drag and drop
        List<WebElement> sourceElement = driver.findElements(By.cssSelector("ul#gallery>li"));
        WebElement target = driver.findElement(By.cssSelector("div#trash"));
        //perform drag and drop operation
//          act.dragAndDrop(sourceElement.get(0), target).build().perform();
//          Thread.sleep(1000);
//          act.dragAndDrop(sourceElement.get(1), target).build().perform();
//          Thread.sleep(1000);
//          act.dragAndDrop(sourceElement.get(2), target).build().perform();
//          
//        for(int i=0 ; i<sourceElement.size() ; i++) {
//        	performDragAndDrop(act ,sourceElement.get(i),target);
//        	Thread.sleep(1000);
//        }
        
	}

	 static void performDragAndDrop(Actions act, WebElement src, WebElement target) {
		act.dragAndDrop(src, target);
		
	}


}
