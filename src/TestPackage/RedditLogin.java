package TestPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedditLogin {

	@Test
	public void LandingPageReddit() {
		System.out.println("Reddit part of code");
	}
	
	
	@BeforeTest
	
	public void LandingWithCorrectData() {
		System.out.println("Succesfully logged in with correct data");
	}

}
