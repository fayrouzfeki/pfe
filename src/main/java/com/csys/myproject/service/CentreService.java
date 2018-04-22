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

import com.csys.myproject.domain.param.Centre;
import com.csys.myproject.dto.CentreDTO;
import com.csys.myproject.factory.CentreFactory;
import com.csys.myproject.repository.param.CentreRepository;

/**
 *
 * @author Fayrouz
 */
@Service
@Transactional
public class CentreService {

    @Autowired
    CentreRepository centreRepository;

    @Transactional(readOnly = true)
    public CentreDTO findOne(Integer id) {
        Centre centre = centreRepository.findOne(id);
        return CentreFactory.centreTOCentreDTO(centre);
    }

    @Transactional(readOnly = true)
    public Collection<CentreDTO> findAll() {
        List<Centre> result=centreRepository.findAll();
        return CentreFactory.centresToCentreDTOs(result);
    }

    public CentreDTO add(CentreDTO centreDTO) {
      Centre centre = CentreFactory.centreDTOTOCentre(centreDTO);
      centre=centreRepository.save(centre);
        return CentreFactory.centreTOCentreDTO(centre);
    }

    public Centre update(Centre centre) {
        return centreRepository.save(centre);

    }

    public void deleteCentre(Integer id) {
        centreRepository.delete(id);

    }

}
