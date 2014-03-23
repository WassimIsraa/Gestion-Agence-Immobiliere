package objet;
import java.util.List;

import objet.Client;

import dao.ClientDAO;
import objet.Client;


public class Main 
{

	public static void main(String []args)
	{
		//System.out.println("mchetttt");	
	ClientDAO cdao=new ClientDAO();
	System.out.println("mchetttt");	
	
	Client client1=new Client(1,"Wassim");
	//Client client2=new Client(2,"fedi");
	//Client client3=new Client(3,"wael");
cdao.save(client1);
List<Client> l=cdao.getClient();
System.out.println(l.get(0).getId());

	/*cdao.save(client2);cdao.save(client3);*/
	
	
	 }
	
}

