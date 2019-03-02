
public class Trajet {
	String VilledeDepart;
	String VilleDarrive;
	String idChauffeur;
	Chauffeur chaufeurTrajet;

	Trajet() {
		VilledeDepart = "Québec";
		VilleDarrive = "Montréal";
		chaufeurTrajet = new Chauffeur();
		idChauffeur = chaufeurTrajet.getCodeEmployer();
	}

	Trajet(String Depart, String Darrive, Chauffeur chaft) {
		VilledeDepart = "Québec";
		VilleDarrive = "Montréal";
		chaufeurTrajet = chaft;
		idChauffeur = chaufeurTrajet.getCodeEmployer();
	}

	
	String Tostring()
	{
		String retourString;
		retourString="";
		return retourString;
		
	}
}
