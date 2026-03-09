package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url = "https://the-internet.herokuapp.com/upload";
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id = 'file-upload']"))
	    .sendKeys("C:\\chromedriver.exe");
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		driver.close();
		

	}

}
