
public class Trajet {
	String VilledeDepart;
	String VilleDarrive;
	String idChauffeur;
	Chauffeur chaufeurTrajet;

	Trajet() {
		VilledeDepart = "Qu�bec";
		VilleDarrive = "Montr�al";
		chaufeurTrajet = new Chauffeur();
		idChauffeur = chaufeurTrajet.getCodeEmployer();
	}

	Trajet(String Depart, String Darrive, Chauffeur chaft) {
		VilledeDepart = "Qu�bec";
		VilleDarrive = "Montr�al";
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
