package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		System.out.println("Main page title: "+driver.getTitle());
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		//get all windows
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		 String parentID = it.next();
		 String childId = it.next();
		 Thread.sleep(2000);
		 
		 //switch to child window
		 driver.switchTo().window(childId);
		 System.out.println("Child title page: "+driver.getTitle());
		 Thread.sleep(2000);
		 
		 //switch back to again parent window
		 driver.switchTo().window(parentID);
		 System.out.println("Parent title page: "+driver.getTitle());
		 Thread.sleep(2000);
		 driver.quit();
     }

}
