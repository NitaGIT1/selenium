package buttons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.letskodeit.com/practice");
		Thread.sleep(2000);
		//multiple checkbox can 
		driver.findElement(By.id("bmwcheck")).click();  	//clicking on bmw checkbox
		Thread.sleep(2000);
		driver.findElement(By.id("benzcheck")).click(); 
		Thread.sleep(2000);
	    driver.close();
		
		
	}

}
