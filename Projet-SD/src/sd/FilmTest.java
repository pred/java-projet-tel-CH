package sd;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FilmTest {

	@Test
	public void testGetTitre() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("Fast & Furious 7",film.getTitre());
	}

	@Test
	public void testGetAnnee() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("2015",film.getAnnee());
	}

	@Test
	public void testGetType() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals(" Film",film.getType());
	}

	@Test
	public void testGetSynopsis() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.",film.getSynopsis());
	}

	@Test
	public void testGetDirecteur() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("James Wan",film.getDirecteur());
	}

	@Test
	public void testGetActeurs() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("Vin Diesel, Paul Walker, Dwayne Johnson",film.getActeurs());
	}

	@Test
	public void testGetGenres() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("Action | Crime | Thriller",film.getGenres());
	}

	@Test
	public void testGetDuree() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals("",film.getDuree()); //volontaire
	}

	@Test
	public void testGetPoint() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		assertEquals(0,film.getPoint());
	}

	@Test
	public void testAugmentePoint() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		film.augmentePoint();
		assertEquals(1,acteurs.get(0).getPoint());
		assertEquals(1,acteurs.get(1).getPoint());
		assertEquals(1,acteurs.get(2).getPoint());
		assertEquals(1,genres.get(0).getPoint());
		assertEquals(1,genres.get(0).getPoint());
		assertEquals(1,genres.get(0).getPoint());
		assertEquals(1,directeurs.get(0).getPoint());
	}

	@Test
	public void testCalculPoint() {
		List<Directeur> directeurs = new ArrayList<Directeur>();
		Directeur d1=new Directeur("James","Wan");
		List<Acteur> acteurs = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        directeurs.add(d1);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        List<Genre> genres = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
		Film film = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
		film.augmentePoint();
		film.calculPoint();
		assertEquals(7,film.getPoint());
	}

}
