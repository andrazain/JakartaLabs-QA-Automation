package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutCompletePage extends BasePage {

	public CheckoutCompletePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By header_complete		= By.xpath("//h2[@class='complete-header']");
	
	public String getCompleteCheckoutText() {
		return getText(header_complete);
	}

}
