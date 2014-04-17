package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="centreCommercial")
public class CentreCommercial {
	@GeneratedValue
	@Id	
	String description;
	String surface;
	Float prix;
	String etat;
	String statut;
	

	public CentreCommercial() 
	{
		super();

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


	public Float getPrix() {
		return prix;
	}


	public void setPrix(Float prix) {
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


	public CentreCommercial(String description, String surface, Float prix,
			String etat, String statut) {
		super();
		this.description = description;
		this.surface = surface;
		this.prix = prix;
		this.etat = etat;
		this.statut = statut;
	}
}