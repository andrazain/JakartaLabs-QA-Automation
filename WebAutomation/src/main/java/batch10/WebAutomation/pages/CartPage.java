package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage extends BasePage {

	public CartPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By button_checkout		= By.xpath("//button[@id='checkout']");

	public void clickButtonCheckout() {
		clickAndWait(button_checkout);
	}
}
