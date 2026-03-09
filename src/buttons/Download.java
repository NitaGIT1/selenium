package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		Thread.sleep(2000);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
