package Modeles;

public class Chasseur extends Role{
	
	//Methodes Publiques
	public int Pouvoir(Joueur cible, Joueur vide){
		cible.setVivant(false);
		return 1;
	}
	
	public void TourDeJeu(Joueur vide1, Joueur vide2){
		
	}
	
	public void Mort(Joueur cible, Joueur vide){
		Pouvoir(cible, null);
	}
	
	public void PremiereNuit(Joueur vide1, Joueur vide2){
		
	}
	
}

