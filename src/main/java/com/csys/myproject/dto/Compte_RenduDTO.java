package com.csys.myproject.dto;

import java.util.Date;

import com.csys.myproject.domain.param.Admission;
import com.csys.myproject.domain.param.Intervenant;
import com.csys.myproject.domain.param.Rdv;

public class Compte_RenduDTO {

	// "num_compte_rendu")
	private Long num_compte_rendu;

	private String Designation;

	private String user_ecrit;

	private Date date_ecrit;

	private Integer ecrit;

	private String id_document;

	//private Integer code_medecin;

	private Integer valider;

	private Date date_validation;

	private String user_validation;

	private Integer imprimer;

	private Date date_impression;

	private String user_impression;

	private Integer livre;

	private Date date_livre;

	private String user_livre;

	private Integer dicte_encours;

	private Integer dicte_termine;

	private String code_patient;

	private String code_admission;

	private Rdv rdv;
private Intervenant medecin;
	private Integer termine;

	private Integer dicteUrgente;

	private Integer nbSeqDicte;
	 private Admission admission;

	 
	 public Intervenant getMedecin() {
		return medecin;
	}
	public void setMedecin(Intervenant medecin) {
		this.medecin = medecin;
	}
	public Rdv getRdv() {
		return rdv;
	}
	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}
	public Admission getAdmission() {
			return admission;
		}
		public void setAdmission(Admission admission) {
			this.admission = admission;
		}
	public Long getnum_compte_rendu() {
		return num_compte_rendu;
	}

	public void setnum_compte_rendu(Long num_compte_rendu) {
		this.num_compte_rendu = num_compte_rendu;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}

	public String getuser_ecrit() {
		return user_ecrit;
	}

	public void setuser_ecrit(String user_ecrit) {
		this.user_ecrit = user_ecrit;
	}

	public Date getdate_ecrit() {
		return date_ecrit;
	}

	public void setdate_ecrit(Date date_ecrit) {
		this.date_ecrit = date_ecrit;
	}

	public Integer getecrit() {
		return ecrit;
	}

	public void setecrit(Integer ecrit) {
		this.ecrit = ecrit;
	}

	public String getid_document() {
		return id_document;
	}

	public void setid_document(String id_document) {
		this.id_document = id_document;
	}

//	public Integer getcode_medecin() {
//		return code_medecin;
//	}
//
//	public void setcode_medecin(Integer code_medecin) {
//		this.code_medecin = code_medecin;
//	}

	public Integer getvalider() {
		return valider;
	}

	public void setvalider(Integer valider) {
		this.valider = valider;
	}

	public Date getdate_validation() {
		return date_validation;
	}

	public void setdate_validation(Date date_validation) {
		this.date_validation = date_validation;
	}

	public String getuser_validation() {
		return user_validation;
	}

	public void setuser_validation(String user_validation) {
		this.user_validation = user_validation;
	}

	public Integer getimprimer() {
		return imprimer;
	}

	public void setimprimer(Integer imprimer) {
		this.imprimer = imprimer;
	}

	public Date getdate_impression() {
		return date_impression;
	}

	public void setdate_impression(Date date_impression) {
		this.date_impression = date_impression;
	}

	public String getuser_impression() {
		return user_impression;
	}

	public void setuser_impression(String user_impression) {
		this.user_impression = user_impression;
	}

	public Integer getlivre() {
		return livre;
	}

	public void setlivre(Integer livre) {
		this.livre = livre;
	}

	public Date getdate_livre() {
		return date_livre;
	}

	public void setdate_livre(Date date_livre) {
		this.date_livre = date_livre;
	}

	public String getuser_livre() {
		return user_livre;
	}

	public void setuser_livre(String user_livre) {
		this.user_livre = user_livre;
	}

	public Integer getdicte_encours() {
		return dicte_encours;
	}

	public void setdicte_encours(Integer dicte_encours) {
		this.dicte_encours = dicte_encours;
	}

	public Integer getdicte_termine() {
		return dicte_termine;
	}

	public void setdicte_termine(Integer dicte_termine) {
		this.dicte_termine = dicte_termine;
	}

	public String getcode_patient() {
		return code_patient;
	}

	public void setcode_patient(String code_patient) {
		this.code_patient = code_patient;
	}

	public String getcode_admission() {
		return code_admission;
	}

	public void setcode_admission(String code_admission) {
		this.code_admission = code_admission;
	}

//	public Long get_num_rdv() {
//		return _num_rdv;
//	}
//
//	public void set_num_rdv(Long _num_rdv) {
//		this._num_rdv = _num_rdv;
//	}

	public Integer gettermine() {
		return termine;
	}

	public void settermine(Integer termine) {
		this.termine = termine;
	}

	public Integer getdicteUrgente() {
		return dicteUrgente;
	}

	public void setdicteUrgente(Integer dicteUrgente) {
		this.dicteUrgente = dicteUrgente;
	}

	public Integer getnbSeqDicte() {
		return nbSeqDicte;
	}

	public void setnbSeqDicte(Integer nbSeqDicte) {
		this.nbSeqDicte = nbSeqDicte;
	}

	
}
