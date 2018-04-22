package com.csys.myproject.domain.param;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Intervenant",schema="param")
public class Intervenant implements Serializable{
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Code")
	private	Integer Code;
	@Column(name = "Code_Saisie")
	private	String CodeSaisie;
	@Column(name = "Nom_Interv")
	private	String NomInterv;
	@Column(name = "Code_Specialite")
	private	Integer CodeSpecialite;
	@Column(name = "Code_Degre")
	private	Integer CodeDegre;
	@Column(name = "Code_Type_Intervenant")
	private	Integer CodeTypeIntervenant;
	@Column(name = "Is_Chirugien")
	private	Integer IsChirugien;
	@Column(name = "Permis_Admission")
	private	Integer PermisAdmission;
	@Column(name = "Permis_Controle")
	private	Integer PermisControle;
	@Column(name = "Delais_Controle")
	private	Integer DelaisControle;
	@Column(name = "Taux_Taxe")
	private	Long TauxTaxe;
	@Column(name = "Taux_Assurance")
	private	Long TauxAssurance;
	@Column(name = "Date_Embauche")
	private	Date DateEmbauche;
	@Column(name = "Code_Prestation_Consultation")
	private	Integer CodePrestationConsultation;
	@Column(name = "Date_Create")
	private	Date DateCreate;
	@Column(name = "User_Create")
	private	String UserCreate;
	@Column(name = "Actif")
	private	Integer Actif;
	@Column(name = " Nom_Interv_Ar")
	private	String NomIntervAr;
	@Column(name = "Is_OPD")
	private	Integer IsOPD;
	@Column(name = "Duree_Consultation")
	private	Integer DureeConsultation;
	@Column(name = "Nbr_Place_Reservation")
	private	Integer NbrPlaceReservation;
	@Column(name = "Facturation")
	private	Integer Facturation;
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public String getCodeSaisie() {
		return CodeSaisie;
	}
	public void setCodeSaisie(String codeSaisie) {
		CodeSaisie = codeSaisie;
	}
	public String getNomInterv() {
		return NomInterv;
	}
	public void setNomInterv(String nomInterv) {
		NomInterv = nomInterv;
	}
	public Integer getCodeSpecialite() {
		return CodeSpecialite;
	}
	public void setCodeSpecialite(Integer codeSpecialite) {
		CodeSpecialite = codeSpecialite;
	}
	public Integer getCodeDegre() {
		return CodeDegre;
	}
	public void setCodeDegre(Integer codeDegre) {
		CodeDegre = codeDegre;
	}
	public Integer getCodeTypeIntervenant() {
		return CodeTypeIntervenant;
	}
	public void setCodeTypeIntervenant(Integer codeTypeIntervenant) {
		CodeTypeIntervenant = codeTypeIntervenant;
	}
	public Integer getIsChirugien() {
		return IsChirugien;
	}
	public void setIsChirugien(Integer isChirugien) {
		IsChirugien = isChirugien;
	}
	public Integer getPermisAdmission() {
		return PermisAdmission;
	}
	public void setPermisAdmission(Integer permisAdmission) {
		PermisAdmission = permisAdmission;
	}
	public Integer getPermisControle() {
		return PermisControle;
	}
	public void setPermisControle(Integer permisControle) {
		PermisControle = permisControle;
	}
	public Integer getDelaisControle() {
		return DelaisControle;
	}
	public void setDelaisControle(Integer delaisControle) {
		DelaisControle = delaisControle;
	}
	public Long getTauxTaxe() {
		return TauxTaxe;
	}
	public void setTauxTaxe(Long tauxTaxe) {
		TauxTaxe = tauxTaxe;
	}
	public Long getTauxAssurance() {
		return TauxAssurance;
	}
	public void setTauxAssurance(Long tauxAssurance) {
		TauxAssurance = tauxAssurance;
	}
	public Date getDateEmbauche() {
		return DateEmbauche;
	}
	public void setDateEmbauche(Date dateEmbauche) {
		DateEmbauche = dateEmbauche;
	}
	public Integer getCodePrestationConsultation() {
		return CodePrestationConsultation;
	}
	public void setCodePrestationConsultation(Integer codePrestationConsultation) {
		CodePrestationConsultation = codePrestationConsultation;
	}
	public Date getDateCreate() {
		return DateCreate;
	}
	public void setDateCreate(Date dateCreate) {
		DateCreate = dateCreate;
	}
	public String getUserCreate() {
		return UserCreate;
	}
	public void setUserCreate(String userCreate) {
		UserCreate = userCreate;
	}
	public Integer getActif() {
		return Actif;
	}
	public void setActif(Integer actif) {
		Actif = actif;
	}
	public String getNomIntervAr() {
		return NomIntervAr;
	}
	public void setNomIntervAr(String nomIntervAr) {
		NomIntervAr = nomIntervAr;
	}
	public Integer getIsOPD() {
		return IsOPD;
	}
	public void setIsOPD(Integer isOPD) {
		IsOPD = isOPD;
	}
	public Integer getDureeConsultation() {
		return DureeConsultation;
	}
	public void setDureeConsultation(Integer dureeConsultation) {
		DureeConsultation = dureeConsultation;
	}
	public Integer getNbrPlaceReservation() {
		return NbrPlaceReservation;
	}
	public void setNbrPlaceReservation(Integer nbrPlaceReservation) {
		NbrPlaceReservation = nbrPlaceReservation;
	}
	public Integer getFacturation() {
		return Facturation;
	}
	public void setFacturation(Integer facturation) {
		Facturation = facturation;
	}
	public Intervenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
