package TestClass;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class TestTester {
	
	// assertTrue
		@Test
		void trueTest() {
			
			System.out.println(" adding test");
			String testWord1 = "word";
			String testWord2 = "Word";
			assertTest assertTest = new assertTest();
			assertTrue(assertTest.sameString(testWord1, testWord2));
		}

}
