package house;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseCostTest {

	@Test
	public void testMaterial() {
		HouseCost test = new HouseCost();
		assertEquals(36000, test.material("Standard", 30), 0.0);
		assertEquals(45000, test.material("AboveStandard", 30), 0.0);
		assertEquals(54000, test.material("HighStandard", 30), 0.0);
		assertEquals(75000, test.material("HighStandardFullAutomated", 30), 0.0);
	}

}
