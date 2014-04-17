package objet;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="annonce")
public class Annonce {
	@GeneratedValue
	@Id	
	Date date;
	String typeAnnonce;
	float prixBien;

	public Annonce() 
	{
		super();

	}

	public Annonce(Date date, String typeAnnonce, float prixBien) {
		super();
		this.date = date;
		this.typeAnnonce = typeAnnonce;
		this.prixBien = prixBien;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTypeAnnonce() {
		return typeAnnonce;
	}

	public void setTypeAnnonce(String typeAnnonce) {
		this.typeAnnonce = typeAnnonce;
	}

	public float getPrixBien() {
		return prixBien;
	}

	public void setPrixBien(float prixBien) {
		this.prixBien = prixBien;
	}
}