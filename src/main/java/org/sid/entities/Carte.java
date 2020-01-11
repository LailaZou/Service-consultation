package org.sid.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class Carte {
	@Id
	private String idCarte;
	private String type;
	private Boolean isActivate;
	public Boolean getIsActivate() {
		return isActivate;
	}

	public void setIsActivate(Boolean isActivate) {
		this.isActivate = isActivate;
	}

	private String idCompte;
	
	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(String idCarte) {
		this.idCarte = idCarte;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(String idCompte) {
		this.idCompte = idCompte;
	}

	public Carte(String idCarte, String type, Boolean isActivate, String idCompte) {
		super();
		this.idCarte = idCarte;
		this.type = type;
		this.isActivate = isActivate;
		this.idCompte = idCompte;
	}
	
	

}
