package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);
		Thread.sleep(2000);
		WebElement uploadButton = driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(2000);
		uploadButton.sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitbutton")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
