package Modeles;

public class Joueur {


	private int ID;
	private Role personnageJoue;
	private String pseudo ;
	private boolean vivant;
	private boolean amoureux;
	
	//Constructeurs
	public Joueur(){
		ID = 0;
		pseudo = "NouveauJoueur";
		personnageJoue = null;
		vivant = true;
		amoureux = false;
	}
	
	public Joueur(String pseudonyme){
		ID = 0;
		pseudo = pseudonyme;
		personnageJoue = null;
		vivant = true;
		amoureux = false;
	}
	
	public Joueur(Role personnage, String pseudonyme){
		ID = 0;
		pseudo = pseudonyme;
		personnageJoue = personnage;
		vivant = true;
		amoureux = false;
	}
	
	//Getteurs
	public int getID(){
		return ID;
	}
		
	public Role getPersonnageJoue(){
		return personnageJoue;
	}
	
	public String getPseudo(){
		return pseudo;
	}
	
	public boolean getVivant(){
		return vivant;
	}
	
	public boolean getAmoureux(){
		return amoureux;
	}
	
	//Setteurs
	public void setID(int nouvelID){
		ID = nouvelID;
	}
	
	public void setPersonnageJoue(Role nouveauPerso){
		personnageJoue = nouveauPerso;
	}
	
	public void setPseudo( String nouveauPseudo){
		pseudo = nouveauPseudo;
	}
	
	public void setVivant( boolean nouveauStatut){
		vivant = nouveauStatut;
	}
	
	void setAmoureux( boolean nouveauStatut){
		amoureux = nouveauStatut;
	}
	
}
