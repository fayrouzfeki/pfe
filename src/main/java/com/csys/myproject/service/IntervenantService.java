package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Intervenant;
import com.csys.myproject.dto.IntervenantDTO;
import com.csys.myproject.factory.IntervenantFactory;
import com.csys.myproject.repository.param.IntervenantRepository;

@Service
@Transactional
public class IntervenantService {
	@Autowired
	IntervenantRepository intervenantRepository;

	@Transactional(readOnly = true)
	public IntervenantDTO findOne(Integer id) {
		Intervenant intervenant = intervenantRepository.findOne(id);
		return IntervenantFactory.intervenantTOIntervenantDTO(intervenant);
	}

	@Transactional(readOnly = true)
	public Collection<IntervenantDTO> findAll() {
		List<Intervenant> result = intervenantRepository.findAll();
		return IntervenantFactory.intervenantsToIntervenantDTOs(result);
	}

	public IntervenantDTO add(IntervenantDTO intervenantDTO) {
		Intervenant intervenant = IntervenantFactory.intervenantDTOTOIntervenant(intervenantDTO);
		intervenant = intervenantRepository.save(intervenant);
		return IntervenantFactory.intervenantTOIntervenantDTO(intervenant);
	}

	public Intervenant update(Intervenant intervenant) {
		return intervenantRepository.save(intervenant);

	}

	public void deleteIntervenant(Integer id) {
		intervenantRepository.delete(id);

	}
}
