package Modeles;

public class LoupGarou extends Role{
	
	//Methodes Publiques

	public int Pouvoir(Joueur cible, Joueur vide){
		cible.setVivant(false);
		return 1;
	}
	
	public void TourDeJeu(Joueur cible, Joueur vide){
		this.Pouvoir(cible, null);
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur cible, Joueur vide){
		this.TourDeJeu(cible, null);
	}
	
}
