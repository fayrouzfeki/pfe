package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Convention;
import com.csys.myproject.dto.ConventionDTO;
import com.csys.myproject.factory.ConventionFactory;
import com.csys.myproject.repository.param.ConventionRepository;

@Service
@Transactional
public class ConventionService {
	@Autowired
	ConventionRepository conventionRepository;

	@Transactional(readOnly = true)
	public ConventionDTO findOne(Integer id) {
		Convention convention = conventionRepository.findOne(id);
		return ConventionFactory.conventionTOConventionDTO(convention);
	}

	@Transactional(readOnly = true)
	public Collection<ConventionDTO> findAll() {
		List<Convention> result = conventionRepository.findAll();
		return ConventionFactory.conventionsToConventionDTOs(result);
	}

	public ConventionDTO add(ConventionDTO conventionDTO) {
		Convention convention = ConventionFactory.conventionDTOTOConvention(conventionDTO);
		convention = conventionRepository.save(convention);
		return ConventionFactory.conventionTOConventionDTO(convention);
	}

	public Convention update(Convention convention) {
		return conventionRepository.save(convention);

	}

	public void deleteConvention(Integer id) {
		conventionRepository.delete(id);

	}
}
