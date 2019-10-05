package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCrypt {

	@Test
	void testEncrypt() {
		//fail("Not yet implemented");
		Cryptography calculator = new Cryptography();
		String actualValue = calculator.encrypt("abc", -7);
		int expectedValue=1;
		
		//String expectedValue ="Couldn't Encrypt."
			//	+ " Shift must be between -2147483648" + 
				//"to 2147483647";
		assertEquals(expectedValue, actualValue);
	}

}
