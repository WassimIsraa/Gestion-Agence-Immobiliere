package objet;

import graphique.AjoutAppartement;
import graphique.Login;
import graphique.MenuPrincipal;

import java.util.List;

import objet.Client;

import dao.AdresseDAO;
import dao.AppartemmentDAO;
import dao.ClientDAO;
import dao.FarfourDAO;
import objet.Client;
import objet.Client;

public class Main {

	public static void main(String[] args) {
		
	/*FarfourDAO fdao=new FarfourDAO();
	Farfour f=new Farfour(" d", 11);
		fdao.save(f);*/
		MenuPrincipal l=new MenuPrincipal();
		l.show();
		
		
		/*AppartemmentDAO adao=new AppartemmentDAO();
		Appartemment a=new Appartemment();*/
		
/*AdresseDAO ddao=new AdresseDAO();		
Adresse adresse=new Adresse();
Adresse a=new Adresse("monsatir","soussse","7 nouvembre");
ddao.save(a);*/

       /* ClientDAO cdao=new ClientDAO();
		Client c = new Client("aaa","aaa","aaa","aaa","aaa","aaa");
	    cdao.save(c);*/
		

		// Client client2=new Client(2,"fedi");
		// Client client3=new Client(3,"wael");
		// System.out.println("mchetttt");
		// List<Client> l=cdao.getClient();
		// System.out.println(l.get(0).getId());

		/* cdao.save(client2);cdao.save(client3); */

	}

}
