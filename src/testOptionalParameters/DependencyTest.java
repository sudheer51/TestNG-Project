package testOptionalParameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals("abc", "xyz");
	}

	@Test
	public void testMethods() {
		// driver.findElement(By.id("s")).sendKeys("hi there");
		System.out.println("Inside testMethods()");
		Assert.assertEquals("s", "a");
	}

	@Test(dependsOnMethods = { "testPrintMessage", "testMethods" }, alwaysRun = true)
	public void addMethods() {
		System.out.println("In add Method");
		String str = "xyz";
		Assert.assertEquals(str, "xyz");
	}
}

// @Test(dependsOnMethods = { "addMethods", "testPrintMessage" })
// public void testMethods() {
// // driver.findElement(By.id("s")).sendKeys("hi there");
// System.out.println("Inside testSalutationMessage()");
// }
//
//
//
