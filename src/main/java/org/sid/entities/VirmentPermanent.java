package org.sid.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
public class VirmentPermanent {
	@Id
	private String idVirment;
	private float montant;
	private Date date;
	private int frequence;
	private String idCompteSrc;
	private String idCompteBeneficiaire;
	
	public VirmentPermanent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdVirment() {
		return idVirment;
	}

	public void setIdVirment(String idVirment) {
		this.idVirment = idVirment;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public String getIdCompteSrc() {
		return idCompteSrc;
	}

	public void setIdCompteSrc(String idCompteSrc) {
		this.idCompteSrc = idCompteSrc;
	}

	public String getIdCompteBeneficiaire() {
		return idCompteBeneficiaire;
	}

	public void setIdCompteBeneficiaire(String idCompteBeneficiaire) {
		this.idCompteBeneficiaire = idCompteBeneficiaire;
	}

	public VirmentPermanent(String idVirment, float montant, Date date, int frequence, String idCompteSrc,
			String idCompteBeneficiaire) {
		super();
		this.idVirment = idVirment;
		this.montant = montant;
		this.date = date;
		this.frequence = frequence;
		this.idCompteSrc = idCompteSrc;
		this.idCompteBeneficiaire = idCompteBeneficiaire;
	}
	
	

	
}
