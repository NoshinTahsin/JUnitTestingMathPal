package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalendar {

	@Test
	void testLeapYear() {
		//fail("Not yet implemented");
		Calendar calculator = new Calendar();
		String actualValue = calculator.checkYear(1728366701);
		String expectedValue="Invalid Year";
		assertEquals(expectedValue, actualValue);
	}

	/*@Test
	void testDay() {
		//fail("Not yet implemented");
		Calendar calculator = new Calendar();
		String actualValue = calculator.day();
		String expectedValue="Invalid date";
		assertEquals(expectedValue, actualValue);
	}*/

}
