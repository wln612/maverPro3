package tedu;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void f() {
		System.out.println("11");
		System.out.println("22");
		System.out.println("33");
		System.out.println("44");

		assertTrue(true);
	}

	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {
	}

}
