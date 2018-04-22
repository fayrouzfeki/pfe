///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.csys.myproject.factory;
//
//import com.csys.myproject.domain.Acess_Centre;
//import com.csys.myproject.dto.Acess_CentreDTO;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.List;
//
///**
// *
// * @author Fayrouz
// */
//public class Acess_CentreFactory {
//
//    public static Acess_Centre acess_CentreDTOTOAcess_Centre(Acess_CentreDTO acess_CentreDTO) {
//        Acess_Centre acess_Centre = new Acess_Centre();
//        acess_Centre.set_User_Centre(acess_CentreDTO.get_User_Centre());
//        acess_Centre.set_Centre(acess_CentreDTO.get_Centre());
//        acess_Centre.set_Visible(acess_CentreDTO.get_Visible());
//        return acess_Centre;
//    }
//
//    public static Acess_CentreDTO acess_CentreTOAcess_CentreDTO(Acess_Centre acess_Centre) {
//        if (acess_Centre != null) {
//            Acess_CentreDTO acess_CentreDTO = new Acess_CentreDTO();
//            acess_CentreDTO.set_User_Centre(acess_Centre.get_User_Centre());
//            acess_CentreDTO.set_Centre(acess_Centre.get_Centre());
//            acess_CentreDTO.set_Visible(acess_Centre.get_Visible());
//           
//            return acess_CentreDTO;
//        } else {
//            return null;
//        }
//    }
//
//    public static Collection<Acess_CentreDTO> acess_CentresToAcess_CentreDTOs(Collection<Acess_Centre> acess_Centres) {
//        List<Acess_CentreDTO> acess_CentreDTOs = new ArrayList<>();
//        for (Acess_Centre acess_Centre : acess_Centres) {
//            Acess_CentreDTO acess_CentreDTO = acess_CentreTOAcess_CentreDTO(acess_Centre);
//            acess_CentreDTOs.add(acess_CentreDTO);
//        }
//        return acess_CentreDTOs;
//    }
//
//}
