package batch10.WebAutomation.pages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonPage extends BasePage {

	public CommonPage(ThreadLocal<WebDriver> driver, ThreadLocal<WebDriverWait> explicitWait) {
		super(driver, explicitWait);
		// TODO Auto-generated constructor stub
	}

	//open url
	public void openUrl(String url) {
		driver.get().get(url);
	}
	
	//open url
	public void openNewTab() {
		driver.get().switchTo().newWindow(WindowType.TAB);
	}
	
	//open url
	public void openNewWindow() {
		driver.get().switchTo().newWindow(WindowType.WINDOW);
	}
	
	//switch window
	public void switchWindow(int index) {
		Set<String> handles = driver.get().getWindowHandles();
		ArrayList<String> tabs = new ArrayList<String>(handles);
		driver.get().switchTo().window(tabs.get(index));
	}
	
	//navigate browser
	public void navigateBrowserForward() {
		driver.get().navigate().forward();
	}
	
	//navigate browser
	public void navigateBrowserBack() {
		driver.get().navigate().back();
	}
	
	//navigate browser
	public void navigateBrowserRefresh() {
		driver.get().navigate().refresh();
	}
	
}