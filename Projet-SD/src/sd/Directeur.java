package sd;

public class Directeur {

	private String nom;
	private String prenom;
	private int point;

	public Directeur(String prenom,String nom){
		this.prenom=prenom;
		this.nom=nom;
		this.point=0;
	}
	
	public String getPrenom(){
		return this.prenom;
	}
	public String getNom(){
		return this.nom;
	}
	public int getPoint(){
		return this.point;
	}
	
	public void augmentePoint(){
		this.point=this.point+1;
		//System.out.println(this.prenom +" :"+ this.point);
	}
}
