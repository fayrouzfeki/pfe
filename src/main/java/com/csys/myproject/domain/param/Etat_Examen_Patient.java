package com.csys.myproject.domain.param;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "etat_examen_patient",schema="centre")
public class Etat_Examen_Patient {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "code")
	private Integer code;
	@Column(name = "designation_ar")
	private String designation_ar;
	@Column(name = "designation_en")
	private String designation_en;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDesignation_ar() {
		return designation_ar;
	}
	public void setDesignation_ar(String designation_ar) {
		this.designation_ar = designation_ar;
	}
	public String getDesignation_en() {
		return designation_en;
	}
	public void setDesignation_en(String designation_en) {
		this.designation_en = designation_en;
	}
	public Etat_Examen_Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
