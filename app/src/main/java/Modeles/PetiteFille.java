package Modeles;


public class PetiteFille extends Modeles.Role {
	
	private double chancesDeVoir;
	private double chancesDEtreVue;
	
	//Geters
	public double getChancesDeVoir(){
		return chancesDeVoir;
	}
	
	public double getChancesDEtreVue(){
		return chancesDEtreVue;
	}
	
	//Seters
	public void setChancesDeVoir(double nouvelleValeur){
		chancesDeVoir = nouvelleValeur;
	}
	
	public void setChancesDEtreVue(double nouvelleValeur){
		chancesDEtreVue = nouvelleValeur;
	}
	
	//Methodes Publiques
	public int Pouvoir(Joueur cible, Joueur vide){
		double jetdeChanceDeVoir = Math.random();
		double jetdeChanceDEtreVue =Math.random() ;
		if (jetdeChanceDeVoir>= chancesDeVoir){
			if(jetdeChanceDEtreVue >= chancesDEtreVue){
				return 1;//elle a vu mais s'est faite voir
			}
			else {
				return 2;//elle a vu sans etre rep�r�e
			}
		}else{
			if(jetdeChanceDEtreVue >= chancesDEtreVue){
				return -1;//elle a rien vu mais s'est faite rep�rer
			}
			else {
				return 0;//elle a rien vu mais ne s'est pas faite voir
			}
		}
	}
	
	public void TourDeJeu(Joueur cible, Joueur vide){
		Pouvoir(cible,null);
	}
	
	public void Mort(Joueur vide1, Joueur vide2){
		
	}
	
	public void PremiereNuit(Joueur cible, Joueur vide){
		this.TourDeJeu(cible, null);
	}
	
}
