package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCube {

	Cube cube=new Cube();	
	@Test
	void testSetSide() {
		//fail("Not yet implemented");
		cube.setSide(25);
		double actualValue=cube.getSide();
		double expectedValue=25;
		assertEquals(expectedValue, actualValue);
	}

}
