package sd;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import java.util.ArrayList;

public class SdTest {


	@Test
	public void testIsIn() {
		List<Integer> T = new ArrayList<Integer>();
		T.add(4);
		T.add(2);
		T.add(5);
		T.add(16);
		assertTrue(sd.isIn(T,4));
		assertFalse(sd.isIn(T,9));
		
	}

}
