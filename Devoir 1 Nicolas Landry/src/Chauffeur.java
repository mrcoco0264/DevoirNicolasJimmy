
public class Chauffeur {
	String test;
   String nom;
   String prenom;
   int Annee;
   String codeemployer;
   String addresse;
   
   Chauffeur()
   {
	   nom="Landry";
	   prenom="Nicolas";
	   Annee=2016;
	   codeemployer=this.getCodeper(Annee, prenom, nom);
   }
   Chauffeur(String p, String n, int a,String ad)
   {
	   nom=n;
	   prenom=p;
	   Annee=a;
	   addresse = ad;
	   codeemployer=this.getCodeper(a,p,n);
   }
  private String getCodeper(int a, String p,String n)
  {
	  String an =""+a;
	  String r= ""+n.charAt(0)+n.charAt(1)+n.charAt(2)+p.charAt(0)+an.charAt(2)+an.charAt(3);
	  return r;
  }
  public String getCodeEmployer()
  {
	  return codeemployer;
  }
}
