package Modeles;


public class Voleur extends Modeles.Role {
	
	//Methodes Publiques
	public int Pouvoir(Joueur vide1, Joueur vide2) {
		return 1;
	}
	
	public void TourDeJeu(Joueur vide1, Joueur vide2){
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur vide1, Joueur vide2){
		Pouvoir(null, null);
	}
	
}
