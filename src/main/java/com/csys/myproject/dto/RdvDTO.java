package com.csys.myproject.dto;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.csys.myproject.domain.param.Centre;
import com.csys.myproject.domain.param.Demande_Examen;
import com.csys.myproject.domain.param.Etat_Examen_Patient;

public class RdvDTO {
//	private long date_attent ;
//	
//	   public long getDate_attent() {
//		return date_attent;
//	}
//	public void setDate_attent(long date_attent) {
//		this.date_attent = date_attent;
//	}
	private Long num_Rdv;
       private LocalDateTime date_rdv;
       private LocalDateTime heure_rdv;
       private Centre centre;
       private Integer code_salle;
       private Demande_Examen demande_examen;
       private LocalDateTime Date_Create;
       private String User_Create;
       private LocalDateTime Duree;
       private String nom_ar;
       private String prenom_ar;
       private String pere_ar;
       private String grand_pere_ar;
       private String nom_complet_ar;
       private String nom_en;
       private String prenom_en;
       private String pere_en;
       private String grand_pere_en;
       private String nom_complet_en;
       private String nom_ar_brut;
       private String Sexe;
       private LocalDate DateNaissance;
       private Integer code_medecin;
       private Integer Code_Technicien;
       private Integer facturer;
       private String Num_Quittance;
       private LocalDateTime Entree_Salle;
       private LocalDateTime Sortie_Salle;
       private LocalDateTime arrivee_centre;
       private Etat_Examen_Patient Etat_examen_patient;
       private Integer Etat_attente_finale;
       private Integer duree_examen;
       private String code_admission;
       private String code_patient;
       private Integer rdv_sans_admission;
       private Integer valide;
       private Integer image_archive;
       private LocalDateTime Entree_Salle_Manuelle;
       private LocalDateTime Sortie_Salle_Manuelle;
       private String User_Entree_Salle;
       private String User_Sortie_Salle;
       private String User_validation;
       private LocalDateTime Date_validation;
       private LocalDateTime Heure_validation;
       private Long code_multi_seance;
       private Long age;
       //LocalDate birthDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
//   	@GetMapping("/compte5/{date_naissance}")
// 	Long findByagee(@PathVariable String date_naissance) throws ParseException {
// 		Date date2 = new Date();
// 		Date date_naissance2 = formatter2.parse(date_naissance);
// 		return  (long) (date2.getYear()-date_naissance2.getYear()); 		
 	
//return (long) date_naissance2.getYear();
       LocalDate localDate = LocalDate.now();
    
      // int long =(DateNaissance.getYear()- localDate.getYear()).getYears();
      // long years = 
       
	public Long getAge() {
		return ChronoUnit.YEARS.between(DateNaissance, localDate); 
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Demande_Examen getDemande_examen() {
		return demande_examen;
	}
	public void setDemande_examen(Demande_Examen demande_examen) {
		this.demande_examen = demande_examen;
	}
	public Centre getCentre() {
		return centre;
	}
	public void setCentre(Centre centre) {
		this.centre = centre;
	}
	public LocalDateTime getdate_rdv() {
		return date_rdv;
	}
	public void setdate_rdv(LocalDateTime date_rdv) {
		this.date_rdv = date_rdv;
	}
	public Long getnum_Rdv() {
		return num_Rdv;
	}
	public void setnum_Rdv(Long num_Rdv) {
		this.num_Rdv = num_Rdv;
	}
	
	public LocalDateTime getheure_rdv() {
		return heure_rdv;
	}
	public void setheure_rdv(LocalDateTime heure_rdv) {
		this.heure_rdv = heure_rdv;
	}
//	public Integer getcode_centre() {
//		return code_centre;
//	}
//	public void setcode_centre(Integer code_centre) {
//		this.code_centre = code_centre;
//	}
	public Integer getcode_salle() {
		return code_salle;
	}
	public void setcode_salle(Integer code_salle) {
		this.code_salle = code_salle;
	}
	
	public LocalDateTime getDate_Create() {
		return Date_Create;
	}
	public void setDate_Create(LocalDateTime Date_Create) {
		this.Date_Create = Date_Create;
	}
	public String getUser_Create() {
		return User_Create;
	}
	public void setUser_Create(String User_Create) {
		this.User_Create = User_Create;
	}
	public LocalDateTime getDuree() {
		return Duree;
	}
	public void setDuree(LocalDateTime Duree) {
		this.Duree = Duree;
	}
	public String getnom_ar() {
		return nom_ar;
	}
	public void setnom_ar(String nom_ar) {
		this.nom_ar = nom_ar;
	}
	public String getprenom_ar() {
		return prenom_ar;
	}
	public void setprenom_ar(String prenom_ar) {
		this.prenom_ar = prenom_ar;
	}
	public String getpere_ar() {
		return pere_ar;
	}
	public void setpere_ar(String pere_ar) {
		this.pere_ar = pere_ar;
	}
	public String getgrand_pere_ar() {
		return grand_pere_ar;
	}
	public void setgrand_pere_ar(String grand_pere_ar) {
		this.grand_pere_ar = grand_pere_ar;
	}
	public String getnom_complet_ar() {
		return nom_complet_ar;
	}
	public void setnom_complet_ar(String nom_complet_ar) {
		this.nom_complet_ar = nom_complet_ar;
	}
	public String getnom_en() {
		return nom_en;
	}
	public void setnom_en(String nom_en) {
		this.nom_en = nom_en;
	}
	public String getprenom_en() {
		return prenom_en;
	}
	public void setprenom_en(String prenom_en) {
		this.prenom_en = prenom_en;
	}
	public String getpere_en() {
		return pere_en;
	}
	public void setpere_en(String pere_en) {
		this.pere_en = pere_en;
	}
	public String getgrand_pere_en() {
		return grand_pere_en;
	}
	public void setgrand_pere_en(String grand_pere_en) {
		this.grand_pere_en = grand_pere_en;
	}
	public String getnom_complet_en() {
		return nom_complet_en;
	}
	public void setnom_complet_en(String nom_complet_en) {
		this.nom_complet_en = nom_complet_en;
	}
	public String getnom_ar_brut() {
		return nom_ar_brut;
	}
	public void setnom_ar_brut(String nom_ar_brut) {
		this.nom_ar_brut = nom_ar_brut;
	}
	public String getSexe() {
		return Sexe;
	}
	public void setSexe(String Sexe) {
		this.Sexe = Sexe;
	}
	public LocalDate getDateNaissance() {
		return DateNaissance;
	}
	public void setDateNaissance(LocalDate DateNaissance) {
		this.DateNaissance = DateNaissance;
	}
	public Integer getcode_medecin() {
		return code_medecin;
	}
	public void setcode_medecin(Integer code_medecin) {
		this.code_medecin = code_medecin;
	}
	public Integer getCode_Technicien() {
		return Code_Technicien;
	}
	public void setCode_Technicien(Integer Code_Technicien) {
		this.Code_Technicien = Code_Technicien;
	}
	public Integer getfacturer() {
		return facturer;
	}
	public void setfacturer(Integer facturer) {
		this.facturer = facturer;
	}
	public String getNum_Quittance() {
		return Num_Quittance;
	}
	public void setNum_Quittance(String Num_Quittance) {
		this.Num_Quittance = Num_Quittance;
	}
	public LocalDateTime getEntree_Salle() {
		return Entree_Salle;
	}
	public void setEntree_Salle(LocalDateTime Entree_Salle) {
		this.Entree_Salle = Entree_Salle;
	}
	public LocalDateTime getSortie_Salle() {
		return Sortie_Salle;
	}
	public void setSortie_Salle(LocalDateTime Sortie_Salle) {
		this.Sortie_Salle = Sortie_Salle;
	}
	public LocalDateTime getarrivee_centre() {
		return arrivee_centre;
	}
	public void setarrivee_centre(LocalDateTime arrivee_centre) {
		this.arrivee_centre = arrivee_centre;
	}
//	public Integer getEtat_examen_patient() {
//		return Etat_examen_patient;
//	}
//	public void setEtat_examen_patient(Integer Etat_examen_patient) {
//		this.Etat_examen_patient = Etat_examen_patient;
//	}
	
	public Integer getEtat_attente_finale() {
		return Etat_attente_finale;
	}
	public Etat_Examen_Patient getEtat_examen_patient() {
		return Etat_examen_patient;
	}
	public void setEtat_examen_patient(Etat_Examen_Patient etat_examen_patient) {
		Etat_examen_patient = etat_examen_patient;
	}
	public void setEtat_attente_finale(Integer Etat_attente_finale) {
		this.Etat_attente_finale = Etat_attente_finale;
	}
	public Integer getduree_examen() {
		return duree_examen;
	}
	public void setduree_examen(Integer duree_examen) {
		this.duree_examen = duree_examen;
	}
	public String getcode_admission() {
		return code_admission;
	}
	public void setcode_admission(String code_admission) {
		this.code_admission = code_admission;
	}
	public String getcode_patient() {
		return code_patient;
	}
	public void setcode_patient(String code_patient) {
		this.code_patient = code_patient;
	}
	public Integer getrdv_sans_admission() {
		return rdv_sans_admission;
	}
	public void setrdv_sans_admission(Integer rdv_sans_admission) {
		this.rdv_sans_admission = rdv_sans_admission;
	}
	public Integer getvalide() {
		return valide;
	}
	public void setvalide(Integer valide) {
		this.valide = valide;
	}
	public Integer getimage_archive() {
		return image_archive;
	}
	public void setimage_archive(Integer image_archive) {
		this.image_archive = image_archive;
	}
	public LocalDateTime getEntree_Salle_Manuelle() {
		return Entree_Salle_Manuelle;
	}
	public void setEntree_Salle_Manuelle(LocalDateTime Entree_Salle_Manuelle) {
		this.Entree_Salle_Manuelle = Entree_Salle_Manuelle;
	}
	public LocalDateTime getSortie_Salle_Manuelle() {
		return Sortie_Salle_Manuelle;
	}
	public void setSortie_Salle_Manuelle(LocalDateTime Sortie_Salle_Manuelle) {
		this.Sortie_Salle_Manuelle = Sortie_Salle_Manuelle;
	}
	public String getUser_Entree_Salle() {
		return User_Entree_Salle;
	}
	public void setUser_Entree_Salle(String User_Entree_Salle) {
		this.User_Entree_Salle = User_Entree_Salle;
	}
	public String getUser_Sortie_Salle() {
		return User_Sortie_Salle;
	}
	public void setUser_Sortie_Salle(String User_Sortie_Salle) {
		this.User_Sortie_Salle = User_Sortie_Salle;
	}
	public String getUser_validation() {
		return User_validation;
	}
	public void setUser_validation(String User_validation) {
		this.User_validation = User_validation;
	}
	public LocalDateTime getDate_validation() {
		return Date_validation;
	}
	public void setDate_validation(LocalDateTime Date_validation) {
		this.Date_validation = Date_validation;
	}
	public LocalDateTime getHeure_validation() {
		return Heure_validation;
	}
	public void setHeure_validation(LocalDateTime Heure_validation) {
		this.Heure_validation = Heure_validation;
	}
	public Long getcode_multi_seance() {
		return code_multi_seance;
	}
	public void setcode_multi_seance(Long code_multi_seance) {
		this.code_multi_seance = code_multi_seance;
	} 
       
}
