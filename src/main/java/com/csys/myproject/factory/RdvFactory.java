package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.dto.RdvDTO;

/**
 *
 * @author Fayrouz
 */
public class RdvFactory {

	public static Rdv rdvDTOTOCompte_rendu(RdvDTO rdvDTO) {
		Rdv rdv = new Rdv();
		rdv.setnum_Rdv(rdvDTO.getnum_Rdv());
		rdv.setdate_rdv(rdvDTO.getdate_rdv());
		rdv.setheure_rdv(rdvDTO.getheure_rdv());
		//rdv.setcode_centre(rdvDTO.getcode_centre());
		rdv.setcode_salle(rdvDTO.getcode_salle());
		//rdv.setcode_demande(rdvDTO.getcode_demande());
		rdv.setDate_Create(rdvDTO.getDate_Create());
		rdv.setUser_Create(rdvDTO.getUser_Create());
		rdv.setDuree(rdvDTO.getDuree());
		rdv.setnom_ar(rdvDTO.getnom_ar());
		rdv.setprenom_ar(rdvDTO.getprenom_ar());
		rdv.setpere_ar(rdvDTO.getpere_ar());
		rdv.setgrand_pere_ar(rdvDTO.getgrand_pere_ar());
		rdv.setnom_complet_ar(rdvDTO.getnom_complet_ar());
		rdv.setnom_en(rdvDTO.getnom_en());
		rdv.setprenom_en(rdvDTO.getprenom_en());
		rdv.setpere_en(rdvDTO.getpere_en());
		rdv.setgrand_pere_en(rdvDTO.getgrand_pere_en());
		rdv.setnom_ar_brut(rdvDTO.getnom_ar_brut());
		rdv.setSexe(rdvDTO.getSexe());
		rdv.setDateNaissance(rdvDTO.getDateNaissance());
		rdv.setcode_medecin(rdvDTO.getcode_medecin());
		rdv.setCode_Technicien(rdvDTO.getCode_Technicien());
		rdv.setfacturer(rdvDTO.getfacturer());
		rdv.setNum_Quittance(rdvDTO.getNum_Quittance());
		rdv.setEntree_Salle(rdvDTO.getEntree_Salle());
		rdv.setSortie_Salle(rdvDTO.getSortie_Salle());
		rdv.setarrivee_centre(rdvDTO.getarrivee_centre());
	//	rdv.setEtat_examen_patient(rdvDTO.getEtat_examen_patient());
		rdv.setEtat_attente_finale(rdvDTO.getEtat_attente_finale());
		rdv.setduree_examen(rdvDTO.getduree_examen());
		rdv.setcode_admission(rdvDTO.getcode_admission());
		rdv.setcode_patient(rdvDTO.getcode_patient());
		rdv.setrdv_sans_admission(rdvDTO.getrdv_sans_admission());
		rdv.setvalide(rdvDTO.getvalide());
		rdv.setimage_archive(rdvDTO.getimage_archive());
		rdv.setEntree_Salle_Manuelle(rdvDTO.getEntree_Salle_Manuelle());
		rdv.setSortie_Salle_Manuelle(rdvDTO.getSortie_Salle_Manuelle());
		rdv.setUser_Entree_Salle(rdvDTO.getUser_Entree_Salle());
		rdv.setUser_Sortie_Salle(rdvDTO.getUser_Sortie_Salle());
		rdv.setUser_validation(rdvDTO.getUser_validation());
		rdv.setDate_validation(rdvDTO.getDate_validation());
		rdv.setHeure_validation(rdvDTO.getHeure_validation());
		rdv.setcode_multi_seance(rdvDTO.getcode_multi_seance());
		//rdv.setDate_attent(rdvDTO.getDate_attent());
	//	rdvDTO.setAge(rdvDTO.getAge());
		return rdv;
	}

	public static RdvDTO rdvTORdvDTO(Rdv rdv) {
		if (rdv != null) {
			RdvDTO rdvDTO = new RdvDTO();
			rdvDTO.setnum_Rdv(rdv.getnum_Rdv());
			rdvDTO.setdate_rdv(rdv.getdate_rdv());
			rdvDTO.setheure_rdv(rdv.getheure_rdv());
			//rdvDTO.setcode_centre(rdv.getcode_centre());
			rdvDTO.setcode_salle(rdv.getcode_salle());
			//rdvDTO.setcode_demande(rdv.getcode_demande());
			rdvDTO.setUser_Create(rdv.getUser_Create());
			rdvDTO.setDate_Create(rdv.getDate_Create());
			rdvDTO.setDuree(rdv.getDuree());
			rdvDTO.setnom_ar(rdv.getnom_ar());
			rdvDTO.setprenom_ar(rdv.getprenom_ar());
			rdvDTO.setpere_ar(rdv.getpere_ar());
			rdvDTO.setgrand_pere_ar(rdv.getgrand_pere_ar());
			rdvDTO.setnom_complet_ar(rdv.getnom_complet_ar());
			rdvDTO.setUser_Create(rdv.getUser_Create());
			rdvDTO.setnom_en(rdv.getnom_en());
			rdvDTO.setpere_en(rdv.getpere_en());
			rdvDTO.setgrand_pere_en(rdv.getgrand_pere_en());
			rdvDTO.setnom_ar_brut(rdv.getnom_ar_brut());
			rdvDTO.setSexe(rdv.getSexe());
			rdvDTO.setcode_medecin(rdv.getcode_medecin());
			rdvDTO.setDateNaissance(rdv.getDateNaissance());
			rdvDTO.setCode_Technicien(rdv.getCode_Technicien());
			rdvDTO.setfacturer(rdv.getfacturer());
			rdvDTO.setNum_Quittance(rdv.getNum_Quittance());
			rdvDTO.setEntree_Salle(rdv.getEntree_Salle());
			rdvDTO.setSortie_Salle(rdv.getSortie_Salle());
			rdvDTO.setarrivee_centre(rdv.getarrivee_centre());
			//rdvDTO.setEtat_examen_patient(rdv.getEtat_examen_patient());
			rdvDTO.setduree_examen(rdv.getduree_examen());
			rdvDTO.setEtat_attente_finale(rdv.getEtat_attente_finale());
			rdvDTO.setcode_admission(rdv.getcode_admission());
			rdvDTO.setcode_patient(rdv.getcode_patient());
			rdvDTO.setrdv_sans_admission(rdv.getrdv_sans_admission());
			rdvDTO.setvalide(rdv.getvalide());
			rdvDTO.setimage_archive(rdv.getimage_archive());
			rdvDTO.setEntree_Salle_Manuelle(rdv.getEntree_Salle_Manuelle());
			rdvDTO.setduree_examen(rdv.getduree_examen());
			rdvDTO.setSortie_Salle_Manuelle(rdv.getSortie_Salle_Manuelle());
			rdvDTO.setUser_Sortie_Salle(rdv.getUser_Sortie_Salle());
			rdvDTO.setUser_validation(rdv.getUser_validation());
			rdvDTO.setcode_patient(rdv.getcode_patient());
			rdvDTO.setcode_admission(rdv.getcode_admission());
			rdvDTO.setcode_admission(rdv.getcode_admission());
			rdvDTO.setfacturer(rdv.getfacturer());
			rdvDTO.setHeure_validation(rdv.getHeure_validation());
			rdvDTO.setDate_validation(rdv.getDate_validation());
			rdvDTO.setcode_multi_seance(rdv.getcode_multi_seance());
			//rdvDTO.setDate_attent(rdv.getDate_attent());
			rdvDTO.setCentre(rdv.getCode_centre());
			rdvDTO.setDemande_examen(rdv.getDemande_examen());
			rdvDTO.setEtat_examen_patient(rdv.getEtat_examen_patient());
			rdvDTO.setAge(rdvDTO.getAge());
			return rdvDTO;
		} else {
			return null;
		}
	}

	public static Collection<RdvDTO> rdvsToRdvDTOs(Collection<Rdv> rdvs) {
		List<RdvDTO> rdvDTOs = new ArrayList<>();
		for (Rdv rdv : rdvs) {
			RdvDTO rdvDTO = rdvTORdvDTO(rdv);
			rdvDTOs.add(rdvDTO);
		}
		return rdvDTOs;
	}

}
