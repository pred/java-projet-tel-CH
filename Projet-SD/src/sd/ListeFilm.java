package sd;

import java.util.ArrayList;
import java.util.List;

public class ListeFilm {
	
	private List<Film> liste ;
	
	public ListeFilm(List<Film> liste){
		this.liste=liste;
	}
	public ListeFilm(ListeFilm liste){
		this.liste=liste.getListe();
	}
	public ListeFilm(){
		this.liste =new ArrayList<Film>();
	}
	
	public void add(Film f){
		this.liste.add(f);
	}
	public void remove(Film f){
		this.liste.remove(f);
	}
	public Film get(int i){
		return liste.get(i);
	}
	public int size(){
		return liste.size();
	}
	public List<Film> getListe(){
		return this.liste;
	}
	public void setListe(List<Film> f){
		this.liste=f;
	}
	public String affiche(){
		String a="";
		for (int i=0;i<liste.size();i++){
			a+=i+": "+liste.get(i).getTitre()+"\n";
		}
		return a;
	}
	
	public void augmentePoint(){ 
		for(int i=0;i<this.liste.size();i++){
			this.liste.get(i).augmentePoint();
		}
	}
	public void calculPoint(){
		for(int i=0;i<this.liste.size();i++){
			this.liste.get(i).calculPoint();
		}
		//for(int i=0;i<this.Liste.size();i++){
		//	System.out.println(this.Liste.get(i).getTitre()+": "+this.Liste.get(i).getPoint());
		//}
	}
	public void classeFilm(){
		List<Film> ListeFilmebis=new ArrayList<Film>();
		int n=this.liste.size();
		for(int h=0;h<n;h++){
			int max=0;
			for(int i=0;i<this.liste.size();i++){
				if(this.liste.get(i).getPoint()>this.liste.get(max).getPoint()){
					max=i;
				}
			}
			ListeFilmebis.add(this.liste.get(max));
			this.liste.remove(max);
		}
		this.liste=ListeFilmebis;
	}
	
}
