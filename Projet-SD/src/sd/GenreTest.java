package sd;

import static org.junit.Assert.*;

import org.junit.Test;

public class GenreTest {

	@Test
	public void testGetType() {
		Genre genre=new Genre("Action");
		assertEquals("Action",genre.getType());
	}

	@Test
	public void testGetPoint() {
		Genre genre=new Genre("Action");
		assertEquals(0,genre.getPoint());
	}

	@Test
	public void testAugmentePoint() {
		Genre genre=new Genre("Action");
		genre.augmentePoint();
		assertEquals(1,genre.getPoint());
	}

}
