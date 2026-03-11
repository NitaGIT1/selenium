package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Prompt alert text: "+alert1.getText());
		alert1.sendKeys("hello prompt");
		Thread.sleep(2000);
		alert1.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
