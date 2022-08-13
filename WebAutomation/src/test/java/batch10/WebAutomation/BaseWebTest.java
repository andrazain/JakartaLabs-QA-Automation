package batch10.WebAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseWebTest {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		driver.set(new ChromeDriver());
		driver.get().manage().window().maximize();
		
		explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
		
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.get().quit();
	}
	
}
