package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.dicte.Dicte;
import com.csys.myproject.dto.DicteDTO;
import com.csys.myproject.factory.DicteFactory;
import com.csys.myproject.repository.dicte.DicteRepository;

@Service
@Transactional
public class DicteService {
	@Autowired
	DicteRepository dicteRepository;

	@Transactional(readOnly = true)
	public DicteDTO findOne(Long id) {
		Dicte dicte = dicteRepository.findOne(id);
		return DicteFactory.dicteTODicteDTO(dicte);
	}

	@Transactional(readOnly = true)
	public Collection<DicteDTO> findAll() {
		List<Dicte> result = dicteRepository.findAll();
		return DicteFactory.dictesToDicteDTOs(result);
	}

	public DicteDTO add(DicteDTO dicteDTO) {
		Dicte dicte = DicteFactory.dicteDTOTODicte(dicteDTO);
		dicte = dicteRepository.save(dicte);
		return DicteFactory.dicteTODicteDTO(dicte);
	}

	public Dicte update(Dicte dicte) {
		return dicteRepository.save(dicte);

	}

	public void deleteDicte(Long
 id) {
		dicteRepository.delete(id);

	}
}
