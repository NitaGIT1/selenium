package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.name("email")).sendKeys("Nita");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
	}

}
