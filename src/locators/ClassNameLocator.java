package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/facebook.html");
		driver.findElement(By.className("inputtext")).sendKeys("nita");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.id("u_0_b")).click();
		driver.close();
	}

}
