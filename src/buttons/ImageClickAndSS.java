package buttons;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImageClickAndSS {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'login-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt = 'Sauce Labs Bike Light']")).click(); //image click
		Thread.sleep(2000);
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //taking screenshot
		Thread.sleep(2000);
		FileUtils.copyFile(screenshot, new File("C:\\Users\\admin\\SCREENSHOT\\Visible.png")); //saving at this location
		Thread.sleep(2000);
		System.out.println("Screenshot Saved. ");
		driver.close();
		
		
	}

}
