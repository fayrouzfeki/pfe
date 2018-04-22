package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Convention;
import com.csys.myproject.dto.ConventionDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class ConventionFactory {

	public static Convention conventionDTOTOConvention(ConventionDTO conventionDTO) {
		Convention convention = new Convention();
		convention.setCode(conventionDTO.getCode());
		convention.setDesignation_Ar(conventionDTO.getDesignation_Ar());
		return convention;
	}

	public static ConventionDTO conventionTOConventionDTO(Convention convention) {
		if (convention != null) {
			ConventionDTO conventionDTO = new ConventionDTO();
			conventionDTO.setCode(convention.getCode());
			conventionDTO.setDesignation_Ar(convention.getDesignation_Ar());
			conventionDTO.setSociete(convention.getSociete());
			return conventionDTO;
		} else {
			return null;
		}
	}

	public static Collection<ConventionDTO> conventionsToConventionDTOs(Collection<Convention> conventions) {
		List<ConventionDTO> conventionDTOs = new ArrayList<>();
		for (Convention convention : conventions) {
			ConventionDTO conventionDTO = conventionTOConventionDTO(convention);
			conventionDTOs.add(conventionDTO);
		}
		return conventionDTOs;
	}

}
