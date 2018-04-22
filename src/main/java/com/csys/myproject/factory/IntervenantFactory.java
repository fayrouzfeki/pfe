/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Intervenant;
import com.csys.myproject.dto.IntervenantDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class IntervenantFactory {

    public static Intervenant intervenantDTOTOIntervenant(IntervenantDTO intervenantDTO) {
        Intervenant intervenant = new Intervenant();
        intervenant.setCode(intervenantDTO.getCode());
        intervenant.setCodeSaisie(intervenantDTO.getCodeSaisie());
        intervenant.setNomInterv(intervenantDTO.getNomInterv());
        intervenant.setCodeSpecialite(intervenantDTO.getCodeSpecialite());
        intervenant.setCodeDegre(intervenantDTO.getCodeDegre());
        intervenant.setCodeTypeIntervenant(intervenantDTO.getCodeTypeIntervenant());
        intervenant.setIsChirugien(intervenantDTO.getIsChirugien());
        intervenant.setPermisAdmission(intervenantDTO.getPermisAdmission());
        intervenant.setPermisAdmission(intervenantDTO.getPermisAdmission());
		intervenant.setPermisControle(intervenantDTO.getPermisControle());
		intervenant.setDelaisControle(intervenantDTO.getDelaisControle());
		intervenant.setTauxTaxe(intervenantDTO.getTauxTaxe());
		intervenant.setTauxAssurance(intervenantDTO.getTauxAssurance());
		intervenant.setDateEmbauche(intervenantDTO.getDateEmbauche());
		intervenant.setDateCreate(intervenantDTO.getDateCreate());
		intervenant.setFacturation(intervenantDTO.getFacturation());
        return intervenant;
    }

    public static IntervenantDTO intervenantTOIntervenantDTO(Intervenant intervenant) {
        if (intervenant != null) {
            IntervenantDTO intervenantDTO = new IntervenantDTO();
            intervenantDTO.setCode(intervenant.getCode());
            intervenantDTO.setCodeSaisie(intervenant.getCodeSaisie());
            intervenantDTO.setNomInterv(intervenant.getNomInterv());
            intervenantDTO.setCodeSpecialite(intervenant.getCodeSpecialite());
            intervenantDTO.setCodeDegre(intervenant.getCodeDegre());
            intervenantDTO.setCodeTypeIntervenant(intervenant.getCodeTypeIntervenant());
            intervenantDTO.setPermisAdmission(intervenant.getPermisAdmission());
            intervenantDTO.setIsChirugien(intervenant.getIsChirugien());
            intervenantDTO.setPermisAdmission(intervenant.getPermisAdmission());
			intervenantDTO.setPermisControle(intervenant.getPermisControle());
			intervenantDTO.setDelaisControle(intervenant.getDelaisControle());
			intervenantDTO.setTauxTaxe(intervenant.getTauxTaxe());
			intervenantDTO.setTauxAssurance(intervenant.getTauxAssurance());
			intervenantDTO.setDateEmbauche(intervenant.getDateEmbauche());
			intervenantDTO.setFacturation(intervenant.getFacturation());
			intervenantDTO.setDateCreate(intervenant.getDateCreate());
			intervenantDTO.setUserCreate(intervenant.getUserCreate());
			intervenantDTO.setActif(intervenant.getActif());
			intervenantDTO.setNomIntervAr(intervenant.getNomIntervAr());
			intervenantDTO.setIsOPD(intervenant.getIsOPD());
			intervenantDTO.setDureeConsultation(intervenant.getDureeConsultation());
			intervenantDTO.setNbrPlaceReservation(intervenant.getNbrPlaceReservation());
			intervenantDTO.setFacturation(intervenant.getFacturation());
            return intervenantDTO;
        } else {
            return null;
        }
    }

    public static Collection<IntervenantDTO> intervenantsToIntervenantDTOs(Collection<Intervenant> intervenants) {
        List<IntervenantDTO> intervenantDTOs = new ArrayList<>();
        for (Intervenant intervenant : intervenants) {
            IntervenantDTO intervenantDTO = intervenantTOIntervenantDTO(intervenant);
            intervenantDTOs.add(intervenantDTO);
        }
        return intervenantDTOs;
    }

}
