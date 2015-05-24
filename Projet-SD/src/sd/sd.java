package sd;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;

public class sd {

	public static void main(String[] args) {
		File f=new File("Film.txt");
		ListeFilm Liste_Film=new ListeFilm(); //todo : modifier le L majuscule
		try{
			Liste_Film.setListe(Parse.readFile1(f));
		}
		catch (IOException e){
			e.printStackTrace();
		}
		
		//affichage des films
		System.out.println(Liste_Film.affiche());

		System.out.println("Quels films avez-vous vus :");
		System.out.println("Notez les numéros des films que vous avez vus séparés d'un seul espace :");
		//interaction utilisateur
		Scanner sc =new Scanner(System.in);
		String s="";
		s=sc.nextLine();

		//traitement du string utilisateur

		//Scanner scc=new Scanner(s);
		//scc.useDelimiter("\\s* \\s*");
		//int i;
		//List<int> L=new ArrayList<int>();
		//while(scc.hasNextInt()){
		//	i=scc.nextInt();
		//	System.out.println(i);
		//}
		//scc.close();

		String[] tab=s.split(" ");
		List<Integer> vu=new ArrayList<Integer>();
		for(int i=0;i<tab.length;i++){
			if(!isIn(vu,Integer.parseInt(tab[i]))){ 
				vu.add(Integer.parseInt(tab[i]));
			}
		}

		//création Liste_vu
		ListeFilm Liste_vu=new ListeFilm();
		for(int i=0;i<vu.size();i++){
			Liste_vu.add(Liste_Film.get(vu.get(i)));
		}
		//for(int i=0;i<Liste_vu.size();i++){
		//	System.out.println(Liste_vu.get(i).getTitre());
		//}
		//point de chaque film
		Liste_vu.augmentePoint();
		//creation liste pasvu
		ListeFilm Liste_pasvu=new ListeFilm(Liste_Film);
		for(int i=0;i<Liste_pasvu.size();i++){
			for(int j=0;j<Liste_vu.size();j++){
				if(Liste_pasvu.get(i).getTitre()==Liste_vu.get(j).getTitre()){
					Liste_pasvu.remove(Liste_pasvu.get(i));
				}
			}
		}
		//for(int i=0;i<Liste_pasvu.size();i++){
		//	System.out.println(Liste_pasvu.get(i).getTitre());
		//}
		Liste_pasvu.calculPoint();
		Liste_pasvu.classeFilm();
		//for(int i=0;i<Liste_pasvu.size();i++){
		//	System.out.println(Liste_pasvu.get(i).getTitre()+": "+Liste_pasvu.get(i).getPoint());
		//}

		int l=0;
		while(!s.equals("o")){
			System.out.println(Liste_pasvu.get(l).getTitre()+": "+Liste_pasvu.get(l).getSynopsis());
			//validation utilisateur
			System.out.println("accepter o/n");
			s="";
			s=sc.nextLine();


			if(s.equals("o")){
				if(Liste_pasvu.get(l).getDirecteur()!=null){
					System.out.println(Liste_pasvu.get(l).getTitre()+": ("+Liste_pasvu.get(l).getAnnee()+Liste_pasvu.get(l).getType()+"). \n"
						+Liste_pasvu.get(l).getSynopsis()+"\nDirecteur : "+Liste_pasvu.get(l).getDirecteur()+"\nWith : "
						+Liste_pasvu.get(l).getActeurs()+"\nGenre : "+Liste_pasvu.get(l).getGenres()+" "+Liste_pasvu.get(l).getDuree());
				}else{
					System.out.println(Liste_pasvu.get(l).getTitre()+": ("+Liste_pasvu.get(l).getAnnee()+Liste_pasvu.get(l).getType()+"). \n"
							+Liste_pasvu.get(l).getSynopsis()+"\nWith : "+Liste_pasvu.get(l).getActeurs()+"\nGenre : "+Liste_pasvu.get(l).getGenres()+
							" "+Liste_pasvu.get(l).getDuree());
				}
				sc.close();
			}else if(s.equals("n")){
				if(l<Liste_pasvu.size()-1){
					l++;
				}else{
					System.out.println("Plus de film à proposer, retour au premier");
					l=0;
				}
			}else{
				System.out.println("commande non valide, tapez o (oui) ou n (non)");
			}
		}
		System.out.println("fin");
	}

	public static boolean isIn (List<Integer> t,int a){
		boolean b=false;
		for(int i=0;i<t.size();i++){
			if(a==t.get(i)){
				b=true;
			}
		}
		return b;
	}
}
