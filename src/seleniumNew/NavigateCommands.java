package seleniumNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.toolsqa.com/selenium-training/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Go To Registration ']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().to("https://www.toolsqa.com/");
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();

	}

}
