/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Nature_Admission;
import com.csys.myproject.dto.Nature_AdmissionDTO;
import com.csys.myproject.factory.Nature_AdmissionFactory;
import com.csys.myproject.repository.param.Nature_AdmissionRepository;

/**
 *
 * @author Fayrouz
 */
@Service
@Transactional
public class Nature_AdmissionService {

    @Autowired
    Nature_AdmissionRepository nature_admissionRepository;

    @Transactional(readOnly = true)
    public Nature_AdmissionDTO findOne(Integer id) {
        Nature_Admission nature_admission = nature_admissionRepository.findOne(id);
        return Nature_AdmissionFactory.nature_admissionTONature_AdmissionDTO(nature_admission);
    }

    @Transactional(readOnly = true)
    public Collection<Nature_AdmissionDTO> findAll() {
        List<Nature_Admission> result=nature_admissionRepository.findAll();
        return Nature_AdmissionFactory.nature_admissionsToNature_AdmissionDTOs(result);
    }

    public Nature_AdmissionDTO add(Nature_AdmissionDTO nature_admissionDTO) {
      Nature_Admission nature_admission = Nature_AdmissionFactory.nature_admissionDTOTONature_Admission(nature_admissionDTO);
      nature_admission=nature_admissionRepository.save(nature_admission);
        return Nature_AdmissionFactory.nature_admissionTONature_AdmissionDTO(nature_admission);
    }

    public Nature_Admission update(Nature_Admission nature_admission) {
        return nature_admissionRepository.save(nature_admission);

    }

    public void deleteNature_Admission(Integer id) {
        nature_admissionRepository.delete(id);

    }

}
