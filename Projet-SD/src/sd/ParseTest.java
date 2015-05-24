package sd;

import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseTest {

	@Test
	public void testTitre() {
		String line = "2.  The Walking Dead (2010 TV Series)";
		String[] s = {"The Walking Dead", "TV Series", "2010"};
		assertEquals(s,Parse.titre(line));
		}
	

	@Test
	public void testDirector() {
		String line = "Director : James Wan";
		Directeur d1=new Directeur("James","Wan");
		List<Directeur> directeurs = new ArrayList<Directeur>();
		directeurs.add(d1);
		assertEquals(directeurs,Parse.director(line));
		List<Genre> genres = new ArrayList<Genre>();
		
	}
	
	@Test
	public void testActors() {
		String line = "With : Vin Diesel, Paul Walker, Dwayne Johnson ";
		Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        List<Acteur> acteurs = new ArrayList<Acteur>();
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        assertEquals(acteurs,Parse.actors(line));
	}

	@Test
	public void testGenreFilm() {
		String line = "Action | Crime | Thriller 137 mins.";
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        List<Genre> genres = new ArrayList<Genre>();
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
        assertEquals(genres,Parse.genreFilm(line));
		
	}
	
	@Test
	public void testReadFile1() {
        File f=new File("filmtest.txt");
        List<Film> listFilms = new ArrayList<Film>();
        List<Directeur> directeurs = new ArrayList<Directeur>();
        List<Directeur> directeurs1 = new ArrayList<Directeur>();
        List<Directeur> directeurs2 = new ArrayList<Directeur>();
        Directeur d1=new Directeur("James","Wan");
        Directeur d2=new Directeur("Sam","Mendes");
        List<Acteur> acteurs = new ArrayList<Acteur>();
        List<Acteur> acteurs1 = new ArrayList<Acteur>();
        List<Acteur> acteurs2 = new ArrayList<Acteur>();
        Acteur a1=new Acteur("Vin","Diesel");
        Acteur a2=new Acteur("Paul","Walker");
        Acteur a3=new Acteur("Dwayne","Johnson");
        Acteur a4=new Acteur("Andrew","Lincoln");
        Acteur a5=new Acteur("Jon","Bernthal");
        Acteur a6=new Acteur(" Sarah","Wayne Callies");
        Acteur a7=new Acteur("Daniel","Craig");
        Acteur a8=new Acteur("Christoph","Waltz");
        Acteur a9=new Acteur("Ralph","Fiennes");
        List<Genre> genres = new ArrayList<Genre>();
        List<Genre> genres1 = new ArrayList<Genre>();
        List<Genre> genres2 = new ArrayList<Genre>();
        Genre g1=new Genre("Action");
        Genre g2=new Genre("Crime");
        Genre g3=new Genre("Thriller");
        Genre g4=new Genre("Drama");
        Genre g5=new Genre("Horror");
        Genre g6=new Genre("Adventure");
        directeurs.add(d1);
        directeurs2.add(d2);
        acteurs.add(a1);
        acteurs.add(a2);
        acteurs.add(a3);
        acteurs1.add(a4);
        acteurs1.add(a5);
        acteurs1.add(a6);
        acteurs2.add(a7);
        acteurs2.add(a8);
        acteurs2.add(a9);
        genres.add(g1);
        genres.add(g2);
        genres.add(g3);
        genres1.add(g4);
        genres1.add(g5);
        genres2.add(g1);
        genres2.add(g6);
        genres2.add(g3);
        Film un = new Film ("Fast & Furious 7", "2015", "Film", "Deckard Shaw seeks revenge against Dominic Toretto and his family for his comatose brother.", directeurs, acteurs, genres, null);
        Film un1 = new Film ("The Walking Dead", "2010", "TV Series", "Sheriff's Deputy Rick Grimes leads a group of survivors in a world overrun by zombies.", directeurs1, acteurs1, genres1, null);
        Film un2 = new Film ("Spectre", "2015", "Film", "A cryptic message from Bond's past sends him on a trail to uncover a sinister organization. While M battles political forces to keep the secret service alive, Bond peels back the layers of deceit to reveal the terrible truth behind SPECTRE.", directeurs2, acteurs2, genres2, null);
        listFilms.add(un);
        listFilms.add(un1);
        listFilms.add(un2);
		ListeFilm f1=new ListeFilm();
        try{
        f1.setListe(Parse.readFile1(f));	
        assertEquals(listFilms,f1);
        }
        catch (IOException e){
			e.printStackTrace();
		}
        
    }

}