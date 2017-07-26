import static org.junit.Assert.*;

import org.junit.Test;

public class Test_Person {

	@Test
	public void testBlankConstructor() {
		Person per = new Person();
		assertTrue(per != null);
		}
	@Test
	public void testname(){
		Person per = new Person();
		per.setname("rickjames");
		assertEquals("rickjames", per.getname());
		}
	@Test
	public void testConstructor(){
		Person per = new Person();
		
		
	}
	
}
