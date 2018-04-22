package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.param.Demande_Examen;
import com.csys.myproject.dto.Demande_ExamenDTO;
import com.csys.myproject.repository.param.AdmissionRepository;

/**
 *
 * @author Fayrouz
 */
public class Demande_ExamenFactory {

	private static AdmissionRepository   admissionRepository;
	
	public Demande_ExamenFactory(AdmissionRepository  admissionRepository) {
		Demande_ExamenFactory.admissionRepository = admissionRepository;
	}
	
	public static Demande_Examen demande_examenDTOTODemande_Examen(Demande_ExamenDTO demande_examenDTO) {
		Demande_Examen demande_examen = new Demande_Examen();
		demande_examen.setcode_demande(demande_examenDTO.getcode_demande());
		demande_examen.setnature(demande_examenDTO.getnature());
		//demande_examen.setmedecin_prescripteur(demande_examenDTO.getmedecin_prescripteur());
		//demande_examen.setAdmission(admissionRepository.findOne(demande_examenDTO.getAdmission()));
		demande_examen.setobservation(demande_examenDTO.getobservation());
		demande_examen.setUser_Create(demande_examenDTO.getUser_Create());
		demande_examen.setDate_Create(demande_examenDTO.getDate_Create());
		demande_examen.setplanifier(demande_examenDTO.getplanifier());
		demande_examen.setcode_service_demandeur(demande_examenDTO.getcode_service_demandeur());
		demande_examen.setnom_medecin_autre(demande_examenDTO.getnom_medecin_autre());
	//	demande_examen.setcode_degre_demande(demande_examenDTO.getcode_degre_demande());
		demande_examen.sethas_det_payer(demande_examenDTO.gethas_det_payer());
		demande_examen.setnbreSeance(demande_examenDTO.getnbreSeance());
		demande_examen.setnbreSeanceParJour(demande_examenDTO.getnbreSeanceParJour());
		demande_examen.set_frequenceSeance(demande_examenDTO.get_frequenceSeance());
		demande_examen.setcode_patient(demande_examenDTO.getcode_patient());
		demande_examen.setcode_etat_demande(demande_examenDTO.getcode_etat_demande());
		demande_examen.setdemande_multi_seance(demande_examenDTO.getdemande_multi_seance());
		
		demande_examen.setPret(demande_examenDTO.getPret());
		demande_examen.setRealiser(demande_examenDTO.getRealiser());

		
		return demande_examen;
	}

	public static Demande_ExamenDTO demande_examenTODemande_ExamenDTO(Demande_Examen demande_examen) {
		if (demande_examen != null) {
			Demande_ExamenDTO demande_examenDTO = new Demande_ExamenDTO();
			demande_examenDTO.setcode_demande(demande_examen.getcode_demande());
			demande_examenDTO.setnature(demande_examen.getnature());
		//	demande_examenDTO.setmedecin_prescripteur(demande_examen.getmedecin_prescripteur());
		//	demande_examenDTO.setcode_admission(demande_examen.getcode_admission());
			demande_examenDTO.setobservation(demande_examen.getobservation());
			demande_examenDTO.setUser_Create(demande_examen.getUser_Create());
			demande_examenDTO.setplanifier(demande_examen.getplanifier());
			demande_examenDTO.setDate_Create(demande_examen.getDate_Create());
			demande_examenDTO.setcode_service_demandeur(demande_examen.getcode_service_demandeur());
			demande_examenDTO.setnom_medecin_autre(demande_examen.getnom_medecin_autre());
	//		demande_examenDTO.setcode_degre_demande(demande_examen.getcode_degre_demande());
			demande_examenDTO.sethas_det_payer(demande_examen.gethas_det_payer());
			demande_examenDTO.setnbreSeance(demande_examen.getnbreSeance());
			demande_examenDTO.setnbreSeanceParJour(demande_examen.getnbreSeanceParJour());
			demande_examenDTO.setplanifier(demande_examen.getplanifier());
			demande_examenDTO.set_frequenceSeance(demande_examen.get_frequenceSeance());
			demande_examenDTO.setcode_etat_demande(demande_examen.getcode_etat_demande());
			demande_examenDTO.setdemande_multi_seance(demande_examen.getdemande_multi_seance());
			demande_examenDTO.setAdmission(demande_examen.getAdmission());
			demande_examenDTO.setMedecin_prescripteur(demande_examen.getMedecin_prescripteur());
			demande_examenDTO.setDegre_demande(demande_examen.getDegre_demande());
			//demande_examenDTO.setAdmission(demande_examen.getAdmission().getadresse());
			demande_examenDTO.setPret(demande_examen.getPret());
			demande_examenDTO.setRealiser(demande_examen.getRealiser());

			return demande_examenDTO;
		} else {
			return null;
		}
	}

	public static Collection<Demande_ExamenDTO> demande_examensToDemande_ExamenDTOs(Collection<Demande_Examen> demande_examens) {
		List<Demande_ExamenDTO> demande_examenDTOs = new ArrayList<>();
		for (Demande_Examen demande_examen : demande_examens) {
			Demande_ExamenDTO demande_examenDTO = demande_examenTODemande_ExamenDTO(demande_examen);
			demande_examenDTOs.add(demande_examenDTO);
		}
		return demande_examenDTOs;
	}

}
