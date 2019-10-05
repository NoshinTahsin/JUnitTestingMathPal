package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMathOp {

	
	@Test
	void testcalcnCr() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		int actualValue = calculator.calcnCr(88,92);
		int expectedValue=-1;
		assertEquals(expectedValue, actualValue);
	}
	
	
	
	/*
	  @Test
	  
	  void testnCr() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		String actualValue = calculator.nCr();
		String expectedValue="Invalid Input";
		assertEquals(expectedValue, actualValue);
	}
	
	void testnPr() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		String actualValue = calculator.nPr();
		String expectedValue="Invalid Input";
		assertEquals(expectedValue, actualValue);
	}
	
	void testcalcnPr() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		int actualValue = calculator.calcnPr(6,56);
		int expectedValue=-1;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testFactorial() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		String actualValue = calculator.factorial();
		String expectedValue="Factorial of5 is 120";
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testCalculateFactorial() {
		//fail("Not yet implemented");
		MathematicalOperation calculator = new MathematicalOperation();
		int actualValue = calculator.calculateFactorial(6);
		int expectedValue=720;
		assertEquals(expectedValue, actualValue);
	}
*/
}
