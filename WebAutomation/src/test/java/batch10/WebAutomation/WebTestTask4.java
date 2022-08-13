package batch10.WebAutomation;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import batch10.WebAutomation.pages.CartPage;
import batch10.WebAutomation.pages.CheckoutCompletePage;
import batch10.WebAutomation.pages.CheckoutStepOnePage;
import batch10.WebAutomation.pages.CheckoutStepTwoPage;
import batch10.WebAutomation.pages.CommonPage;
import batch10.WebAutomation.pages.InventoryPage;
import batch10.WebAutomation.pages.LoginPage;

public class WebTestTask4 extends BaseWebTest {

	LoginPage loginPage 					= new LoginPage(driver, explicitWait);
	InventoryPage inventoryPage				= new InventoryPage(driver, explicitWait);
	CartPage cartPage 						= new CartPage(driver, explicitWait);
	CheckoutStepOnePage checkoutStepOne 	= new CheckoutStepOnePage(driver, explicitWait);
	CheckoutStepTwoPage checkoutStepTwo 	= new CheckoutStepTwoPage(driver, explicitWait);
	CheckoutCompletePage checkoutComplete	= new CheckoutCompletePage(driver, explicitWait);
	CommonPage commonPage 					= new CommonPage(driver, explicitWait);
	
	/*
	 * 
	 * delcare some variable
	 * 
	 * */
	
	String username		= "standard_user";
	String password		= "secret_sauce";
	String firstName 	= "Herdian";
	String lastName 	= "Chandra";
	String zipCode		= "12345";
	
	@Test
	public void checkoutSuccessfully() {
		
		//open the url
		commonPage.openUrl("https://www.saucedemo.com/");
		
		//step by step
		//login page
		loginPage.insertUsername(username);
		loginPage.insertPassword(password);
		loginPage.clickLoginButton();
		//inventory page
		inventoryPage.clickAddToCartBackpack();
		inventoryPage.clickAddToCartBikeLight();
		inventoryPage.clickButtonSHoppingCart();
		//shopping cart
		cartPage.clickButtonCheckout();
		//checkout step-one
		checkoutStepOne.insertFirstName(firstName);
		checkoutStepOne.insertLastName(lastName);
		checkoutStepOne.insertZipCode(zipCode);
		checkoutStepOne.clickButtonContinue();
		//checkout step-two
		checkoutStepTwo.clickButtonFinish();
		//checkout complete and assert the text
		String actualText		= checkoutComplete.getCompleteCheckoutText();
		String expectedResult	= "THANK YOU FOR YOUR ORDER"; 
		AssertJUnit.assertTrue(actualText.contains(expectedResult));
	
	}
	
}
