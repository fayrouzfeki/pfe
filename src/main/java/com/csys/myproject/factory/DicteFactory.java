/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.csys.myproject.domain.dicte.Dicte;
import com.csys.myproject.dto.DicteDTO;

/**
 *
 * @author Fayrouz
 */
public class DicteFactory {

    public static Dicte dicteDTOTODicte(DicteDTO dicteDTO) {
        Dicte dicte = new Dicte();
        dicte.setNum(dicteDTO.getNum());
        dicte.setNumDemande(dicteDTO.getNumDemande());
        dicte.setCodeExamen(dicteDTO.getCodeExamen());
      //  dicte.setValDicte(dicteDTO.getValDicte());
        dicte.setDateDicte(dicteDTO.getDateDicte());
        dicte.setUserDicte(dicteDTO.getUserDicte());
        dicte.setNum_compte_rendu(dicteDTO.getNum_compte_rendu());
   

        return dicte;
    }
  
    public static DicteDTO dicteTODicteDTO(Dicte dicte) {
        if (dicte != null) {
            DicteDTO dicteDTO = new DicteDTO();
            dicteDTO.setNum(dicte.getNum());
            dicteDTO.setNumDemande(dicte.getNumDemande());
            dicteDTO.setCodeExamen(dicte.getCodeExamen());
            //dicteDTO.setValDicte(dicte.getValDicte());
            dicteDTO.setDateDicte(dicte.getDateDicte());
            dicteDTO.setUserDicte(dicte.getUserDicte());
            dicteDTO.setNum_compte_rendu(dicte.getNum_compte_rendu());
   
            return dicteDTO;
        } else {
            return null;
        }
    }

    public static Collection<DicteDTO> dictesToDicteDTOs(Collection<Dicte> dictes) {
        List<DicteDTO> dicteDTOs = new ArrayList<>();
        for (Dicte dicte : dictes) {
            DicteDTO dicteDTO = dicteTODicteDTO(dicte);
            dicteDTOs.add(dicteDTO);
        }
        return dicteDTOs;
    }

}
