package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Demande_Examen;
import com.csys.myproject.dto.Demande_ExamenDTO;
import com.csys.myproject.factory.Demande_ExamenFactory;
import com.csys.myproject.repository.param.Demande_ExamenRepository;




@Service
@Transactional
public class Demande_ExamenService {
	@Autowired
	Demande_ExamenRepository demande_examenRepository;

	@Transactional(readOnly = true)
	public Demande_ExamenDTO findOne(Integer id) {
		Demande_Examen demande_examen = demande_examenRepository.findOne(id);
		return Demande_ExamenFactory.demande_examenTODemande_ExamenDTO(demande_examen);
	}

	@Transactional(readOnly = true)
	public Collection<Demande_ExamenDTO> findAll() {
		List<Demande_Examen> result = demande_examenRepository.findAll();
		return Demande_ExamenFactory.demande_examensToDemande_ExamenDTOs(result);
	}

	public Demande_ExamenDTO add(Demande_ExamenDTO demande_examenDTO) {
		Demande_Examen demande_examen = Demande_ExamenFactory.demande_examenDTOTODemande_Examen(demande_examenDTO);
		demande_examen = demande_examenRepository.save(demande_examen);
		return Demande_ExamenFactory.demande_examenTODemande_ExamenDTO(demande_examen);
	}

	public Demande_Examen update(Demande_Examen demande_examen) {
		return demande_examenRepository.save(demande_examen);

	}

	public void deleteDemande_Examen(Integer id) {
		demande_examenRepository.delete(id);

	}
}
