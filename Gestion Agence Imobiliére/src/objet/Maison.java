package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="maison")
public class Maison {
	@GeneratedValue
	@Id	
	String description;
	String surface;
    float prix;
    String etat;
	String statut;
	String nbrChambre;
	boolean garage;
	boolean jardin;
	
	public Maison() 
	{
		super();

	}

	public Maison(String description, String surface, float prix, String etat,
			String statut, String nbrChambre, boolean garage, boolean jardin) {
		super();
		this.description = description;
		this.surface = surface;
		this.prix = prix;
		this.etat = etat;
		this.statut = statut;
		this.nbrChambre = nbrChambre;
		this.garage = garage;
		this.jardin = jardin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSurface() {
		return surface;
	}

	public void setSurface(String surface) {
		this.surface = surface;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getNbrChambre() {
		return nbrChambre;
	}

	public void setNbrChambre(String nbrChambre) {
		this.nbrChambre = nbrChambre;
	}

	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public boolean isJardin() {
		return jardin;
	}

	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}



}