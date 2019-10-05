package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

	Circle circle=new Circle();	
	@Test
	void testSetRadius() {
		//fail("Not yet implemented");
		circle.setRadius(50);
		double actualValue=circle.getRadius();
		double expectedValue=50;
		assertEquals(expectedValue, actualValue);
	}

}
