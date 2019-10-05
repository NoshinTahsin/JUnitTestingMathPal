package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCurrency {

	@Test
	void testRupeeToTaka() {
		//fail("Not yet implemented");
		CurrencyConverter calculator = new CurrencyConverter();
		double actualValue = calculator.RupeeToTaka(-9000);
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
	}
	
	/*
	 * @Test
	void testTakaToCanadianDollar() {
		//fail("Not yet implemented");
		CurrencyConverter calculator = new CurrencyConverter();
		double actualValue = calculator.TakaToCanadianDollar(-25000);
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
	}
	@Test
	void testTakaToDollar() {
		//fail("Not yet implemented");
		CurrencyConverter calculator = new CurrencyConverter();
		double actualValue = calculator.DollarToTaka(-7000);
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testDollarToTaka() {
		//fail("Not yet implemented");
		CurrencyConverter calculator = new CurrencyConverter();
		double actualValue = calculator.DollarToTaka(20000);
		double expectedValue=1693400;
		assertEquals(expectedValue, actualValue);
	}
	*/

}
