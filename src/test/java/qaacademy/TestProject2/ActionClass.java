package qaacademy.TestProject2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ActionClass {

	@Test
	public void launch() {

		System.setProperty("webdriver.chrome.driver", "/Users/admin/Desktop/Work/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("way2Automation");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("btnK")));
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.cssSelector("#rso .g div div.rc a")).click();
		WebElement ResourcesTest = driver.findElement(By.linkText("RESOURCES"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(ResourcesTest).build().perform();
		driver.findElement(By.linkText("Practice site 1")).click();
	    //Testing ends

	}

}
