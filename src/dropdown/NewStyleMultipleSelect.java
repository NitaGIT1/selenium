package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class NewStyleMultipleSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
		dropdown.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Blue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Black']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text() = 'Red']")).click();
		Thread.sleep(1000);
		List<WebElement> option =driver.findElements(By.xpath("//div[@class='css-9jq23d']"));

		for (WebElement options : option) {
             System.out.println(options.getText());
              }
		driver.quit();
    }
}
