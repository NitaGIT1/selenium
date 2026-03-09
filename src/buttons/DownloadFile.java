package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://eternallybored.org/misc/wget/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("ZIP")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
