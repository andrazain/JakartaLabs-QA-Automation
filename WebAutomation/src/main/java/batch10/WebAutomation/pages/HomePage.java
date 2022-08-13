package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By textfield_email	= By.xpath("//input[@id='login']");
	By button_arrow		= By.xpath("//i[@class='material-icons-outlined f36']");
	
	public HomePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	public void insertEmail(String email) {
		setText(textfield_email, email);
	}
	
	public void checkEmail() {
		clickAndWait(button_arrow);
	}
}