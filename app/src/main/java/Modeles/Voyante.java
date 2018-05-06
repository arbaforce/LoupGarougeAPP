package Modeles;


public class Voyante extends Modeles.Role {
		
	//Methodes Publiques
	public int Pouvoir(Modeles.Joueur cible, Joueur vide){
		return 1;
	}
	
	public void TourDeJeu(Joueur cible, Joueur vide){
		Pouvoir(cible, null);
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur cible, Joueur vide){
		this.TourDeJeu(cible, null);
	}
		
}


