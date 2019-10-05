package mathpal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSurface {


	
	@Test
	void testCube() {
		//fail("Not yet implemented");
		SurfaceArea calculator = new SurfaceArea();
		double actualValue = calculator.cube();
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
		
	}
	
/*
	
	
	
	@Test
	void testSphere() {
		//fail("Not yet implemented");
		SurfaceArea calculator = new SurfaceArea();
		double actualValue = calculator.sphere();
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
		
	}
	
	
	@Test
	void testCone() {
		//fail("Not yet implemented");
		SurfaceArea calculator = new SurfaceArea();
		double actualValue = calculator.cone();
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
		
	}
	
	

	@Test
	void testCylinder() {
		//fail("Not yet implemented");
		SurfaceArea calculator = new SurfaceArea();
		double actualValue = calculator.cylinder();
		double expectedValue=-1;
		assertEquals(expectedValue, actualValue);
		
	}
	*/

}
