package com.csys.myproject.domain.param;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Convention", schema = "param")
public class Convention {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Code")
	private Integer Code;

	@Column(name = "Designation_Ar")
	private String Designation_Ar;
	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Societe.class)
	@JoinColumn(name = "Code_Societe")
	private Societe societe;

	public Societe getSociete() {
		return societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	// private String DateDeb_Conv;
	// private String DateFin_Conv;
	// private String Autoriser_Admission_Sans_Empreinte;
	// private String Autoriser_Ajout_Dossier_Patient;
	// private String Plafond_Annuel;
	// private String Bloquer_Admission_Plafond;
	// private String Actif;
	// private String Pec_Obligatoire;
	// private String Num_Police_Assurance;
	// private String Type_Plafond;
	// private String Accident_Travail_Plafonee;
	// private String Date_Create;
	// private String User_Create;
	public Integer getCode() {
		return Code;
	}

	public void setCode(Integer code) {
		Code = code;
	}

	// public String getCode_Saisie() {
	// return Code_Saisie;
	// }
	// public void setCode_Saisie(String code_Saisie) {
	// Code_Saisie = code_Saisie;
	// }
	// public Integer getCode_Societe() {
	// return Code_Societe;
	// }
	// public void setCode_Societe(Integer code_Societe) {
	// Code_Societe = code_Societe;
	// }
	public String getDesignation_Ar() {
		return Designation_Ar;
	}

	public void setDesignation_Ar(String designation_Ar) {
		Designation_Ar = designation_Ar;
	}

	// public Date getDesignation() {
	// return Designation;
	// }
	// public void setDesignation(Date designation) {
	// Designation = designation;
	// }
	public Convention() {
		super();
		// TODO Auto-generated constructor stub
	}

}
