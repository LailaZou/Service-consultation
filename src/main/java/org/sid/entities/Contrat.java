package org.sid.entities;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Document
public class Contrat {
	@Id
    private String idContrat  ;
    private  Date dateDebut;
    private  Date dateExpiration;
    private String idAbonne;
    
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(String idContrat) {
		this.idContrat = idContrat;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public String getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(String idAbonne) {
		this.idAbonne = idAbonne;
	}

	public Contrat(String idContrat, Date dateDebut, Date dateExpiration, String idAbonne) {
		super();
		this.idContrat = idContrat;
		this.dateDebut = dateDebut;
		this.dateExpiration = dateExpiration;
		this.idAbonne = idAbonne;
	}

    
}
