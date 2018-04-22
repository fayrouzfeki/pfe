package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.dto.RdvDTO;
import com.csys.myproject.factory.RdvFactory;
import com.csys.myproject.repository.param.RdvRepository;

@Service
@Transactional
public class RdvService {
	@Autowired
	RdvRepository rdvRepository;

	@Transactional(readOnly = true)
	public RdvDTO findOne(Long id) {
		Rdv rdv = rdvRepository.findOne(id);
		return RdvFactory.rdvTORdvDTO(rdv);
	}

	@Transactional(readOnly = true)
	public Collection<RdvDTO> findAll() {
		List<Rdv> result = rdvRepository.findAll();
		return RdvFactory.rdvsToRdvDTOs(result);
	}

	public RdvDTO add(RdvDTO rdvDTO) {
		Rdv rdv = RdvFactory.rdvDTOTOCompte_rendu(rdvDTO);
		rdv = rdvRepository.save(rdv);
		return RdvFactory.rdvTORdvDTO(rdv);
	}

	public Rdv update(Rdv rdv) {
		return rdvRepository.save(rdv);

	}

	public void deleteRdv(Long id) {
		rdvRepository.delete(id);

	}
	
	@Transactional(readOnly = true)
	public Collection<RdvDTO> findbymatcher() {
				Rdv rdv = new Rdv();
				rdv.setcode_admission("555");
				rdv.setnom_ar("lll");
		ExampleMatcher matcher = ExampleMatcher.matchingAny().withStringMatcher(StringMatcher.CONTAINING);
		Example<Rdv> exp = Example.of(rdv, matcher);
		List<Rdv> result = rdvRepository.findAll(exp);
		return RdvFactory.rdvsToRdvDTOs(result);
	}

}
