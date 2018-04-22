package com.csys.myproject.domain.param;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "centre",schema="param")
public class Centre {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Code")
	private Integer Code;
	@Column(name = "DesignationAr")
	private String DesignationAr;
	@Column(name = "DesignationEn")
	private String DesignationEn;
	
	
	@Column(name = "code_natureCentre")
	private int code_natureCentre;
	@Column(name = "User_Create")
	private String User_Create;
	@Column(name = "Date_Create")
	private LocalDate Date_Create;
	@Column(name = "Actif")
	private int Actif;
	@Column(name = "periode_rdv")
	private int periode_rdv;
	@Column(name = "bornInfAttente")
	private String bornInfAttente;
	@Column(name = "bornSupAttente")
	private String bornSupAttente;
	

	
	@ManyToOne(cascade=CascadeType.ALL,targetEntity=Service.class)
    @JoinColumn(name = "Code_Service")
    private Service Code_Service;
	
	public int getCode_natureCentre() {
		return code_natureCentre;
	}
	public void setCode_natureCentre(int code_natureCentre) {
		this.code_natureCentre = code_natureCentre;
	}
	
	public void setCode_Service(Service code_Service) {
		Code_Service = code_Service;
	}
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
	public Service getCode_Service() {
		return Code_Service;
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
	public String getBornInfAttente() {
		return bornInfAttente;
	}
	public void setBornInfAttente(String bornInfAttente) {
		this.bornInfAttente = bornInfAttente;
	}
	public String getBornSupAttente() {
		return bornSupAttente;
	}
	public void setBornSupAttente(String bornSupAttente) {
		this.bornSupAttente = bornSupAttente;
	}
	public Centre() {
		super();
		// TODO Auto-generated constructor stub
	}

}