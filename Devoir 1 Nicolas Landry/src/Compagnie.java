import java.util.ArrayList;

public class Compagnie {
 int nbremployer;
 String nomdelacompagnie;
 ArrayList listedesemployer;
 ArrayList listedeslimousine;
 Chauffeur Chaft = new Chauffeur();
 Limousine limo;
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
	 limo= new Limousine(Plaquenumerologique,0,Modele,listedesemployer.get(0));
	// listedeslimousine.add();
 }
 public void getdEmploye()
 {
	 for(int i=0;i<listedesemployer.size();i++)
	 {
		 Chaft = (Chauffeur) listedesemployer.get(i);
		 
	 }
 }
}
