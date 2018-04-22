package com.csys.myproject.domain.param;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(name = "RDV",schema="centre")
public class Rdv
    {
        
        //region ***** champs  *****
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "num_Rdv")
        private Long num_Rdv;
	@Column(name = "date_rdv")
        private LocalDateTime date_rdv;
	@Column(name = "heure_rdv")
        private LocalDateTime heure_rdv;
//	@Column(name = "code_centre")
//        private Integer code_centre;
	@Column(name = "code_salle")
        private Integer code_salle;
	@Column(name = "Date_Create")
        private LocalDateTime Date_Create;
	@Column(name = "User_Create")
        private String User_Create;
	@Column(name = "Duree")
        private LocalDateTime Duree;
	@Column(name = "nom_ar")
        private String nom_ar;
	@Column(name = "prenom_ar")
        private String prenom_ar;
	@Column(name = "pere_ar")
        private String pere_ar;
	@Column(name = "grand_pere_ar")
        private String grand_pere_ar;
	@Column(name = "nom_complet_ar")
        private String nom_complet_ar;
	@Column(name = "nom_en")
        private String nom_en;
	@Column(name = "prenom_en")
        private String prenom_en;
	@Column(name = "pere_en")
        private String pere_en;
	@Column(name = "grand_pere_en")
        private String grand_pere_en;
	@Column(name = "nom_complet_en")
        private String nom_complet_en;
	@Column(name = "nom_ar_brut")
        private String nom_ar_brut;
	@Column(name = "Sexe")
        private String Sexe;
	@Column(name = "DateNaissance")
        private LocalDate DateNaissance;
	@Column(name = "code_medecin")
        private Integer code_medecin;
	@Column(name = "Code_Technicien")
        private Integer Code_Technicien;
	@Column(name = "facturer")
        private Integer facturer;
	@Column(name = "Num_Quittance")
        private String Num_Quittance;
	@Column(name = "Entree_Salle")
        private LocalDateTime Entree_Salle;
	@Column(name = "Sortie_Salle")
        private LocalDateTime Sortie_Salle;
	@Column(name = "arrivee_centre")
        private LocalDateTime arrivee_centre;

	@Column(name = "Etat_attente_finale")
        private Integer Etat_attente_finale;
	@Column(name = "duree_examen")
        private Integer duree_examen;
	@Column(name = "code_admission")
        private String code_admission;
	@Column(name = "code_patient")
        private String code_patient;
	@Column(name = "rdv_sans_admission")
        private Integer rdv_sans_admission;
	@Column(name = "valide")
        private Integer valide;
	@Column(name = "image_archive")
        private Integer image_archive;
	@Column(name = "Entree_Salle_Manuelle")
        private LocalDateTime Entree_Salle_Manuelle;
	@Column(name = "Sortie_Salle_Manuelle")
        private LocalDateTime Sortie_Salle_Manuelle;
	@Column(name = "User_Entree_Salle")
        private String User_Entree_Salle;
	@Column(name = "User_Sortie_Salle")
        private String User_Sortie_Salle;
	@Column(name = "User_validation")
        private String User_validation;
	@Column(name = "Date_validation")
        private LocalDateTime Date_validation;
	@Column(name = "Heure_validation")
        private LocalDateTime Heure_validation;
	@Column(name = "code_multi_seance")
        private Long dure_attent;
	@Column(name = "dure_attent")
	
    private Long code_multi_seance;
	public Long getDure_attent() {
		return dure_attent;
	}
	public void setDure_attent(Long dure_attent) {
		this.dure_attent = dure_attent;
	}
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Etat_Examen_Patient.class)
    @JoinColumn(name = "Etat_Examen_Patient")
    private Etat_Examen_Patient Etat_examen_patient;
	public Etat_Examen_Patient getEtat_examen_patient() {
		return Etat_examen_patient;
	}
	public void setEtat_examen_patient(Etat_Examen_Patient etat_examen_patient) {
		Etat_examen_patient = etat_examen_patient;
	}
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Centre.class)
    @JoinColumn(name="code_centre")
	private Centre code_centre;
	
	
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Demande_Examen.class)
    @JoinColumn(name="code_demande")
	private Demande_Examen demande_examen;
	
//	 long age;
//	
//
//		
//	public long getAge() {
//		return age;
//	}
//	public void setAge(long age) {
//		this.age = age;
//	}
		//	LocalDate today = LocalDate.now();
//	//@Column(name = "date_attent")
//private long date_attent = ChronoUnit.DAYS.between(today, date_rdv);
//	  
//		public long getDate_attent() {
//		return date_attent;
//	}
//	public void setDate_attent(long date_attent) {
//		this.date_attent = date_attent;
//	}
		public Demande_Examen getDemande_examen() {
		return demande_examen;
	}
	public void setDemande_examen(Demande_Examen demande_examen) {
		this.demande_examen = demande_examen;
	}
		public Centre getCode_centre() {
		return code_centre;
	}
	public void setCode_centre(Centre code_centre) {
		this.code_centre = code_centre;
	}
		public Long getnum_Rdv() {
			return num_Rdv;
		}
		public void setnum_Rdv(Long num_Rdv) {
			this.num_Rdv = num_Rdv;
		}
		public LocalDateTime getdate_rdv() {
			return date_rdv;
		}
		public void setdate_rdv(LocalDateTime date_rdv) {
			this.date_rdv = date_rdv;
		}
		public LocalDateTime getheure_rdv() {
			return heure_rdv;
		}
		public void setheure_rdv(LocalDateTime heure_rdv) {
			this.heure_rdv = heure_rdv;
		}
//		public Integer getcode_centre() {
//			return code_centre;
//		}
//		public void setcode_centre(Integer code_centre) {
//			this.code_centre = code_centre;
//		}
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
//		public Integer getEtat_examen_patient() {
//			return Etat_examen_patient;
//		}
//		public void setEtat_examen_patient(Integer Etat_examen_patient) {
//			this.Etat_examen_patient = Etat_examen_patient;
//		}
		public Integer getEtat_attente_finale() {
			return Etat_attente_finale;
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
		public Rdv() {
			super();
			// TODO Auto-generated constructor stub
		} 
        
        
}