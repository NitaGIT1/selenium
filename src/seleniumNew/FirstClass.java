package seleniumNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		System.out.println("Page source is: " + driver.getPageSource());

		Thread.sleep(500);
		driver.quit();

	}

}
