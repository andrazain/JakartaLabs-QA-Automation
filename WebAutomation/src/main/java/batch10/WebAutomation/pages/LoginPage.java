package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	public LoginPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By textfield_username	= By.xpath("//input[@id='user-name']");
	By textfield_password	= By.xpath("//input[@id='password']");
	By button_login			= By.xpath("//input[@id='login-button']");
	
	public void insertUsername(String username) {
		setText(textfield_username, username);
	}
	
	public void insertPassword(String password) {
		setText(textfield_password, password);
	}
	
	public void clickLoginButton() {
		clickAndWait(button_login);
	}
	
}