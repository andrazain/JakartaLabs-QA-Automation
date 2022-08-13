package batch10.WebAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InventoryPage extends BasePage {

	public InventoryPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * 
	 * Define the locator
	 * 
	 * */
	
	By button_cart_backpack		= By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By button_cart_bikelight	= By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
	By button_shopping_cart		= By.xpath("//a[@class='shopping_cart_link']");

	public void clickAddToCartBackpack() {
		clickAndWait(button_cart_backpack);
	}
	
	public void clickAddToCartBikeLight() {
		clickAndWait(button_cart_bikelight);
	}
	
	public void clickButtonSHoppingCart() {
		clickAndWait(button_shopping_cart);
	}
}
