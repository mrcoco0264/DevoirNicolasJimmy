
public class main {
	public static void main(String[] args) {		
		int a= 0;
		boolean b=true;
		while(b)
		{
			
		System.out.println(
				  "Entrer l'option compris entre 1 � 3\n"
				+ "1- Faire la r�servation. \n"
				+ "2- Trouver les limousine conduite par un chauffeur. \n"
				+ "3- Afficher les caract�ristiques des trajets effectuer ainsi que celles des limousine utilis�. \n");
		if(a>3 || a<1)
		{
			a=0;
		}
			switch(a)
			{
			case 1:
			{
				System.out.println("a");
				b=false;
				break;
			}
			case 2:
			{
				b=false;
				break;
			}
			case 3:
			{
				b=false;
				break;
			}
			default:
			{
				b=false;
				System.out.println("Veilliez entrer une option valide pour pouvoir interroger le system. Merci.");
			}
			}
		}
		
		}
	}


