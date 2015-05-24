package sd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Parse {
	
	
	static List<String> genreGene = StringListGenre.ListGenre();
	static List<Directeur> listDirec = new ArrayList<Directeur>();
	static List<Acteur> listAct = new ArrayList<Acteur>();
	static List<Genre> listGenre = new ArrayList<Genre>();
	
	private static String[] titre (String line) { // méthode pour récupérer titre date type
		String delims = "[()\\.]";  // délimiteur
		String[] tokens = line.split(delims); // on parse la ligne et on stocke dans tokens[]
		String titre = tokens[1].trim().replaceAll(" +", " "); // pour supprimer le double espace
		//System.out.println(titre); // juste pour check
		tokens = tokens[2].split(" "); // on split la partie ()
		String type;
		if (tokens.length>0) { //si y'a qu'une seule case dans le tableau, c'est que c'est un film
			type = "TV Series"; // sinon c'est une série
		} else { type = "Film"; }
		String date = tokens[0]; //on récupère la date 
		
		String[] res = { titre, type, date }; // on range dans un tableau
		
		return res;
	}
	
	private static List<Directeur> director(String line) { // méthod pour récup directeur
		String delims = ":"; // délimiteur
		String[] tokens = line.split(delims); // on parse pour éliminer le "with :"
		
		String director = tokens[1].trim().replaceAll(" +", " "); // on ne récupère que la seconde partie +double espace
		
		tokens = director.split(","); // maintenant on veut récupérer chaque directeur
		Directeur tempo; // var temporaire
		
		List<Directeur> directeurs = new ArrayList<Directeur>(); //liste qu'on va renvoyer
		
		for (int i=0; i<tokens.length;i++) { // tant qu'il y a qlq chose dans le tableau
			//System.out.println(tokens[i]);
			String[] tokens2 = tokens[i].split(" "); // nouveau tableau pour parser prénom et nom
			//System.out.println(tokens2[1]);
			String prenom = tokens2[0];
			//System.out.println(prenom);
			String nom = "";
			int f = 0;
			if (tokens2.length>1) { 
				nom = tokens2[1];
			}
			
			//System.out.println(nom);
			if (prenom.equals("")) {
				prenom = tokens2[1];
				System.out.println(prenom);
				if(tokens2.length>2) { //rihanna
				nom = tokens2[2];
				}
				if (tokens2.length == 4) {
					nom = tokens2[2] +" "+ tokens2[3]; // on fait le choix de ne pas gérer les noms 
				}                                      // de plus de 2 composantes : ex Samuel L. Jackson= ok mais Samuel L. Jackson Jr.  pas ok.
				f = 1;
			}
			if (tokens2.length == 3 && f == 0) {
				nom = tokens2[1] +" "+ tokens2[2];
			}

			
			
			if (prenom.equals(nom)) {
				nom="";
			}

			

			for (int j=0;j<listDirec.size();j++) {
				if (listDirec.get(j).getNom().equals(nom) && listDirec.get(j).getPrenom().equals(prenom) ) {
					directeurs.add(listDirec.get(j));
					return directeurs;
				}
			}
			
			tempo = new Directeur(prenom, nom); // on range l'acteur
			listDirec.add(tempo);
			directeurs.add(tempo); // on ajoute chaque acteur à la liste

		}
		
		return directeurs;
	}
	
	private static List<Acteur> actors(String line) { // méthod pour récup la liste des acteurs
		String delims = ":"; // délimiteur
		String[] tokens = line.split(delims); // on parse pour éliminer le "with :"
		String actor = tokens[1].trim().replaceAll(" +", " "); // on ne récupère que la seconde partie +double espace
		//System.out.println(actor);
		tokens = actor.split(","); // maintenant on veut récupérer chaque acteur
		Acteur tempo; // var temporaire
		List<Acteur> acteurs = new ArrayList<Acteur>(); //liste qu'on va renvoyer
		for (int i=0; i<tokens.length;i++) { // tant qu'il y a qlq chose dans le tableau
			//System.out.println(tokens[i]);
			String[] tokens2 = tokens[i].split(" "); // nouveau tableau pour parser prénom et nom
			//System.out.println(tokens2[1]);
			String prenom = tokens2[0];
			//System.out.println(prenom);
			String nom = "";
			int f = 0;
			if (tokens2.length>1) { //rihanna
				nom = tokens2[1];
			}
			
			//System.out.println(nom);
			if (prenom.equals("")) {
				prenom = tokens2[1];
				//System.out.println(prenom);
				if(tokens2.length>2) { //rihanna
				nom = tokens2[2];
				}
				if (tokens2.length == 4) {
					nom = tokens2[2] +" "+ tokens2[3]; // on fait le choix de ne pas gérer les noms 
				}                                      // de plus de 2 composantes : ex Samuel L. Jackson= ok mais Samuel L. Jackson Jr.  pas ok.
				f = 1;
			}
			if (tokens2.length == 3 && f == 0) {
				nom = tokens2[1] +" "+ tokens2[2];
			}

			
			
			if (prenom.equals(nom)) {
				nom="";
			}

			for (int j=0;j<listAct.size();j++) {
				if (listAct.get(j).getNom().equals(nom) && listAct.get(j).getPrenom().equals(prenom) ) {
					acteurs.add(listAct.get(j));
					return acteurs;
				}
			}
			
			tempo = new Acteur(prenom, nom); // on range l'acteur
			listAct.add(tempo);
			acteurs.add(tempo); // on ajoute chaque acteur à la liste
			
		}
		
		
		
		return acteurs;
	}
	
	private static List<Genre> genreFilm(String line) { // méthode pour récupérer le genre
		List<Genre> genres = new ArrayList<Genre>();; // création de la liste que l'on va renvoyer
		String[] tokens = line.split(" "); // on split sur les espaces => la | n'est pas pris en compte par split
		for (int i = 0; i < tokens.length;i++) {
			if (genreGene.contains(tokens[i])) { // on test si chaque élement est un genre
				for (int j=0;j<listGenre.size();j++) {
					if (listGenre.get(j).getType().equals(tokens[i]) ) {
						genres.add(listGenre.get(j));
						return genres;
					}
				}
				
				Genre tempo = new Genre(tokens[i]); // on range l'acteur
				listGenre.add(tempo);
				genres.add(tempo); // on ajoute chaque acteur à la liste
				//System.out.println(tokens[i]);
			}
			//System.out.println(tokens[i]);
			
		}
		return genres;
	}
	
	public static List<Film> readFile1(File fin) throws IOException {
		FileInputStream fis = new FileInputStream(fin); // initialisation du flux
	 
		BufferedReader br = new BufferedReader(new InputStreamReader(fis)); // initialisation buffer
	 
		String line = null; // initialisation de la variable dans laquelle on va ranger chaque ligne
		
		int boucle = 0; // initialisation condition sortie de boucle
		List<Film> listFilms = new ArrayList<Film>(); // création de la liste finale
		while (boucle <1) {
		line=br.readLine(); // on se place sur la ligne du titre
		String titre = null;
		String date = null;
		String type = null;
		
		try {
			String[] res = titre(line); // on appelle la fonction titre qui va renvoyer un tableau de string
			titre = res[0]; // dans lequel on trouve le titre, la date et le type
			date = res[1]; // on les récupère pour pouvoir créer un obj film à la fin
			type = res[2];
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
			System.out.println(line);
			System.out.println("Probablement une erreur dans le fichier texte, merci de vérifier la forme");
		} // Au cas ou le fichier texte a une erreur
		
		//System.out.println(titre);
		//System.out.println(type);
		
		line=br.readLine(); // ligne vide
		//System.out.println(line);
		line=br.readLine(); // on arrive sur la deuxième ligne de texte, synopsis dans la plupart des cas (tous en fait ...)
		
		
		//System.out.println(line); //print synop
		String tempo = line; // var tempo qu'on va substring
		String dirPoints = tempo.substring(0,10); // pour "Director :"
		String withPoints = tempo.substring(0,6); // pour "With :"
		String synopsis = null; // on initialise la variable syno au cas ou on ne peut pas rentrer dans le if
		if (withPoints == "with :" || dirPoints == "Director :") { // Si pas de synopsis, on ne fait rien et on traite après
			System.out.println(line);
			System.out.println("on stop ici");
		} else { // sinon on renvoie le synopsis
			
			synopsis = line;
			line=br.readLine(); // et on passe à la ligne suivante, directeur dans la plupart des cas
		}
		
		List<Directeur> direc = null; // on initialise la variable directeur au cas ou on ne puisse pas rentrer dans le if
		 tempo = line; // on réinitialise tempo avec notre nouvelle ligne
		 dirPoints = tempo.substring(0,10); // pour "Director :"
		 withPoints = tempo.substring(0,6); // pour "With :"
		if (dirPoints.equals("Director :")) {
			 direc = director(line);  // si on a un director, on appelle la method adéquate
			 line=br.readLine(); // et on passe à la ligne suivante, acteurs pour la plupart des cas
		}
		 tempo = line;
		 dirPoints = tempo.substring(0,10);
		 withPoints = tempo.substring(0,6); // idem que précédemment
		 List<Acteur> acteurs = null; // ini la list d'acteurs
		 if (withPoints.equals("With :")) { // si on a le with :
				//String delims = "[()\\.]";
				//String[] tokens = line.split(delims);
				//String actor = tokens[0].trim().replaceAll(" +", " "); reste de test, à virer quand ça marchera
				//System.out.println(actor);
				//System.out.println(line);   
				acteurs = actors( line); // on appelle actor
				line = br.readLine(); // on passe à la ligne suivnate, genre normalement
			}	
		 List<Genre> genres = null; //ini la liste de genre
		/*if (line == null) {
			line = br.readLine(); // le test ici est foireux si pas de genre
		}
		else {*/
			genres = genreFilm(line);
			
		//}
		//System.out.println(line); // check on est bien sur la ligne genre
		for (int i = 0; i<2; i++) { // il en faut 2 pour aller au titre suivant, vu qu'on a un readline en tête
			if ((line = br.readLine()) == null) {
				boucle = 1; // si la ligne est null aka qu'on est à la fin, on sort de la boucle
			}
			
		}
		Film un = new Film (titre, date, type, synopsis, direc, acteurs, genres, null);
		listFilms.add(un);
		//System.out.println(un.getGenre());
		//boucle++;
		}
		//System.out.println(listFilms);
		
			
		br.close(); // on ferme et on rentre à la maison
		return listFilms;
	}

}
