import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Committe {

	@Test
	public void testEmptyConstructor() {
		Committe com = new Committe();
		assertTrue(com != null);
		}
	@Test
	public void testAddName(){
		Committe com = new Committe();
		com.addPersons("bob", 0, "LA");
		assertEquals("bob",com.getname(0), "LA");
	}
}
