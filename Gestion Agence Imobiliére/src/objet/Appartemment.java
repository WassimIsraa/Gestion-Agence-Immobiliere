package objet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="appartemment")
public class Appartemment {
	
	@Id	
	int id;
	String description;
	float prix;
	String etat;
    String statut;
    Boolean ascenseur;
    String surface;
	public Appartemment(int id,String description, float prix, String etat,
			String statut, Boolean ascenseur, String surface) {
		super();
		this.id=id;
		this.description = description;
		this.prix = prix;
		this.etat = etat;
		this.statut = statut;
		this.ascenseur = ascenseur;
		this.surface = surface;
	}
	
	public int getID() {
		return id;
	}
	public void setId(int id) {
		this.id =id;
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Boolean getAscenseur() {
		return ascenseur;
	}
	public void setAscenseur(Boolean ascenseur) {
		this.ascenseur = ascenseur;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public Appartemment() 
	{
		super();

	}
}