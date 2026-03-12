package action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions action = new Actions (driver);
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		//double click
		action.doubleClick(doubleClickButton).perform();
		System.out.println(driver.findElement(By.id("doubleClickMessage")).getText());
		Thread.sleep(2000);
		
		//right click
		action.contextClick(rightClickButton).perform();
		System.out.println(driver.findElement(By.id("rightClickMessage")).getText());
		Thread.sleep(2000);
		
		//click and hold
		action.clickAndHold(doubleClickButton).pause(2000).release().perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
