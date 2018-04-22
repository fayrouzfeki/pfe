package com.csys.myproject.domain.param;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "nature_admission", schema = "param")
public class Nature_Admission implements Serializable {
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	@Column(name = "Code")
	private Integer Code;
	@Column(name = "Designation")
	private String Designation;
	@NotNull
	@Column(name = "Designation_Ar")
	private String Designation_Ar;
	@Column(name = "Actif")
	private Integer Actif;
	@Column(name = "Date_Create")
	private LocalDateTime Date_Create;
	@Column(name = "User_Create")
	private String User_Create;
	@Column(name = "logo")
	private String logo;
	@Column(name = "montant_trop_percu")
	private Double montant_trop_percu;
	@Column(name = "montant_moin_percu")
	private Double montant_moin_percu;
//	@OneToMany(targetEntity=Admission.class)
//	private Collection<Admission> admissions;

	
	public Integer getCode() {
		return Code;
	}

	public void setCode(Integer Code) {
		this.Code = Code;
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

	public LocalDateTime getDate_Create() {
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
	

//	public Collection<Admission> getAdmissions() {
//		return admissions;
//	}
//
//	public void setAdmissions(Collection<Admission> admissions) {
//		this.admissions = admissions;
//	}

	public Nature_Admission() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}