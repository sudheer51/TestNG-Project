package testOptionalParameters;

import org.testng.annotations.Test;

public class ExecutionOrder {

	@Test
	public void addMethod() {
		System.out.println("add method");
	}

	@Test
	public void m2() {
		System.out.println("m2");
	}

	@Test
	public void addSubtract() {
		System.out.println("add Subtract");
	}

	@Test
	public void m1() {

		System.out.println("m1");
	}

}