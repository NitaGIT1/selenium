package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("multiple-select-example"));
		 Select select = new Select(dropdown); 
		 
		 //selecting multiple options
		 
		 select.selectByIndex(0);
		 Thread.sleep(2000);
		 select.selectByValue("orange");
		 Thread.sleep(2000);
		 select.selectByVisibleText("Peach");
		 Thread.sleep(2000);
		 
		 //deselecting options
		 
		 select.deselectByIndex(0);
		 Thread.sleep(2000);
		 select.deselectByValue("orange");
		 Thread.sleep(2000);
		 select.deselectByVisibleText("Peach");
		 Thread.sleep(2000);
		 select.selectByValue("orange");
		 Thread.sleep(2000);
		 select.deselectAll();
		 Thread.sleep(2000);
		 driver.close();

	}

}
