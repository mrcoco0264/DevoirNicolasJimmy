
public class Trajet {
	//Variable d'instance:
	String villedeDepart;
	String villeDarrive;
	int idvilledeDepart;
	int idvilleDarrive;
	String idChauffeur;
	String plaqueLimo;
	Chauffeur chaufeurTrajet;
	Limousine Limo1;

	//Constructeur par defaut:
	Trajet() {
		villedeDepart= "Quebec";
		villeDarrive = "Montreal";
		chaufeurTrajet = new Chauffeur();
		idChauffeur = chaufeurTrajet.getCodeEmployer();
		Limo1 = new Limousine();
		plaqueLimo=Limo1.GetPlaque();
		idvilledeDepart=25000;
		idvilleDarrive=25300;

	}
	//Constructeur Surcharge.
	Trajet(String Depart, String Darrive, Chauffeur chaft, Limousine limo,int pointa, int pointb) {
		villedeDepart = Depart;
		villeDarrive = Darrive;
		chaufeurTrajet = chaft;
		idChauffeur = chaufeurTrajet.getCodeEmployer();
		Limo1=limo;
		plaqueLimo=limo.GetPlaque();
		idvilledeDepart=pointa;
		idvilleDarrive=pointb;
	}

	//Retourne l'entrer tel que démontrer dnas le jeu de donné.
	String Tostring()
	{
		String retourString;
		retourString=idChauffeur+" "+villedeDepart+" "+ villeDarrive+" "+""+" "+""+" ";
		return retourString;

	}
}
