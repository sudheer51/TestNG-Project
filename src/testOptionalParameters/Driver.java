package testOptionalParameters;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Adding comments
public class Driver {
	private WebDriver driver;

	@BeforeClass
	public void Startup() {
		driver = new FirefoxDriver();
	}

	@Test(description = "Twitter Empty Fields")
	public void TwitterLoginEmptyFields() {
		driver.get("https://twitter.com/login");

		driver.findElement(By.name("session[username_or_email]")).sendKeys("");
		driver.findElement(By.name("session[password]")).sendKeys("");
		driver.findElement(By.className("submit")).click();

	}

	@Test(description = "Twitter Wrong Username")
	public void TwitterLoginWrongUN() {
		driver.get("https://twitter.com/login");

		driver.findElement(By.name("session[username_or_email]")).sendKeys(
				"abcd");
		driver.findElement(By.name("session[password]")).sendKeys("****");
		driver.findElement(By.className("submit")).click();

	}

	@Test(description = "Twitter Wrong Password")
	public void TwitterLoginWrongPWD() {
		driver.get("https://twitter.com/login");

		driver.findElement(By.name("session[username_or_email]")).sendKeys(
				"xyz");
		driver.findElement(By.name("session[password]")).sendKeys("****");
		driver.findElement(By.className("submit")).click();

	}

}
