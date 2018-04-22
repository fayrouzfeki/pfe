package com.csys.myproject.dto;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import com.csys.myproject.domain.param.Convention;
import com.csys.myproject.domain.param.Intervenant;
import com.csys.myproject.domain.param.Nature_Admission;
import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.domain.param.Societe;

public class AdmissionDTO {

	
	private	String code;
	private	String code_patient;
	private	String nom_ar;
	private	String prenom_ar;
	private	String pere_ar;
	private	String grand_pere_ar;
	private	String nom_complet_ar;
	private	String nom_en;
	private	String prenom_en;
	private	String pere_en;
	private	String grand_pere_en;
	private	String nom_complet_en;
	private	String nom_ar_brut;
	private	LocalDateTime date_naissance;
	private	String sexe;
	private	Integer code_nat;
	private	Integer type_pi;
	private	String num_pi;
	private	Date date_pi;
	private	String tel;
	private	String adresse;
	//private	Integer code_medecin_traitant;
    private Intervenant medecin_traitant;

	private	Integer code_cabinet;
	private	String code_reservation_opd;
	
	private	Integer code_nature_admission;
	private	Integer num_seq;
	private	Integer num_soc;
	//private	Integer code_convention;
	private	Integer code_price_list;
	//private	Integer code_liste_couverture;
	private	String code_lit;
	private	Integer code_etat_patient_opd;
	private	Integer code_service;
	private	Integer code_type_arrivee;
	private	Integer code_medecin_correspondant;
	private	Integer code_motif;
	private	Integer _montant_avance_exige;
	//private	Double _montant_avance_arecevoir;
	private	Integer code_categorie_chambre;
	private	Date date_dep_prevue;
	private	Date heure_dep_prevue;
	private	String receptionniste;
	private	String nom_engagement;
	private	Integer type_pi_engagement;
	private	String _numero_pi_engagement;
	private	Date date_pi_engagement;
	private	String telephone_engagement;
	private	Integer code_lien_parente;
	private	Long code_planning_cabinet;
	private	Date date_arrivee;
	private	Date heure_arrivee;
	private	Integer code_region;
	private String nature_admission;
	private Convention convention;
	
public Intervenant getMedecin_traitant() {
		return medecin_traitant;
	}
	public void setMedecin_traitant(Intervenant medecin_traitant) {
		this.medecin_traitant = medecin_traitant;
	}
public Convention getConvention() {
		return convention;
	}
	public void setConvention(Convention convention) {
		this.convention = convention;
	}
	//	private Convention convention;
//	
//	public Convention getConvention() {
//		return convention;
//	}
//	public void setConvention(Convention convention) {
//		this.convention = convention;
//	}
	//private	Integer code_motif_controle;
	private	byte[] photo;
	private	Integer is_autorised;

	 SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    private String Date1 = formatter.format(date_naissance);
	
public String getDate1() {
		return Date1;
	}
	public void setDate1(String date1) {
		Date1 = date1;
	}
	//	Collection<Demande_ExamenDTO> demande_Examens;
//	
//	public Collection<Demande_ExamenDTO> getDemande_Examens() {
//		return demande_Examens;
//	}
//	public void setDemande_Examens(Collection<Demande_ExamenDTO> demande_Examens) {
//		this.demande_Examens = demande_Examens;
//	}
	public String getcode() {
		return code;
	}
	public void setcode(String code) {
		this.code = code;
	}
	public String getcode_patient() {
		return code_patient;
	}
	public void setcode_patient(String code_patient) {
		this.code_patient = code_patient;
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
	
	public LocalDateTime getDate_naissance() {
		return date_naissance;
	}
	public void setDate_naissance(LocalDateTime date_naissance) {
		this.date_naissance = date_naissance;
	}
	public String getsexe() {
		return sexe;
	}
	public void setsexe(String sexe) {
		this.sexe = sexe;
	}
	public Integer getcode_nat() {
		return code_nat;
	}
	public void setcode_nat(Integer code_nat) {
		this.code_nat = code_nat;
	}
	public Integer gettype_pi() {
		return type_pi;
	}
	public void settype_pi(Integer type_pi) {
		this.type_pi = type_pi;
	}
	public String getnum_pi() {
		return num_pi;
	}
	public void setnum_pi(String num_pi) {
		this.num_pi = num_pi;
	}
	public Date getdate_pi() {
		return date_pi;
	}
	public void setdate_pi(Date date_pi) {
		this.date_pi = date_pi;
	}
	public String gettel() {
		return tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	public String getadresse() {
		return adresse;
	}
	public void setadresse(String adresse) {
		this.adresse = adresse;
	}
//	public Integer getcode_medecin_traitant() {
//		return code_medecin_traitant;
//	}
//	public void setcode_medecin_traitant(Integer code_medecin_traitant) {
//		this.code_medecin_traitant = code_medecin_traitant;
//	}
	public Integer getcode_cabinet() {
		return code_cabinet;
	}
	public void setcode_cabinet(Integer code_cabinet) {
		this.code_cabinet = code_cabinet;
	}
	public String getcode_reservation_opd() {
		return code_reservation_opd;
	}
	public void setcode_reservation_opd(String code_reservation_opd) {
		this.code_reservation_opd = code_reservation_opd;
	}
	
	public String getNature_admission() {
		return nature_admission;
	}
	public void setNature_admission(String nature_admission) {
		this.nature_admission = nature_admission;
	}
	public Integer getcode_nature_admission() {
		return code_nature_admission;
	}
	public void setcode_nature_admission(Integer code_nature_admission) {
		this.code_nature_admission = code_nature_admission;
	}
	public Integer getnum_seq() {
		return num_seq;
	}
	public void setnum_seq(Integer num_seq) {
		this.num_seq = num_seq;
	}
	public Integer getnum_soc() {
		return num_soc;
	}
	public void setnum_soc(Integer num_soc) {
		this.num_soc = num_soc;
	}
//	public Integer getcode_convention() {
//		return code_convention;
//	}
//	public void setcode_convention(Integer code_convention) {
//		this.code_convention = code_convention;
//	}
	public Integer getcode_price_list() {
		return code_price_list;
	}
	public void setcode_price_list(Integer code_price_list) {
		this.code_price_list = code_price_list;
	}
//	public Integer getcode_liste_couverture() {
//		return code_liste_couverture;
//	}
//	public void setcode_liste_couverture(Integer code_liste_couverture) {
//		this.code_liste_couverture = code_liste_couverture;
//	}
	public String getcode_lit() {
		return code_lit;
	}
	public void setcode_lit(String code_lit) {
		this.code_lit = code_lit;
	}
	public Integer getcode_etat_patient_opd() {
		return code_etat_patient_opd;
	}
	public void setcode_etat_patient_opd(Integer code_etat_patient_opd) {
		this.code_etat_patient_opd = code_etat_patient_opd;
	}
	public Integer getcode_service() {
		return code_service;
	}
	public void setcode_service(Integer code_service) {
		this.code_service = code_service;
	}
	public Integer getcode_type_arrivee() {
		return code_type_arrivee;
	}
	public void setcode_type_arrivee(Integer code_type_arrivee) {
		this.code_type_arrivee = code_type_arrivee;
	}
	public Integer getcode_medecin_correspondant() {
		return code_medecin_correspondant;
	}
	public void setcode_medecin_correspondant(Integer code_medecin_correspondant) {
		this.code_medecin_correspondant = code_medecin_correspondant;
	}
	public Integer getcode_motif() {
		return code_motif;
	}
	public void setcode_motif(Integer code_motif) {
		this.code_motif = code_motif;
	}
	public Integer get_montant_avance_exige() {
		return _montant_avance_exige;
	}
	public void set_montant_avance_exige(Integer _montant_avance_exige) {
		this._montant_avance_exige = _montant_avance_exige;
	}
//	public Double get_montant_avance_arecevoir() {
//		return _montant_avance_arecevoir;
//	}
//	public void set_montant_avance_arecevoir(Double _montant_avance_arecevoir) {
//		this._montant_avance_arecevoir = _montant_avance_arecevoir;
//	}
	public Integer getcode_categorie_chambre() {
		return code_categorie_chambre;
	}
	public void setcode_categorie_chambre(Integer code_categorie_chambre) {
		this.code_categorie_chambre = code_categorie_chambre;
	}
	public Date getdate_dep_prevue() {
		return date_dep_prevue;
	}
	public void setdate_dep_prevue(Date date_dep_prevue) {
		this.date_dep_prevue = date_dep_prevue;
	}
	public Date getheure_dep_prevue() {
		return heure_dep_prevue;
	}
	public void setheure_dep_prevue(Date heure_dep_prevue) {
		this.heure_dep_prevue = heure_dep_prevue;
	}
	public String getreceptionniste() {
		return receptionniste;
	}
	public void setreceptionniste(String receptionniste) {
		this.receptionniste = receptionniste;
	}
	public String getnom_engagement() {
		return nom_engagement;
	}
	public void setnom_engagement(String nom_engagement) {
		this.nom_engagement = nom_engagement;
	}
	public Integer gettype_pi_engagement() {
		return type_pi_engagement;
	}
	public void settype_pi_engagement(Integer type_pi_engagement) {
		this.type_pi_engagement = type_pi_engagement;
	}
	public String get_numero_pi_engagement() {
		return _numero_pi_engagement;
	}
	public void set_numero_pi_engagement(String _numero_pi_engagement) {
		this._numero_pi_engagement = _numero_pi_engagement;
	}
	public Date getdate_pi_engagement() {
		return date_pi_engagement;
	}
	public void setdate_pi_engagement(Date date_pi_engagement) {
		this.date_pi_engagement = date_pi_engagement;
	}
	public String gettelephone_engagement() {
		return telephone_engagement;
	}
	public void settelephone_engagement(String telephone_engagement) {
		this.telephone_engagement = telephone_engagement;
	}
	public Integer getcode_lien_parente() {
		return code_lien_parente;
	}
	public void setcode_lien_parente(Integer code_lien_parente) {
		this.code_lien_parente = code_lien_parente;
	}
	public Long getcode_planning_cabinet() {
		return code_planning_cabinet;
	}
	public void setcode_planning_cabinet(Long code_planning_cabinet) {
		this.code_planning_cabinet = code_planning_cabinet;
	}
	public Date getdate_arrivee() {
		return date_arrivee;
	}
	public void setdate_arrivee(Date date_arrivee) {
		this.date_arrivee = date_arrivee;
	}
	public Date getheure_arrivee() {
		return heure_arrivee;
	}
	public void setheure_arrivee(Date heure_arrivee) {
		this.heure_arrivee = heure_arrivee;
	}
	public Integer getcode_region() {
		return code_region;
	}
	public void setcode_region(Integer code_region) {
		this.code_region = code_region;
	}
//	public Integer getcode_motif_controle() {
//		return code_motif_controle;
//	}
//	public void setcode_motif_controle(Integer code_motif_controle) {
//		this.code_motif_controle = code_motif_controle;
//	}
	public byte[] getphoto() {
		return photo;
	}
	public void setphoto(byte[] photo) {
		this.photo = photo;
	}
	public Integer getis_autorised() {
		return is_autorised;
	}
	public void setis_autorised(Integer is_autorised) {
		this.is_autorised = is_autorised;
	}
//	public String getNature_admission() {
//		return nature_admission;
//	}
//	public void setNature_admission(String nature_admission) {
//		this.nature_admission = nature_admission;
//	}
//	
	
	
}
