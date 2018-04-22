/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.param.Nature_Admission;
import com.csys.myproject.dto.Nature_AdmissionDTO;

/**
 *
 * @author Fayrouz
 */
public class Nature_AdmissionFactory {

    public static Nature_Admission nature_admissionDTOTONature_Admission(Nature_AdmissionDTO nature_admissionDTO) {
        Nature_Admission nature_admission = new Nature_Admission();
        nature_admission.setCode(nature_admissionDTO.getcode_nature_admission());
        nature_admission.setDesignation(nature_admissionDTO.getDesignation());
        nature_admission.setDesignation_Ar(nature_admissionDTO.getDesignation_Ar());
        nature_admission.setActif(nature_admissionDTO.getActif());
        nature_admission.setlogo(nature_admissionDTO.getlogo());
        nature_admission.setUser_Create(nature_admissionDTO.getUser_Create());
        nature_admission.setDate_Create(nature_admissionDTO.getDate_Create());
        nature_admission.setmontant_trop_percu(nature_admissionDTO.getmontant_trop_percu());
        nature_admission.setmontant_moin_percu(nature_admissionDTO.getmontant_moin_percu());
//        Collection<Admission> admissions = new ArrayList<>();
//        for (AdmissionDTO admissionDTO : nature_admissionDTO.getAdmissions()) {
//            Admission admission = AdmissionFactory.admissionDTOTOAdmission(admissionDTO);
//          // admission.setCodenature_admission(nature_admission);
//            admissions.add(admission);
//        }
      // nature_admission.setAdmissions(admissions);
        
        return nature_admission;
    }
  
    public static Nature_AdmissionDTO nature_admissionTONature_AdmissionDTO(Nature_Admission nature_admission) {
        if (nature_admission != null) {
            Nature_AdmissionDTO nature_admissionDTO = new Nature_AdmissionDTO();
            nature_admissionDTO.setcode_nature_admission(nature_admission.getCode());
            nature_admissionDTO.setDesignation(nature_admission.getDesignation());
            nature_admissionDTO.setDesignation_Ar(nature_admission.getDesignation_Ar());
            nature_admissionDTO.setActif(nature_admission.getActif());
            nature_admissionDTO.setlogo(nature_admission.getlogo());
            nature_admissionDTO.setUser_Create(nature_admission.getUser_Create());
            nature_admissionDTO.setDate_Create(nature_admission.getDate_Create());
            nature_admissionDTO.setmontant_trop_percu(nature_admission.getmontant_trop_percu());
            nature_admissionDTO.setmontant_moin_percu(nature_admission.getmontant_moin_percu());
           // nature_admissionDTO.setAdmissions(AdmissionFactory.admissionsToAdmissionDTOs(nature_admission.getAdmissions()));
            return nature_admissionDTO;
        } else {
            return null;
        }
    }

    public static Collection<Nature_AdmissionDTO> nature_admissionsToNature_AdmissionDTOs(Collection<Nature_Admission> nature_admissions) {
        List<Nature_AdmissionDTO> nature_admissionDTOs = new ArrayList<>();
        for (Nature_Admission nature_admission : nature_admissions) {
            Nature_AdmissionDTO nature_admissionDTO = nature_admissionTONature_AdmissionDTO(nature_admission);
            nature_admissionDTOs.add(nature_admissionDTO);
        }
        return nature_admissionDTOs;
    }

}
