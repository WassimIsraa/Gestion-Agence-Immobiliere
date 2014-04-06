package objet;

import java.util.List;

import objet.Client;

import dao.ClientDAO;
import objet.Client;
import objet.Client;

public class Main {

	public static void main(String[] args) {
		// System.out.println("mchetttt");
		ClientDAO cdao = new ClientDAO();
		Client client = new Client();
	

		/*int tf1 = client.getTF1();

		String tf2 = client.getTF2();*/

		Client client1 = new Client(111,"hamadi");
		//Client client2 = new Client(77,"israaaaaaa");
		cdao.save(client1);
		

		// Client client2=new Client(2,"fedi");
		// Client client3=new Client(3,"wael");
		// System.out.println("mchetttt");
		// List<Client> l=cdao.getClient();
		// System.out.println(l.get(0).getId());

		/* cdao.save(client2);cdao.save(client3); */

	}

}
