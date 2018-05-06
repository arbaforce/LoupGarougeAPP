package Modeles;


public class Cupidon extends Role{
	
	//Methodes Publiques
	public int Pouvoir(Joueur cible1, Joueur cible2){
		cible1.setAmoureux(true);
		cible2.setAmoureux(true);
		return 1;
	}
	
	public void TourDeJeu(Joueur vide1, Joueur vide2){
		
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur cible1, Joueur cible2){
		Pouvoir(cible1,cible2);	
	}
	
}


