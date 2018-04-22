package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Compte_Rendu;
import com.csys.myproject.dto.Compte_RenduDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class Compte_RenduFactory {

	public static Compte_Rendu compte_renduDTOTOCompte_rendu(Compte_RenduDTO compte_renduDTO) {
		Compte_Rendu compte_rendu = new Compte_Rendu();
		compte_rendu.setnum_compte_rendu(compte_renduDTO.getnum_compte_rendu());
		compte_rendu.setDesignation(compte_renduDTO.getDesignation());
		compte_rendu.setuser_ecrit(compte_renduDTO.getuser_ecrit());
		compte_rendu.setdate_ecrit(compte_renduDTO.getdate_ecrit());
		compte_rendu.setecrit(compte_renduDTO.getecrit());
		compte_rendu.setid_document(compte_renduDTO.getid_document());
		//compte_rendu.setcode_medecin(compte_renduDTO.getcode_medecin());
		compte_rendu.setvalider(compte_renduDTO.getvalider());
		compte_rendu.setdate_validation(compte_renduDTO.getdate_validation());
		compte_rendu.setuser_validation(compte_renduDTO.getuser_validation());
		compte_rendu.setimprimer(compte_renduDTO.getimprimer());
		compte_rendu.setdate_impression(compte_renduDTO.getdate_impression());
		compte_rendu.setuser_impression(compte_renduDTO.getuser_impression());
		compte_rendu.setlivre(compte_renduDTO.getlivre());
		compte_rendu.setdate_livre(compte_renduDTO.getdate_livre());
		compte_rendu.setuser_livre(compte_renduDTO.getuser_livre());
		compte_rendu.setdicte_encours(compte_renduDTO.getdicte_encours());
		compte_rendu.setdicte_termine(compte_renduDTO.getdicte_termine());
		compte_rendu.setcode_patient(compte_renduDTO.getcode_patient());
	//	compte_rendu.setcode_admission(compte_renduDTO.getcode_admission());
		//compte_rendu.set_num_rdv(compte_renduDTO.get_num_rdv());
		compte_rendu.settermine(compte_renduDTO.gettermine());
		compte_rendu.setdicteUrgente(compte_renduDTO.getdicteUrgente());
		compte_rendu.setnbSeqDicte(compte_renduDTO.getnbSeqDicte());
	
		return compte_rendu;
	}

	public static Compte_RenduDTO compte_renduTOCompte_RenduDTO(Compte_Rendu compte_rendu) {
		if (compte_rendu != null) {
			Compte_RenduDTO compte_renduDTO = new Compte_RenduDTO();
			compte_renduDTO.setnum_compte_rendu(compte_rendu.getnum_compte_rendu());
			compte_renduDTO.setDesignation(compte_rendu.getDesignation());
			compte_renduDTO.setuser_ecrit(compte_rendu.getuser_ecrit());
			compte_renduDTO.setdate_ecrit(compte_rendu.getdate_ecrit());
			compte_renduDTO.setecrit(compte_rendu.getecrit());
			compte_renduDTO.setid_document(compte_rendu.getid_document());
			compte_renduDTO.setvalider(compte_rendu.getvalider());
			//compte_renduDTO.setcode_medecin(compte_rendu.getcode_medecin());
			compte_renduDTO.setdate_validation(compte_rendu.getdate_validation());
			compte_renduDTO.setuser_validation(compte_rendu.getuser_validation());
			compte_renduDTO.setimprimer(compte_rendu.getimprimer());
			compte_renduDTO.setdate_impression(compte_rendu.getdate_impression());
			compte_renduDTO.setuser_impression(compte_rendu.getuser_impression());
			compte_renduDTO.setlivre(compte_rendu.getlivre());
			compte_renduDTO.setvalider(compte_rendu.getvalider());
			compte_renduDTO.setdate_livre(compte_rendu.getdate_livre());
			compte_renduDTO.setdicte_encours(compte_rendu.getdicte_encours());
			compte_renduDTO.setdicte_termine(compte_rendu.getdicte_termine());
			compte_renduDTO.setcode_patient(compte_rendu.getcode_patient());
			//compte_renduDTO.setcode_admission(compte_rendu.getcode_admission());
			//compte_renduDTO.set_num_rdv(compte_rendu.get_num_rdv());
			compte_renduDTO.setdicteUrgente(compte_rendu.getdicteUrgente());
			compte_renduDTO.settermine(compte_rendu.gettermine());
			compte_renduDTO.setnbSeqDicte(compte_rendu.getnbSeqDicte());
			compte_renduDTO.setAdmission(compte_rendu.getAdmission());
			compte_renduDTO.setRdv(compte_rendu.getRdv());
			compte_renduDTO.setMedecin(compte_rendu.getMedecin());
			//compte_renduDTO.setRdv(compte_rendu.getRdv().getCode_centre().getDesignationAr());
			//compte_renduDTO.setAge2(compte_renduDTO.getAge2());
			return compte_renduDTO;
		} else {
			return null;
		}
	}

	public static Collection<Compte_RenduDTO> compte_rendusToCompte_RenduDTOs(Collection<Compte_Rendu> compte_rendus) {
		List<Compte_RenduDTO> compte_renduDTOs = new ArrayList<>();
		for (Compte_Rendu compte_rendu : compte_rendus) {
			Compte_RenduDTO compte_renduDTO = compte_renduTOCompte_RenduDTO(compte_rendu);
			compte_renduDTOs.add(compte_renduDTO);
		}
		return compte_renduDTOs;
	}

}
