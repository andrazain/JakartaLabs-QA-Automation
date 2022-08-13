package batch10.WebAutomation;

import org.testng.annotations.Test;

import batch10.WebAutomation.pages.CommonPage;
import batch10.WebAutomation.pages.HomePage;
import batch10.WebAutomation.pages.InboxPage;

public class WebTestTask3 extends BaseWebTest {

	HomePage homePage 		= new HomePage(driver, explicitWait);
	InboxPage inboxPage 	= new InboxPage(driver, explicitWait);
	CommonPage commonPage 	= new CommonPage(driver, explicitWait);
	
	/*
	 * 
	 * delcare some variable
	 * 
	 * */
	
	String email	= "automationtest";
	
	@Test
	public void getContentOfInbox() {
		
		//open the url
		commonPage.openUrl("https://yopmail.com/en/");
		
		//start step by step
		homePage.insertEmail(email);
		homePage.checkEmail();
		
		//switch iframe
		driver.get().switchTo().frame("ifmail");
		System.out.println("Content of Email : " + inboxPage.getContentOfEmail());
		
		
	}
	
	
}
