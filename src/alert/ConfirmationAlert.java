package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println("alert confirmation: "+alert1.getText());
		Thread.sleep(2000);
		alert1.dismiss();
		Thread.sleep(2000);
		driver.quit();
       }

}
