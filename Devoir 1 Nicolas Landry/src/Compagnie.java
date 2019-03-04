import java.util.ArrayList;

public class Compagnie {
	int nbremployer;
	String nomdelacompagnie;
	ArrayList listedesemployer;
	ArrayList listedeslimousine;
	Chauffeur Chaft;
	Limousine limo;
	Chauffeur[] tableaudechauffeur;
	Limousine[] tableaudeLimousine;	
	Compagnie()
	{
		nbremployer =0;
		nomdelacompagnie="";
		listedesemployer=new ArrayList(nbremployer);
	}
	Compagnie(String b)
	{
		nomdelacompagnie=b;
		listedesemployer=new ArrayList();
		listedeslimousine=new ArrayList();
	}
	public void Ajouterdeemployer(String Prenomdelemployer,String nomdelemployer, int age, String addresse)
	{
		Chaft =new Chauffeur(Prenomdelemployer,nomdelemployer,age,addresse);
		listedesemployer.add(Chaft);
	}
	private Chauffeur[] conversionentableaufixeEmployer()
	{
		int taille;
		taille=listedesemployer.size();
		Chauffeur[] chafteur =new Chauffeur[taille];
		for(int i=0;i<taille;i++)
		{
			chafteur[i]=(Chauffeur)listedesemployer.get(i);
		}
		return chafteur;
	}
	void Ajouterdeslimousine(String Typedelimousine,String Modele, String Plaquenumerologique)
	{
		Chaft=(Chauffeur)listedesemployer.get(0);
		limo= new Limousine(Plaquenumerologique,0,Modele,Chaft);
	}
	private Limousine[] conversionentableaufixeLimousine()
	{
		int taille;
		taille=listedeslimousine.size();
		Limousine[] LimoTab =new Limousine[taille];
		for(int i=0;i<taille;i++)
		{
			LimoTab[i]=(Limousine)listedeslimousine.get(i);
		}
		return LimoTab;
	}
	void ChauffeurTab()
	{
		tableaudechauffeur=this.conversionentableaufixeEmployer();
	}
	void LimoTab()
	{
		tableaudeLimousine=this.conversionentableaufixeLimousine();
	}
	public String getdEmploye(String codeEmployeraverifier)
	{
		int a=0;
		boolean boldetest = false;
		for(int i=0;i<tableaudechauffeur.length;i++)
		{
			if(codeEmployeraverifier.equals(tableaudechauffeur[i].getCodeEmployer()))
			{
				boldetest=true;
				a=i;
				break;
			}
			else
			{
				boldetest=false;
			}
		}
		if(boldetest==true)
		{
			System.out.println("Le chaffeur que vous avez recherché exste");

			return tableaudechauffeur[a].getCodeEmployer();
		}
		if(boldetest==false)
		{
			System.out.println("Le chaffeur que vous avez recherché n'exste pas\n");
			return null;
		}
		else 
		{
			return null;
		}
	}
	public String getPlaque(String codePlaqueaverifier)
	{
		int a=0;
		boolean boldetest = false;
		for(int i=0;i<tableaudeLimousine.length;i++)
		{
			if(codePlaqueaverifier.equals(this.tableaudeLimousine[i].getPlaque()))
			{
				boldetest=true;
				a=i;
				break;
			}
			else
			{
				boldetest=false;
			}
		}
		if(boldetest==true)
		{
			System.out.println("Le chaffeur que vous avez recherché exste");

			return tableaudechauffeur[a].getCodeEmployer();
		}
		if(boldetest==false)
		{
			System.out.println("Le chaffeur que vous avez recherché n'exste pas\n");
			return null;
		}
		else 
		{
			return null;
		}
	}
}
