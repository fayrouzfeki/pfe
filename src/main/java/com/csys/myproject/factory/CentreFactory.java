/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Centre;
import com.csys.myproject.dto.CentreDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class CentreFactory {

    public static Centre centreDTOTOCentre(CentreDTO centreDTO) {
        Centre centre = new Centre();
        centre.setCode(centreDTO.getCode());
        centre.setDesignationAr(centreDTO.getDesignationAr());
        centre.setDesignationEn(centreDTO.getDesignationEn());
        centre.setCodenatureCentre(centreDTO.getCodenatureCentre());
        centre.setUser_Create(centreDTO.getUser_Create());
        centre.setDate_Create(centreDTO.getDate_Create());
        centre.setPeriode_rdv(centreDTO.getPeriode_rdv());
        centre.setActif(centreDTO.getActif());
        return centre;
    }

    public static CentreDTO centreTOCentreDTO(Centre centre) {
        if (centre != null) {
            CentreDTO centreDTO = new CentreDTO();
            centreDTO.setCode(centre.getCode());
            centreDTO.setDesignationAr(centre.getDesignationAr());
            centreDTO.setDesignationEn(centre.getDesignationEn());
   
            centreDTO.setCodenatureCentre(centre.getCodenatureCentre());
            centreDTO.setUser_Create(centre.getUser_Create());
            centreDTO.setDate_Create(centre.getDate_Create());
            centreDTO.setActif(centre.getActif());
            centreDTO.setPeriode_rdv(centre.getPeriode_rdv());
            centreDTO.setCode_Service(centre.getCode_Service());
            return centreDTO;
        } else {
            return null;
        }
    }

    public static Collection<CentreDTO> centresToCentreDTOs(Collection<Centre> centres) {
        List<CentreDTO> centreDTOs = new ArrayList<>();
        for (Centre centre : centres) {
            CentreDTO centreDTO = centreTOCentreDTO(centre);
            centreDTOs.add(centreDTO);
        }
        return centreDTOs;
    }

}
