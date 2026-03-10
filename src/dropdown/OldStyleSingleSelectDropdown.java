package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class OldStyleSingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("carselect"));
		Select select = new Select(dropdown);
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("bmw");
		Thread.sleep(2000);
		select.selectByVisibleText("Honda");
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
