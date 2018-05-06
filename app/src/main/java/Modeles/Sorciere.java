package Modeles;

public class Sorciere extends Role{
	
	private boolean potionVie;
	private boolean potionMort;
	
	//Geters
	public boolean getPotionVie(){
		return potionVie;
	}
	
	public boolean getPotionMort(){
		return potionMort;
	}
	
	//Seters
	public void setPotionVie(boolean nouvelleValeur){
		potionVie = nouvelleValeur;
	}
	
	public void setPotionMort(boolean nouvelleValeur){
		potionMort = nouvelleValeur;
	}
	
	//Methodes Publiques
	public int Pouvoir(Joueur cibleVie, Joueur cibleMort){
		if(potionVie){
			cibleVie.setVivant(true);
		}
		if(potionMort){
			cibleMort.setVivant(false);
		}
		return 1;
	}
	
	public void TourDeJeu(Joueur cibleVie, Joueur cibleMort){
		Pouvoir(cibleVie,cibleMort);
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur cibleVie, Joueur cibleMort){
		this.TourDeJeu(cibleVie,cibleMort);
	}
		
}
