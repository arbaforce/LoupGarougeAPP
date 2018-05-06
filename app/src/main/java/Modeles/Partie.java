package Modeles;

import java.util.LinkedList;

public class Partie {
	
	private LinkedList<Joueur> joueurs;
	private LinkedList<Joueur> morts;
	private LinkedList<Role> vivants;
	private int tourDeJeu;
	private int nbrJoueurs;
	private int nbrVivants;
	private Joueur createur;

	//Constructeurs
	public Partie(){
		joueurs = null;
		morts = null;
		vivants = null;
		tourDeJeu = 0;
		nbrJoueurs = 0;
		nbrVivants = 0;
		createur = null;
	}
	
	public Partie(Joueur leCreateur){
		joueurs = null;
		morts = null;
		vivants = null;
		tourDeJeu = 0;
		nbrJoueurs = 1;
		nbrVivants = 0;
		createur = leCreateur;
	}
	
	public Partie(Joueur leCreateur, LinkedList<Joueur> lesJoueurs){
		joueurs = lesJoueurs;
		morts = null;
		vivants = new LinkedList<Role>();
		for (int i = 0; i <lesJoueurs.size(); i++){
			vivants.add(lesJoueurs.get(i).getPersonnageJoue());
		}
		tourDeJeu = 0;
		nbrJoueurs = lesJoueurs.size();
		nbrVivants = lesJoueurs.size();
		createur = leCreateur;
	}
	
	//Getteurs
	public LinkedList<Joueur> getJoueurs(){
		return joueurs;
	}
	
	public LinkedList<Joueur> getMorts(){
		return morts;
	}

	public LinkedList<Role> getVivants(){
		return vivants;
	}
	
	public int getTourDeJeu(){
		return tourDeJeu;
	}
	
	public int getNbrJoueurs(){
		return nbrJoueurs;
	}
	
	public int getNbrVivants(){
		return nbrVivants;
	}
	
	public Joueur getCreateur(){
		return createur;
	}
	
	//Setteurs
	public void setJoueurs(LinkedList<Joueur> nouvelleValeur){
		joueurs = nouvelleValeur;
	}
	
	public void setMorts (LinkedList<Joueur> nouvelleValeur){
		morts = nouvelleValeur;
	}
	
	public void setVivants (LinkedList<Role> nouvelleValeur){
		vivants = nouvelleValeur;
	}

	public void setTourDeJeu (int nouvelleValeur){
		tourDeJeu = nouvelleValeur;
	}
	
	public void setNbrJoueurs (int nouvelleValeur){
		nbrJoueurs = nouvelleValeur;
	}
	
	public void setNbrVivants (int nouvelleValeur){
		nbrVivants = nouvelleValeur;
	}
	
	public void setCreateur (Joueur nouvelleValeur){
		createur = nouvelleValeur;
	}
}
		
