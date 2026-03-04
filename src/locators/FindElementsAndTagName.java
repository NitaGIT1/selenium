package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAndTagName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.wikipedia.org/");
		Thread.sleep(5000);
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		System.out.println("Total link size: " + Links.size());
		for (WebElement Link : Links) {
			System.out.println(Link.getText());
		}
		driver.quit();
	}

}
