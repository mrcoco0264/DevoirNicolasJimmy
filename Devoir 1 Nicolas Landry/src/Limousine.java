
public class Limousine {
	String plaque;
	int numero;
	String couleur;

	Limousine()
	{
		plaque ="ABZ 100";
		numero=000;
		couleur="Gris";
	}
	Limousine(String pla, int num, String co, Chauffeur f)
	{
		plaque =pla;
		numero = num;
		couleur = co;
	}
	String GetPlaque()
	{
		return plaque;
	}

}
