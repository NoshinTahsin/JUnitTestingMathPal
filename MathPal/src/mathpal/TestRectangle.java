package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestRectangle {

	Rectangle rectangle=new Rectangle();	
	@Test
	void testSetWidth() {
		//fail("Not yet implemented");
		rectangle.setWidth(38);
		double actualValue=rectangle.getWidth();
		double expectedValue=38;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSetHeight() {
		//fail("Not yet implemented");
		rectangle.setHeight(15);
		double actualValue=rectangle.getHeight();
		double expectedValue=15;
		assertEquals(expectedValue, actualValue);
	}

}
