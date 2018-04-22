package com.csys.myproject.domain.dicte;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Dicte" )
public class Dicte {
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "num")
	private Long num;
	@Column(name = "NumDemande")
	private String NumDemande;
	@Column(name = "CodeExamen")
	private String CodeExamen;
	@Column(name = "ValDicte")
	private byte[] ValDicte;
	@Column(name = "DateDicte")
	private Date DateDicte;
	@Column(name = "userDicte")
	private String userDicte;
	@Column(name = "num_compte_rendu")
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
	public Dicte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
