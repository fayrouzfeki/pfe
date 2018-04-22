package com.csys.myproject.domain.param;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "degre_demande", schema = "examen")
public class Degre_Demande_Examen {
	@Id
	@Column(name = "code")
	private Integer code;
	@Column(name = "designation")
	private String designation;
	@Column(name = "designation_ar")
	private String designation_ar;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation_ar() {
		return designation_ar;
	}

	public void setDesignation_ar(String designation_ar) {
		this.designation_ar = designation_ar;
	}

	public Degre_Demande_Examen() {
		super();
		// TODO Auto-generated constructor stub
	}

}
