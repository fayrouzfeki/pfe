package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.param.Admission;
import com.csys.myproject.dto.AdmissionDTO;
import com.csys.myproject.repository.param.Nature_AdmissionRepository;


public class AdmissionFactory {
	
	private static Nature_AdmissionRepository   nature_admissionRepository;
	
	public AdmissionFactory(Nature_AdmissionRepository  nature_admissionRepository) {
		AdmissionFactory.nature_admissionRepository = nature_admissionRepository;
	}
	
	public static Admission admissionDTOTOAdmission(AdmissionDTO admissionDTO) {
		Admission admission = new Admission();
		admission.setcode(admissionDTO.getcode());
		admission.setadresse(admissionDTO.getadresse());
		admission.setcode_patient(admissionDTO.getcode_patient());
		admission.setnom_ar(admissionDTO.getnom_ar());
		admission.setprenom_ar(admissionDTO.getprenom_ar());
		admission.setpere_ar(admissionDTO.getpere_ar());

		admission.setnom_complet_ar(admissionDTO.getnom_complet_ar());
		admission.setnom_en(admissionDTO.getnom_en());

		admission.setprenom_en(admissionDTO.getprenom_en());
		admission.setpere_en(admissionDTO.getpere_en());

		admission.setnom_complet_en(admissionDTO.getnom_complet_en());
		admission.setDate_naissance(admissionDTO.getDate_naissance());

		admission.setsexe(admissionDTO.getsexe());
		admission.setcode_nat(admissionDTO.getcode_nat());

		admission.setnom_complet_ar(admissionDTO.getnom_complet_ar());
		admission.settype_pi(admissionDTO.gettype_pi());

		admission.setnum_pi(admissionDTO.getnum_pi());
		admission.setdate_pi(admissionDTO.getdate_pi());

		admission.settel(admissionDTO.gettel());
		admission.setadresse(admissionDTO.getadresse());

		//admission.setcode_medecin_traitant(admissionDTO.getcode_medecin_traitant());
	//	admission.setcode_nat(admissionDTO.getcode_nature_admission());

		admission.setcode(admissionDTO.getcode());
		admission.setcode_cabinet(admissionDTO.getcode_cabinet());

		admission.setcode_reservation_opd(admissionDTO.getcode_reservation_opd());
		admission.setCodenature_admission(nature_admissionRepository.findOne( admissionDTO.getcode_nature_admission()));

		admission.setnum_seq(admissionDTO.getnum_seq());
		admission.setnum_soc(admissionDTO.getnum_soc());

		//admission.setcode_convention(admissionDTO.getcode_convention());
		admission.setcode_price_list(admissionDTO.getcode_price_list());

		//admission.setcode_liste_couverture(admissionDTO.getcode_liste_couverture());
		admission.setcode_lit(admissionDTO.getcode_lit());
		admission.setcode_etat_patient_opd(admissionDTO.getcode_etat_patient_opd());
		admission.setcode_service(admissionDTO.getcode_service());

		admission.setcode_type_arrivee(admissionDTO.getcode_type_arrivee());
		admission.setcode_medecin_correspondant(admissionDTO.getcode_medecin_correspondant());

		admission.setcode_motif(admissionDTO.getcode_motif());
		admission.set_montant_avance_exige(admissionDTO.get_montant_avance_exige());

//		admission.set_montant_avance_arecevoir(admissionDTO.get_montant_avance_arecevoir());
		admission.setcode_categorie_chambre(admissionDTO.getcode_categorie_chambre());

		admission.setdate_dep_prevue(admissionDTO.getdate_dep_prevue());
		admission.setheure_dep_prevue(admissionDTO.getheure_dep_prevue());

		admission.setreceptionniste(admissionDTO.getreceptionniste());
		admission.setnom_engagement(admissionDTO.getnom_engagement());

		admission.settype_pi_engagement(admissionDTO.gettype_pi_engagement());
		admission.set_numero_pi_engagement(admissionDTO.get_numero_pi_engagement());

		admission.setdate_pi_engagement(admissionDTO.getdate_pi_engagement());
		admission.settelephone_engagement(admissionDTO.gettelephone_engagement());
		admission.setcode_lien_parente(admissionDTO.getcode_lien_parente());
		admission.setcode_planning_cabinet(admissionDTO.getcode_planning_cabinet());

		admission.setdate_arrivee(admissionDTO.getdate_arrivee());
		admission.setheure_arrivee(admissionDTO.getheure_arrivee());

		admission.setcode_region(admissionDTO.getcode_region());
		//admission.setcode_motif_controle(admissionDTO.getcode_motif_controle());

		admission.setphoto(admissionDTO.getphoto());
		admission.setis_autorised(admissionDTO.getis_autorised());
		
		//admissionDTO.setDate1(admissionDTO.getDate1());
        
		return admission;
	}


	public static AdmissionDTO admissionTOAdmissionDTO(Admission admission) {
		if (admission != null) {
			AdmissionDTO admissionDTO = new AdmissionDTO();
			admissionDTO.setcode(admission.getcode());
			admissionDTO.setcode_patient(admission.getcode_patient());
			admissionDTO.setnom_ar(admission.getnom_ar());
			admissionDTO.setprenom_ar(admission.getprenom_ar());
			admissionDTO.setpere_ar(admission.getpere_ar());
			admissionDTO.setadresse(admission.getadresse());
			admissionDTO.setnom_complet_ar(admission.getnom_complet_ar());
			admissionDTO.setnom_en(admission.getnom_en());
			admissionDTO.setprenom_en(admission.getprenom_en());
			admissionDTO.setpere_en(admission.getpere_en());
			admissionDTO.setnom_complet_en(admission.getnom_complet_en());
			admissionDTO.setDate_naissance(admission.getDate_naissance());
			admissionDTO.setsexe(admission.getsexe());
			admissionDTO.setcode_nat(admission.getcode_nat());
			admissionDTO.setnom_complet_ar(admission.getnom_complet_ar());
			admissionDTO.settype_pi(admission.gettype_pi());
			admissionDTO.setnum_pi(admission.getnum_pi());
			admissionDTO.setdate_pi(admission.getdate_pi());
			admissionDTO.settel(admission.gettel());
			admissionDTO.setadresse(admission.getadresse());
			//admissionDTO.setcode_medecin_traitant(admission.getcode_medecin_traitant());
			admissionDTO.setcode_nat(admission.getcode_nat());
			admissionDTO.setcode(admission.getcode());
			admissionDTO.setcode_cabinet(admission.getcode_cabinet());
			admissionDTO.setcode_reservation_opd(admission.getcode_reservation_opd());
		//	admissionDTO.setcode_nature_admission(admission.getCodenature_admission().getCode());
			admissionDTO.setnum_seq(admission.getnum_seq());
			admissionDTO.setnum_soc(admission.getnum_soc());
		//	admissionDTO.setcode_convention(admission.getcode_convention());
			admissionDTO.setcode_price_list(admission.getcode_price_list());

		//	admissionDTO.setcode_liste_couverture(admission.getcode_liste_couverture());
			admissionDTO.setcode_lit(admission.getcode_lit());
			admissionDTO.setcode_etat_patient_opd(admission.getcode_etat_patient_opd());
			admissionDTO.setcode_service(admission.getcode_service());

			admissionDTO.setcode_type_arrivee(admission.getcode_type_arrivee());
			admissionDTO.setcode_medecin_correspondant(admission.getcode_medecin_correspondant());

			admissionDTO.setcode_motif(admission.getcode_motif());
			admissionDTO.set_montant_avance_exige(admission.get_montant_avance_exige());

		//	admissionDTO.set_montant_avance_arecevoir(admission.get_montant_avance_arecevoir());
			admissionDTO.setcode_categorie_chambre(admission.getcode_categorie_chambre());

			admissionDTO.setdate_dep_prevue(admission.getdate_dep_prevue());
			admissionDTO.setheure_dep_prevue(admission.getheure_dep_prevue());

			admissionDTO.setreceptionniste(admission.getreceptionniste());
			admissionDTO.setnom_engagement(admission.getnom_engagement());

			admissionDTO.settype_pi_engagement(admission.gettype_pi_engagement());
			admissionDTO.set_numero_pi_engagement(admission.get_numero_pi_engagement());

			admissionDTO.setdate_pi_engagement(admission.getdate_pi_engagement());
			admissionDTO.settelephone_engagement(admission.gettelephone_engagement());
			admissionDTO.setcode_lien_parente(admission.getcode_lien_parente());
			admissionDTO.setcode_planning_cabinet(admission.getcode_planning_cabinet());

			admissionDTO.setdate_arrivee(admission.getdate_arrivee());
			admissionDTO.setheure_arrivee(admission.getheure_arrivee());

			admissionDTO.setcode_region(admission.getcode_region());
//			admissionDTO.setcode_motif_controle(admission.getcode_motif_controle());

			admissionDTO.setphoto(admission.getphoto());
			admissionDTO.setis_autorised(admission.getis_autorised());
			admissionDTO.setNature_admission(admission.getCodenature_admission().getDesignation_Ar());
			//admissionDTO.setDate1(admissionDTO.getDate1());
			//admissionDTO.setConvention(admission.getConvention());
			//compte_renduDTO.setRdv(compte_rendu.getRdv());
			admissionDTO.setConvention(admission.getConvention());
			admissionDTO.setMedecin_traitant(admission.getMedecin_traitant());
			return admissionDTO;
		} else {
			return null;
		}
	}

	public static Collection<AdmissionDTO> admissionsToAdmissionDTOs(Collection<Admission> admissions) {
		List<AdmissionDTO> admissionDTOs = new ArrayList<>();
		for (Admission admission : admissions) {
			AdmissionDTO admissionDTO = admissionTOAdmissionDTO(admission);
			admissionDTOs.add(admissionDTO);
		}
		return admissionDTOs;
	}

}
