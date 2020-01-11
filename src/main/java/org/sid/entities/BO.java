package org.sid.entities;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Document
public class BO {
	@Id
    private String idBo  ;
	private String nom;
	private String prenom;
	private String cin;
	private String type;
	private String idUser;
	private String tel;
	private String adresse;
	private String idAgence;
    @DBRef
    private Collection<Abonne> abonnes;
    
    
    
	public BO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getIdBo() {
		return idBo;
	}
	public void setIdBo(String idBo) {
		this.idBo = idBo;
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
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIdUser() {
		return idUser;
	}
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Abonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(Collection<Abonne> abonnes) {
		this.abonnes = abonnes;
	}
	public String getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(String idAgence) {
		this.idAgence = idAgence;
	}
	public BO(String idBo, String nom, String prenom, String cin, String type, String idUser, String tel,
			String adresse, String idAgence, Collection<Abonne> abonnes) {
		super();
		this.idBo = idBo;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.type = type;
		this.idUser = idUser;
		this.tel = tel;
		this.adresse = adresse;
		this.idAgence = idAgence;
		this.abonnes = abonnes;
	}

    
    

}
