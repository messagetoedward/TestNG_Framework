package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testng_prjoect {
	
	@Test
	public void TestNG() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/mgid/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://booking.com");
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertEquals(driver.getTitle(), "Booking.com | Official site | The best hotels, flights, car rentals & accommodations", "Should not pass");

		System.out.println(driver.getTitle());
		driver.quit();
		
		softAssert.assertAll();


	}
	
	@Test
	public void TestingLoginPage() {
		
		System.out.println("Testing login and consoling some random stuff");
		
		}
	}


///mgid/Documents/chromedriver_mac64/chromedriver