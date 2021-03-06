package sd;

import java.util.List;
import java.util.ArrayList;

public class Film {
	
	private String titre;
	private String annee;
	private String type;
	private String synopsis;
	private List<Directeur> directeurs;
	private List<Acteur> acteurs = new ArrayList<Acteur>();
	private List<Genre> genres = new ArrayList<Genre>();
	private String duree;
	private int point;
	
	public Film(String titre,String annee,String type,String synopsis,List<Directeur> directeurs,List<Acteur> acteurs,List<Genre> genres,String duree) {
		this.titre = titre;
		this.annee = annee;
		this.type = type;
		this.synopsis = synopsis;
		this.directeurs =directeurs;
		this.acteurs=acteurs;
		this.genres=genres;
		this.duree=duree;
		this.point=0;
	}
	
	public String getTitre() {
		return this.titre;
	}	
	
	public String getAnnee() {
		return this.annee;
	}
	public String getType() {
		if(this.type==null){
			return "";
		}else{
			return " "+this.type;
		}
	}
	public String getSynopsis(){
		return this.synopsis;
	}
	public String getDirecteur() {
		String s="";
		if(this.directeurs==null){
				return "";
		}
		for(int i=0;i<this.directeurs.size();i++){
			if(i!=0){
				s+=", ";
			}
			s+=this.directeurs.get(i).getPrenom();
			s+=" ";
			s+=this.directeurs.get(i).getNom();	
		}
		return s;
	}
	public String getActeurs() {
		String s="";
		for(int i=0;i<this.acteurs.size();i++){
			if(i!=0){
				s+=", ";
			}
			s+=this.acteurs.get(i).getPrenom();
			s+=" ";
			s+=this.acteurs.get(i).getNom();
		}
		return s;
	}
	public String getGenres() {
		String s="";
		for(int i=0;i<this.genres.size();i++){
			if(i!=0){
				s+=" | ";
			}
			s+=this.genres.get(i).getType();
		}
		return s;
	}
	public String getDuree() {
		if(this.duree==null){
			return "";
		}else{
			return " "+this.duree;
		}
	}
	public int getPoint(){
		return this.point;
	}	

	public void augmentePoint(){
		if(this.directeurs!=null){
			for(int i=0;i<directeurs.size();i++){
				this.directeurs.get(i).augmentePoint();
			}
		}
		for(int i=0;i<acteurs.size();i++){
			this.acteurs.get(i).augmentePoint();
		}			
		for(int i=0;i<genres.size();i++){
			this.genres.get(i).augmentePoint();
		}
	}
	
	public void calculPoint(){
		this.point=0;
		if(this.directeurs!=null){
			for(int i=0;i<directeurs.size();i++){
				this.point+=this.directeurs.get(i).getPoint();
			}
		}
		for(int i=0;i<acteurs.size();i++){
			this.point+=this.acteurs.get(i).getPoint();
		}			
		for(int i=0;i<genres.size();i++){
			this.point+=this.genres.get(i).getPoint();
		}
	}
}
