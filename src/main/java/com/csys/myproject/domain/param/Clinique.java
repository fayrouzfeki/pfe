package com.csys.myproject.domain.param;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clinique {
@Id
	private	int code;
	private	byte[] logo;
	private	String _nom_clinique;
	private	String _nom_clinique_Ar;
	
	
	public int getcode() {
		return code;
	}
	public void setcode(int code) {
		this.code = code;
	}
	public byte[] getlogo() {
		return logo;
	}
	public void setlogo(byte[] logo) {
		this.logo = logo;
	}
	public String get_nom_clinique() {
		return _nom_clinique;
	}
	public void set_nom_clinique(String _nom_clinique) {
		this._nom_clinique = _nom_clinique;
	}
	public String get_nom_clinique_Ar() {
		return _nom_clinique_Ar;
	}
	public void set_nom_clinique_Ar(String _nom_clinique_Ar) {
		this._nom_clinique_Ar = _nom_clinique_Ar;
	}
	public Clinique() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
