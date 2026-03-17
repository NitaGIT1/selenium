package windowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		String parent = driver.getWindowHandle();

		driver.findElement(By.id("tabButton")).click();
		driver.findElement(By.id("windowButton")).click();

		//sometimes pop up is blocked
		try {
			driver.findElement(By.id("messageWindowButton")).click();
		} catch (Exception e) {
			System.out.println("Message window did not open");
		}

		Thread.sleep(2000);

		Set<String> windows = driver.getWindowHandles();

		for (String w : windows) {

			if (!w.equals(parent)) {

				driver.switchTo().window(w);

				try {
					String text = driver.findElement(By.tagName("body")).getText();
					System.out.println("Child Window Text: " + text);
				} catch (Exception e) {
					System.out.println("Unable to read message window");
				}

				driver.close();
			}
		}

		driver.switchTo().window(parent);

		String heading = driver.findElement(By.xpath("//h1")).getText();
		System.out.println("Parent Window Heading: " + heading);

		driver.quit();
	}
}