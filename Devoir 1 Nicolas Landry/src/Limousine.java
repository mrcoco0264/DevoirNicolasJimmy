
public class Limousine {
	//Variable d'instance.
	String plaque;
	int numero;
	String couleur;
	//Constructeur par defaut
	Limousine()
	{
		plaque ="ABZ 100";
		numero=000;
		couleur="Gris";
	}
	//Constructeur Surcharge.
	Limousine(String pla, int num, String co, Chauffeur f)
	{
		plaque =pla;
		numero = num;
		couleur = co;
	}
	//Retourne la plaque du Vehicule.
	String getPlaque()
	{
		return plaque;
	}

}
