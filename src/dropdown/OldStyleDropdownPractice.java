package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OldStyleDropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Thread.sleep(2000);
		Select select = new Select(dropdown);
		Thread.sleep(2000);
		List<WebElement> opt = select.getOptions();
		for (WebElement option : opt) {
			System.out.println(option.getText());
		}

		select.selectByIndex(4);
		Thread.sleep(2000);
		select.selectByValue("red");
		Thread.sleep(2000);
		select.selectByVisibleText("Magenta");
		Thread.sleep(2000);
		driver.close();

	}

}
