package testOptionalParameters;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public void testArthmeticException1() {

		System.out.println("Inside testPrintMessage()");
		int a = 1, b = 0, c;
		c = a / b;

	}

	// @Test(expectedExceptions = ArithmeticException.class)
	// public void testArthmeticException() {
	// System.out.println("Inside testPrintMessage()");
	//
	// }

}