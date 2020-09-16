package testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestForTests {
	
	// assertEquals
	@Test
	void addition() {
		
		System.out.println(" adding test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1));
	}
	
	@Test
	void additionButFails() {
		System.out.println(" adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1));
	}

}
