package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutStepTwoPage extends BasePage {

	public CheckoutStepTwoPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By button_finish		= By.xpath("//button[@id='finish']");

	public void clickButtonFinish() {
		clickAndWait(button_finish);
	}
}
