package sd;

import static org.junit.Assert.*;

import org.junit.Test;

public class DirecteurTest {

	@Test
	public void testGetPrenom() {
		Directeur directeur=new Directeur("James","Wan");
		assertEquals("James",directeur.getPrenom());
	}

	@Test
	public void testGetNom() {
		Directeur directeur=new Directeur("James","Wan");
		assertEquals("Wan",directeur.getNom());
	}

	@Test
	public void testGetPoint() {
		Directeur directeur=new Directeur("James","Wan");
		assertEquals(0,directeur.getPoint());
	}

	@Test
	public void testAugmentePoint() {
		Directeur directeur=new Directeur("James","Wan");
		directeur.augmentePoint();
		assertEquals(1,directeur.getPoint());
	}

}
