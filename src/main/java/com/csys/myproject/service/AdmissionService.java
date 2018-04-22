package com.csys.myproject.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Admission;
import com.csys.myproject.dto.AdmissionDTO;
import com.csys.myproject.factory.AdmissionFactory;
import com.csys.myproject.repository.param.AdmissionRepository;

@Service
@Transactional
public class AdmissionService {
	@Autowired
	AdmissionRepository admissionRepository;

	@Transactional(readOnly = true)
	public AdmissionDTO findOne(String id) {
		Admission admission = admissionRepository.findOne(id);
		return AdmissionFactory.admissionTOAdmissionDTO(admission);
	}

	@Transactional(readOnly = true)
	public Collection<AdmissionDTO> findAll() {
		List<Admission> result = admissionRepository.findAll();
		return AdmissionFactory.admissionsToAdmissionDTOs(result);
	}

	public AdmissionDTO add(AdmissionDTO admissionDTO) {
		Admission admission = AdmissionFactory.admissionDTOTOAdmission(admissionDTO);
		admission = admissionRepository.save(admission);
		return AdmissionFactory.admissionTOAdmissionDTO(admission);
	}

	public Admission update(Admission admission) {
		return admissionRepository.save(admission);

	}

	public void deleteAdmission(String id) {
		admissionRepository.delete(id);

	}
}
