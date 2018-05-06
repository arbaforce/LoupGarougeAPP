package Modeles;

import Modeles.Joueur;

public abstract class Role {
	
	private int ordre;
	private Joueur joueur;	
	
	//Getters
	public int getOrdre() {
		return ordre;
	}
	
	public Joueur getJoueur() {
		return joueur;
	}
	
	//Setters
	public void setOrderToPlay(int nouvelOrdre){
		ordre = nouvelOrdre;
	}
	
	public void setJoueur(Joueur nouvelOrdre){
		joueur = nouvelOrdre;
	}
	

	public abstract int Pouvoir(Joueur cible1, Joueur cible2);
	public abstract void TourDeJeu(Joueur cible1, Joueur cible2);
	public abstract void Mort(Joueur cible1, Joueur cible2);
	public abstract void PremiereNuit(Joueur cible1, Joueur cible2);
	
}
