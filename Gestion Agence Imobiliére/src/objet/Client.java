package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class Client {

	
	String nom;
	String prenom;
	String email;
	String tel;
	@Id
	String cin;
	String typeClient;


	

	public Client() 
	{
		super();

	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getTel() {
		return tel;
	}




	public void setTel(String tel) {
		this.tel = tel;
	}




	public String getCin() {
		return cin;
	}




	public void setCin(String cin) {
		this.cin = cin;
	}




	public String getTypeClient() {
		return typeClient;
	}




	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}




	public Client(String nom, String prenom, String email, String tel,
			String cin, String typeClient) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
		this.cin = cin;
		this.typeClient = typeClient;
	}

	

	}