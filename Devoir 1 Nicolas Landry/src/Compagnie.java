import java.util.ArrayList;

public class Compagnie {
 int nbremployer;
 String nomdelacompagnie;
 ArrayList listedesemployer;
 ArrayList listedeslimousine;
 Chauffeur Chaft = new Chauffeur();
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
	 listedesemployer.add(new Chauffeur(Prenomdelemployer,nomdelemployer,age,addresse));
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
	// listedeslimousine.add();
 }
 public void getListdEmploye()
 {
	 for(int i=0;i<listedesemployer.size();i++)
	 {
		 Chaft = (Chauffeur) listedesemployer.get(i);
		 
	 }
 }
}
