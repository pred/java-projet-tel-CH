package sd;

import static org.junit.Assert.*;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ActeurTest {

	@Test
	public void testGetPrenom() {
		Acteur act = new Acteur("Paul","Walker");
		assertEquals("Paul",act.getPrenom());
	}

	@Test
	public void testGetNom() {
		Acteur act = new Acteur("Paul","Walker");
		assertEquals("Walker",act.getNom());
	}

	@Test
	public void testGetPoint() {
		Acteur act = new Acteur("Paul","Walker");
		assertEquals(0,act.getPoint());
		
	}

	@Test
	public void testAugmentePoint() {
		Acteur act = new Acteur("Paul","Walker");
		act.augmentePoint();
		assertEquals(1,act.getPoint());
	}

}
