package com.csys.myproject.domain.param;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Societe",schema="param")
public class Societe {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Code")
	private Integer  Code;
	@Column(name = "Designation")
    private String  Designation;
	@Column(name = "Designation_Ar")
    private String  Designation_Ar;
//	@Column(name = "CalculDifferencePrix")
//    private String  CalculDifferencePrix;
//	@Column(name = "CodeSaisie")
//    private String  CodeSaisie;
//	@Column(name = "DelaisFacturation")
//    private String  DelaisFacturation;
//	@Column(name = "DelaisReglement")
//    private String  DelaisReglement;
//	@Column(name = "NiveauBordereau")
//    private String  NiveauBordereau;
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getDesignation_Ar() {
		return Designation_Ar;
	}
	public void setDesignation_Ar(String designation_Ar) {
		Designation_Ar = designation_Ar;
	}
//	public String getCalculDifferencePrix() {
//		return CalculDifferencePrix;
//	}
//	public void setCalculDifferencePrix(String calculDifferencePrix) {
//		CalculDifferencePrix = calculDifferencePrix;
//	}
//	public String getCodeSaisie() {
//		return CodeSaisie;
//	}
//	public void setCodeSaisie(String codeSaisie) {
//		CodeSaisie = codeSaisie;
//	}
//	public String getDelaisFacturation() {
//		return DelaisFacturation;
//	}
//	public void setDelaisFacturation(String delaisFacturation) {
//		DelaisFacturation = delaisFacturation;
//	}
//	public String getDelaisReglement() {
//		return DelaisReglement;
//	}
//	public void setDelaisReglement(String delaisReglement) {
//		DelaisReglement = delaisReglement;
//	}
//	public String getNiveauBordereau() {
//		return NiveauBordereau;
//	}
//	public void setNiveauBordereau(String niveauBordereau) {
//		NiveauBordereau = niveauBordereau;
//	}
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
