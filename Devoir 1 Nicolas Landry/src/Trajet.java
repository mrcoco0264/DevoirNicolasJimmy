
public class Trajet {
	String villedeDepart;
	String villeDarrive;
	int idvilledeDepart;
	int idvilleDarrive;
	String idChauffeur;
	String plaqueLimo;
	Chauffeur chaufeurTrajet;
	Limousine Limo1;
	

	Trajet() {
		villedeDepart= "Québec";
		villeDarrive = "Montréal";
		chaufeurTrajet = new Chauffeur();
		idChauffeur = chaufeurTrajet.getCodeEmployer();
		Limo1 = new Limousine();
		plaqueLimo=Limo1.GetPlaque();
		
	}

	Trajet(String Depart, String Darrive, Chauffeur chaft, Limousine limo) {
		villedeDepart = "Québec";
		villeDarrive = "Montréal";
		chaufeurTrajet = chaft;
		idChauffeur = chaufeurTrajet.getCodeEmployer();
		Limo1=limo;
		plaqueLimo=limo.GetPlaque();
	}


	String Tostring()
	{
		String retourString;
		retourString=idChauffeur+" "+villedeDepart+" "+ villeDarrive+" "+""+" "+""+" ";
		return retourString;

	}
}
