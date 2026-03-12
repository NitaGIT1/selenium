package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/menu");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		
		//find main item-1
		WebElement mainItem1 = driver.findElement(By.xpath("//a[text()='Main Item 1']"));
	    action.moveToElement(mainItem1).perform();
	    Thread.sleep(2000);
	    
	    WebElement mainItem2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	    action.moveToElement(mainItem2).perform();
	    Thread.sleep(2000);
	    
	    WebElement subList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
	    subList.click();
	    Thread.sleep(2000);
	    driver.quit();
		
	}

}
