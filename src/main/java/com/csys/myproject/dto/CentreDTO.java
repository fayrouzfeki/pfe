package com.csys.myproject.dto;

import java.time.LocalDate;
import java.util.Date;

import com.csys.myproject.domain.param.Service;

public class CentreDTO {
	private Integer Code;
	private String DesignationAr;
	private String DesignationEn;
	private Service Code_Service;
	private int code_natureCentre;
	private String User_Create;
	private LocalDate Date_Create;
	private int Actif;
	private int periode_rdv;
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public String getDesignationAr() {
		return DesignationAr;
	}
	public void setDesignationAr(String designationAr) {
		DesignationAr = designationAr;
	}
	public String getDesignationEn() {
		return DesignationEn;
	}
	public void setDesignationEn(String designationEn) {
		DesignationEn = designationEn;
	}
	
	public Service getCode_Service() {
		return Code_Service;
	}
	public void setCode_Service(Service code_Service) {
		Code_Service = code_Service;
	}
	public int getCode_natureCentre() {
		return code_natureCentre;
	}
	public void setCode_natureCentre(int code_natureCentre) {
		this.code_natureCentre = code_natureCentre;
	}
	public int getCodenatureCentre() {
		return code_natureCentre;
	}
	public void setCodenatureCentre(int code_natureCentre) {
		this.code_natureCentre = code_natureCentre;
	}
	public String getUser_Create() {
		return User_Create;
	}
	public void setUser_Create(String user_Create) {
		User_Create = user_Create;
	}
	
	public LocalDate getDate_Create() {
		return Date_Create;
	}
	public void setDate_Create(LocalDate date_Create) {
		Date_Create = date_Create;
	}
	public int getActif() {
		return Actif;
	}
	public void setActif(int actif) {
		Actif = actif;
	}
	public int getPeriode_rdv() {
		return periode_rdv;
	}
	public void setPeriode_rdv(int periode_rdv) {
		this.periode_rdv = periode_rdv;
	}
}