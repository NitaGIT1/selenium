package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		String parentID = driver.getWindowHandle();

		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		Thread.sleep(2000);
	
		Set<String> allWindows = driver.getWindowHandles();
		for (String id : allWindows) {
			if (!id.equals(parentID)) {
				driver.switchTo().window(id);
				Thread.sleep(2000);
				String text = driver.findElement(By.id("sampleHeading")).getText();
				System.out.println("cild window text: " + text);

			}
		}
		Thread.sleep(2000);
		driver.switchTo().window(parentID);
		String parentHeading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Parent Heading: " + parentHeading);
		Thread.sleep(2000);
		driver.quit();
	}

}
