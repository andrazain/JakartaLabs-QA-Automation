package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InboxPage extends BasePage {

	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By contentOfEmail	= By.xpath("//*[@id=\"mail\"]/div");
	
	public InboxPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	
	//get Text for assert
	public String getContentOfEmail() {
		return getText(contentOfEmail);
	}
	
}
