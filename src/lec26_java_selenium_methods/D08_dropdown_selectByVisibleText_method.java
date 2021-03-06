package lec26_java_selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D08_dropdown_selectByVisibleText_method {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com"); // Amazon
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	// drop down is a commonly asked interview question
	// Most commonly use method in drop down --> selectByVisibleText()
	@Test(enabled = true, priority = 1)
	public void selectByIndexTest() throws InterruptedException{
		WebElement dropElement = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropElement);
		select.selectByVisibleText("Credit and Payment Cards");
		Thread.sleep(3000);
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
