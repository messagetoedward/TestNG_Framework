package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class testng_prjoect {
	
	@Test
	public void TestNG() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mgid/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		
		
		System.out.println("Executing some code");
		System.out.println("Executing some code");

		System.out.println(driver.getTitle());


//		driver.quit();
	}

}

///mgid/Documents/chromedriver_mac64/chromedriver