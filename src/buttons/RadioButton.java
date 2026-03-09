package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		//only single selection allowed
		driver.findElement(By.id("bmwradio")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("benzradio")).click();  //radio button click
		Thread.sleep(2000);
		driver.close();
		
	}

}
