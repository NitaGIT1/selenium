package action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDownJSExecutor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://export.ebay.com/in/");
		Thread.sleep(2000);
		try {
			driver.findElement(By.id("onetrust-reject-all-handler")).click();
		} catch (Exception e) {
			System.out.println("cookie popup not displayed");

		}

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll down to 500 pixel
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//h2[text()='eBay advertising']"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);
		driver.close();
	}

}
