package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCylinder {

	Cylinder cylinder=new Cylinder();	
	@Test
	void testSetRadius() {
		//fail("Not yet implemented");
		cylinder.setRadius(33);
		double actualValue=cylinder.getRadius();
		double expectedValue=33;
		assertEquals(expectedValue, actualValue);
	}
	
	@Test
	void testSetHeight() {
		//fail("Not yet implemented");
		cylinder.setHeight(54);
		double actualValue=cylinder.getHeight();
		double expectedValue=54;
		assertEquals(expectedValue, actualValue);
	}

}
