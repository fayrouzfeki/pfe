package com.csys.myproject.dto;

import java.time.LocalDate;

import com.csys.myproject.domain.param.Admission;
import com.csys.myproject.domain.param.Degre_Demande_Examen;
import com.csys.myproject.domain.param.Intervenant;

public class Demande_ExamenDTO {
	 private Integer  code_demande;
     private Integer nature;
     private Intervenant medecin_prescripteur;
     private Admission admission;
     private Degre_Demande_Examen degre_demande;
     private String observation;
     private String User_Create;
     private LocalDate Date_Create;
     private Integer planifier;
     private Integer code_service_demandeur;
     private String nom_medecin_autre;
     private Integer code_degre_demande;
     private Integer has_det_payer;
     private Integer nbreSeance;
     private Integer nbreSeanceParJour;
     private Integer _frequenceSeance;
     private String code_patient;
     private Integer code_etat_demande;
     private Long demande_multi_seance;

     private Integer pret;
     private Integer realiser;

 	public Integer getPret() {
		return pret;
	}
	public void setPret(Integer pret) {
		this.pret = pret;
	}
	public Integer getRealiser() {
		return realiser;
	}
	public void setRealiser(Integer realiser) {
		this.realiser = realiser;
	}

	public Degre_Demande_Examen getDegre_demande() {
		return degre_demande;
	}
	public void setDegre_demande(Degre_Demande_Examen degre_demande) {
		this.degre_demande = degre_demande;
	}
	public Intervenant getMedecin_prescripteur() {
		return medecin_prescripteur;
	}
	public void setMedecin_prescripteur(Intervenant medecin_prescripteur) {
		this.medecin_prescripteur = medecin_prescripteur;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public Integer getcode_demande() {
		return code_demande;
	}
	public void setcode_demande(Integer code_demande) {
		this.code_demande = code_demande;
	}
	public Integer getnature() {
		return nature;
	}
	public void setnature(Integer nature) {
		this.nature = nature;
	}
//	public Integer getmedecin_prescripteur() {
//		return medecin_prescripteur;
//	}
//	public void setmedecin_prescripteur(Integer medecin_prescripteur) {
//		this.medecin_prescripteur = medecin_prescripteur;
//	}
//	public String getcode_admission() {
//		return code_admission;
//	}
//	public void setcode_admission(String code_admission) {
//		this.code_admission = code_admission;
//	}
	public String getobservation() {
		return observation;
	}
	public void setobservation(String observation) {
		this.observation = observation;
	}
	public String getUser_Create() {
		return User_Create;
	}
	public void setUser_Create(String User_Create) {
		this.User_Create = User_Create;
	}
	public LocalDate getDate_Create() {
		return Date_Create;
	}
	public void setDate_Create(LocalDate Date_Create) {
		this.Date_Create = Date_Create;
	}
	public Integer getplanifier() {
		return planifier;
	}
	public void setplanifier(Integer planifier) {
		this.planifier = planifier;
	}
	public Integer getcode_service_demandeur() {
		return code_service_demandeur;
	}
	public void setcode_service_demandeur(Integer code_service_demandeur) {
		this.code_service_demandeur = code_service_demandeur;
	}
	public String getnom_medecin_autre() {
		return nom_medecin_autre;
	}
	public void setnom_medecin_autre(String nom_medecin_autre) {
		this.nom_medecin_autre = nom_medecin_autre;
	}
	public Integer getcode_degre_demande() {
		return code_degre_demande;
	}
	public void setcode_degre_demande(Integer code_degre_demande) {
		this.code_degre_demande = code_degre_demande;
	}
	public Integer gethas_det_payer() {
		return has_det_payer;
	}
	public void sethas_det_payer(Integer has_det_payer) {
		this.has_det_payer = has_det_payer;
	}
	public Integer getnbreSeance() {
		return nbreSeance;
	}
	public void setnbreSeance(Integer nbreSeance) {
		this.nbreSeance = nbreSeance;
	}
	public Integer getnbreSeanceParJour() {
		return nbreSeanceParJour;
	}
	public void setnbreSeanceParJour(Integer nbreSeanceParJour) {
		this.nbreSeanceParJour = nbreSeanceParJour;
	}
	public Integer get_frequenceSeance() {
		return _frequenceSeance;
	}
	public void set_frequenceSeance(Integer _frequenceSeance) {
		this._frequenceSeance = _frequenceSeance;
	}
	public String getcode_patient() {
		return code_patient;
	}
	public void setcode_patient(String code_patient) {
		this.code_patient = code_patient;
	}
	public Integer getcode_etat_demande() {
		return code_etat_demande;
	}
	public void setcode_etat_demande(Integer code_etat_demande) {
		this.code_etat_demande = code_etat_demande;
	}
	public Long getdemande_multi_seance() {
		return demande_multi_seance;
	}
	public void setdemande_multi_seance(Long demande_multi_seance) {
		this.demande_multi_seance = demande_multi_seance;
	}
     
     
     
     
}
