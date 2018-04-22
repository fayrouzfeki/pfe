package com.csys.myproject.dto;

import java.sql.Date;



public class DicteDTO {

	private Long num;
	private String NumDemande;
	private String CodeExamen;
	private byte[] ValDicte;
	private Date DateDicte;
	private String userDicte;
	private Integer num_compte_rendu;
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getNumDemande() {
		return NumDemande;
	}
	public void setNumDemande(String numDemande) {
		NumDemande = numDemande;
	}
	public String getCodeExamen() {
		return CodeExamen;
	}
	public void setCodeExamen(String codeExamen) {
		CodeExamen = codeExamen;
	}
	
	public byte[] getValDicte() {
		return ValDicte;
	}
	public void setValDicte(byte[] valDicte) {
		ValDicte = valDicte;
	}
	public Date getDateDicte() {
		return DateDicte;
	}
	public void setDateDicte(Date dateDicte) {
		DateDicte = dateDicte;
	}
	public String getUserDicte() {
		return userDicte;
	}
	public void setUserDicte(String userDicte) {
		this.userDicte = userDicte;
	}
	public Integer getNum_compte_rendu() {
		return num_compte_rendu;
	}
	public void setNum_compte_rendu(Integer num_compte_rendu) {
		this.num_compte_rendu = num_compte_rendu;
	}
	
	
}
