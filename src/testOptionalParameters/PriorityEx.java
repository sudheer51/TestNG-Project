package testOptionalParameters;

import org.testng.annotations.Test;

public class PriorityEx {

	@Test(priority = 2)
	public void addSubtract() {
		System.out.println("add Subtract");
	}

	@Test(priority = 1)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
	}

	@Test(priority = 3)
	public void testMethods() {
		// driver.findElement(By.id("s")).sendKeys("hi there");
		System.out.println("Inside testSalutationMessage()");
	}

	@Test(priority = 1)
	public void addMethod() {
		System.out.println("add method");
	}
}