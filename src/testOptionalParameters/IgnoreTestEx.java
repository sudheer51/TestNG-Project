package testOptionalParameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTestEx {
	@Test(enabled = false)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		String message = "Sudheer";
		Assert.assertEquals(message, "Sudheer");
	}

	@Test(timeOut = 15000)
	public void testSalutationMessage() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("Inside testSalutationMessage()");
		String message = "Sudheer";
		Assert.assertEquals(message, "Sudheer");
		// actual,expected
	}
}