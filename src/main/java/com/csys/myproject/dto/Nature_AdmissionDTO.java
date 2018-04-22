package com.csys.myproject.dto;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

import javax.validation.constraints.NotNull;


public class Nature_AdmissionDTO {
	

	private	Integer code_nature_admission;
	private	String Designation;
	@NotNull
	private	String Designation_Ar;
	private	Integer Actif;
	private	LocalDateTime  Date_Create;
	private	String User_Create;
	private	String logo;
	private	Double montant_trop_percu;
	private	Double montant_moin_percu;
	
	//Collection<AdmissionDTO> admissions;
	public Integer getcode_nature_admission() {
		return code_nature_admission;
	}
	public void setcode_nature_admission(Integer code_nature_admission) {
		this.code_nature_admission = code_nature_admission;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String Designation) {
		this.Designation = Designation;
	}
	public String getDesignation_Ar() {
		return Designation_Ar;
	}
	public void setDesignation_Ar(String Designation_Ar) {
		this.Designation_Ar = Designation_Ar;
	}
	public Integer getActif() {
		return Actif;
	}
	public void setActif(Integer Actif) {
		this.Actif = Actif;
	}
	public LocalDateTime  getDate_Create() {
		return Date_Create;
	}
	public void setDate_Create(LocalDateTime Date_Create) {
		this.Date_Create = Date_Create;
	}
	public String getUser_Create() {
		return User_Create;
	}
	public void setUser_Create(String User_Create) {
		this.User_Create = User_Create;
	}
	public String getlogo() {
		return logo;
	}
	public void setlogo(String logo) {
		this.logo = logo;
	}
	public Double getmontant_trop_percu() {
		return montant_trop_percu;
	}
	public void setmontant_trop_percu(Double montant_trop_percu) {
		this.montant_trop_percu = montant_trop_percu;
	}
	public Double getmontant_moin_percu() {
		return montant_moin_percu;
	}
	public void setmontant_moin_percu(Double montant_moin_percu) {
		this.montant_moin_percu = montant_moin_percu;
	}
//	public Collection<AdmissionDTO> getAdmissions() {
//		return admissions;
//	}
//	public void setAdmissions(Collection<AdmissionDTO> admissions) {
//		this.admissions = admissions;
//	}
	
	

}
