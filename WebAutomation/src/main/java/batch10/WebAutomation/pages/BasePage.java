package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();
	
	public BasePage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		this.driver = driver;
		this.explicitWait = explicitWait;
	}
	
	/*
	 * 
	 * Action
	 * 
	 * */
	
	//click
	public void clickAndWait(By locator) {
		driver.get().findElement(locator).click();
	}
		
	//set text
	public void setText(By locator, String text) {
		driver.get().findElement(locator).sendKeys(text);
	}
		
	//get text
	public String getText(By locator) {
		return driver.get().findElement(locator).getText();
	}
	
}
