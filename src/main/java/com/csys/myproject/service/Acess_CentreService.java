///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.csys.myproject.service;
//
//import com.csys.myproject.domain.Acess_Centre;
//import com.csys.myproject.dto.Acess_CentreDTO;
//import com.csys.myproject.factory.Acess_CentreFactory;
//import com.csys.myproject.repository.Acess_CentreRepository;
//import java.util.Collection;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author Fayrouz
// */
//@Service
//@Transactional
//public class Acess_CentreService {
//
//    @Autowired
//    Acess_CentreRepository acess_CentreRepository;
//
//    @Transactional(readOnly = true)
//    public Acess_CentreDTO findOne(String id) {
//        Acess_Centre acess_Centre = acess_CentreRepository.findOne(id);
//        return Acess_CentreFactory.acess_CentreTOAcess_CentreDTO(acess_Centre);
//    }
//
//    @Transactional(readOnly = true)
//    public Collection<Acess_CentreDTO> findAll() {
//        List<Acess_Centre> result=acess_CentreRepository.findAll();
//        return Acess_CentreFactory.acess_CentresToAcess_CentreDTOs(result);
//    }
//
//    public Acess_CentreDTO add(Acess_CentreDTO acess_CentreDTO) {
//      Acess_Centre acess_Centre = Acess_CentreFactory.acess_CentreDTOTOAcess_Centre(acess_CentreDTO);
//      acess_Centre=acess_CentreRepository.save(acess_Centre);
//        return Acess_CentreFactory.acess_CentreTOAcess_CentreDTO(acess_Centre);
//    }
//
//    public Acess_Centre update(Acess_Centre acess_Centre) {
//        return acess_CentreRepository.save(acess_Centre);
//
//    }
//
//    public void deleteAcess_Centre(String id) {
//        acess_CentreRepository.delete(id);
//
//    }
//
//}
