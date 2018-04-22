package com.csys.myproject.dto;

import javax.persistence.Column;

import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.domain.param.Societe;

public class ConventionDTO {
	private Integer Code;
	private String Designation_Ar;
	private Societe societe;
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public String getDesignation_Ar() {
		return Designation_Ar;
	}
	public void setDesignation_Ar(String designation_Ar) {
		Designation_Ar = designation_Ar;
	}
	public Societe getSociete() {
		return societe;
	}
	public void setSociete(Societe societe) {
		this.societe = societe;
	}
	
}
