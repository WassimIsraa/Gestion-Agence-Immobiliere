package objet;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.sql.rowset.serial.SerialArray;

@Entity
@Table(name="Farfour")
public class Farfour {

	@Id 
	int id;
	String nom;
	Integer age;
	
	
	public Farfour() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Farfour(String nom, Integer age) {
		super();
	    this.id=id;
		this.nom = nom;
		this.age = age;
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


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}
}