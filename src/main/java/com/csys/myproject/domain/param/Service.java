package com.csys.myproject.domain.param;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Service", schema = "param")
public class Service {
@Id
	@Column(name = "Code")
	private	Integer Code;
	@Column(name = "Designation")
	private	String Designation;
	@Column(name = "Designation_Ar")
	private	String Designation_Ar;
	@Column(name = "Actif")
	private	Integer Actif;
	@Column(name = "Date_Create")
	private	Date Date_Create;
	@Column(name = "User_Create")
	private	String UserCreate;
	@Column(name = "code_Nature_service")
	private	String code_Nature_service;
	public Integer getCode() {
		return Code;
	}
	public String getDesignation() {
		return Designation;
	}
	public String getDesignation_Ar() {
		return Designation_Ar;
	}
	public Integer getActif() {
		return Actif;
	}
	public Date getDate_Create() {
		return Date_Create;
	}
	public String getUserCreate() {
		return UserCreate;
	}
	public String getCode_Nature_service() {
		return code_Nature_service;
	}
	public void setCode(Integer code) {
		Code = code;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public void setDesignation_Ar(String designation_Ar) {
		Designation_Ar = designation_Ar;
	}
	public void setActif(Integer actif) {
		Actif = actif;
	}
	public void setDate_Create(Date date_Create) {
		Date_Create = date_Create;
	}
	public void setUserCreate(String userCreate) {
		UserCreate = userCreate;
	}
	public void setCode_Nature_service(String code_Nature_service) {
		this.code_Nature_service = code_Nature_service;
	}
		
	
}
