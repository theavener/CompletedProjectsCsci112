import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Merchandise {

	static final double DELTA = 1e-15;

	@Test
	public void testBlankConstructor() {
		Merchandise merc = new Merchandise();
		assertTrue(merc != null);
	}

	@Test
	public void testNonEmptyname() {
		Merchandise merc = new Merchandise("bob", 0.0, "person");
		assertEquals("bob", merc.getname());
	}

	@Test
	public void testNonEmptydesc() {
		Merchandise merc = new Merchandise("bob", 0.0, "person");
		assertEquals("person", merc.getdescription());
	}

	@Test
	public void testNonEmptyprice() {
		Merchandise merc = new Merchandise("bob", 5.99, "person");
		assertEquals(5.99, DELTA, merc.getprice());
	}

	@Test
	public void testname() {
		Merchandise merc = new Merchandise();
		merc.setname("Toast");
		assertEquals("Toast", merc.getname());
	}

	@Test
	public void testprice() {
		Merchandise merc = new Merchandise();
		merc.setprice(3.14);
		assertEquals(3.14, DELTA, merc.getprice());
	}

	@Test
	public void testdescription() {
		Merchandise merc = new Merchandise();
		merc.setdescription("Delicious things");
		assertEquals("Delicious things", merc.getdescription());
	}
}
