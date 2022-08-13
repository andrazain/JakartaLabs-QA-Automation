package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutStepOnePage extends BasePage {

	public CheckoutStepOnePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By textfield_firstname		= By.xpath("//input[@id='first-name']");
	By textfield_lastname		= By.xpath("//input[@id='last-name']");
	By textfield_zipcode		= By.xpath("//input[@id='postal-code']");
	By button_continue			= By.xpath("//input[@id='continue']");
	
	public void insertFirstName(String firstName) {
		setText(textfield_firstname, firstName);
	}
	
	public void insertLastName(String lastName) {
		setText(textfield_lastname, lastName);
	}
	
	public void insertZipCode(String zipCode) {
		setText(textfield_zipcode, zipCode);
	}
	
	public void clickButtonContinue() {
		clickAndWait(button_continue);
	}
}
