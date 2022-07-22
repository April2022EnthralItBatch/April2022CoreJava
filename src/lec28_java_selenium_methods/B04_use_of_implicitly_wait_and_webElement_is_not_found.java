package lec28_java_selenium_methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class B04_use_of_implicitly_wait_and_webElement_is_not_found {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.manage().deleteAllCookies();
		driver.get("https://portal.cms.gov/portal/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// Here, WebDriver will wait for 20 seconds to find any web element under this class 
		// and then it will through exception if web element not found
		// But if the element is found before 20 seconds, it will go to next level means not wait for 20 seconds
		
	}
	
	@Test
	public void loginButtonTest() throws InterruptedException {
		driver.findElement(By.id("dms-login-submit")).click();  // Learn from here if there is no such element in the UI
		// org.openqa.selenium.NoSuchElementException: no such element: 
		// Unable to locate element: {"method":"css selector","selector":"#dms\-login\-submit"}
		Thread.sleep(5000);
	}
		
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
