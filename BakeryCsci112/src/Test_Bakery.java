import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Bakery {

	static final double DELTA = 1e-15;

	@Test
	public void testBlankConstructor() {
		Bakery bak = new Bakery();
		assertTrue(bak != null);
	}

	@Test
	public void testnNonEmpty() {
		Bakery bak = new Bakery("RickJames' cokehouse");
		assertEquals("RickJames' cokehouse", bak.getbName());
	}

	@Test
	public void testAddname() {
		Bakery bak = new Bakery();
		bak.setbName("rickjames");
		assertEquals("rickjames", bak.getbName());
	}

	@Test
	public void testAdddescription() {
		Bakery bak = new Bakery();
		bak.addMerchandise("ricky", 0.0, "cokehouse");
		assertEquals("cokehouse", bak.getMdescription(0));
	}

	@Test
	public void testAddMname() {
		Bakery bak = new Bakery();
		bak.addMerchandise("ricky", 0.0, "cokehouse");
		assertEquals("ricky", bak.getMname(0));
	}

	@Test
	public void testaddMprice() {
		Bakery bak = new Bakery();
		bak.addMerchandise("", 5.99, "");
		assertEquals(5.99, DELTA, bak.getMprice(0));
	}

}
