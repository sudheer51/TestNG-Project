package testOptionalParameters;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample {
	String message = "sudheer";

	@Test(groups = { "regression", "sanity" }, description = "verify", timeOut = 2000)
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		Assert.assertEquals(message, "sudheer");
	}

	@Test(groups = { "regression" })
	public void testSalutationMessage() {
		System.out.println("Inside testSalutationMessage()");
		Assert.assertEquals(message, "sudheer");
	}

	@Test(groups = { "sanity" })
	public void testingExitMessage() {
		System.out.println("Inside testExitMessage()");
		Assert.assertEquals(message, "sudheer");
	}
}