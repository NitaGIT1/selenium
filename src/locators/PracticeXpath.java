package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/selenium-training?q=banner#enroll-form");
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("Nita");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("Shingade");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class = 'btn btn-block btn-primary']")).click();// button[text() ='Send']
	    driver.close();
      }
  }
