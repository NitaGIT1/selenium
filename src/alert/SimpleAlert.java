package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']")).click();
		Alert alert1 = driver.switchTo().alert();
		System.out.println("Simple Alert Text: "+alert1.getText());
		Thread.sleep(2000);
		alert1.accept();
		driver.close();
	

	}

}
