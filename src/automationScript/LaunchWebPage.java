package automationScript;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchWebPage {

	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\nisha\\eclipse-workspace\\SeleniumFireFoxAutomation\\Driver\\geckodriver.exe");
	
	
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		
	}

}
