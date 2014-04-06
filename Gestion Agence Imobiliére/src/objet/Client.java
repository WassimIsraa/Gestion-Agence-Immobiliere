package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class Client {
	@GeneratedValue
	@Id	
	int id;
	String nom;
	

	public Client() 
	{
		super();

	}



public Client(int id, String nom) 
{
	super();
	this.id = id;
	this.nom = nom;
	
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
}
