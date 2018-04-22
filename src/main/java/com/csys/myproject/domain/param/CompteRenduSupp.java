package com.csys.myproject.domain.param;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompteRenduSupp implements Serializable 
{
		private static CompteRenduSupp instance=new CompteRenduSupp();
		//region ***** champs  ***** 
		@Id
		private	String Code_Examen;
		private	String _Numero_Examen;
		private	int _CODMEM;
		private	String _DESMEM;
		private	String _MedDictee;
		private	int _ValiderMedDictee;
		private	String _User_Valid;
		private	Date _Date_Valid;
		private	Date _Heure_Valid;
		private	String _User_Livre;
		private	int _Livre;
		private	int _Imprimer;
		private	Date date_imp;
		private	int _ordre;
		public CompteRenduSupp() {
			super();
			// TODO Auto-generated constructor stub
		}
		public static CompteRenduSupp getInstance() {
			return instance;
		}
		public static void setInstance(CompteRenduSupp instance) {
			CompteRenduSupp.instance = instance;
		}
		public String getCode_Examen() {
			return Code_Examen;
		}
		public void setCode_Examen(String Code_Examen) {
			this.Code_Examen = Code_Examen;
		}
		public String get_Numero_Examen() {
			return _Numero_Examen;
		}
		public void set_Numero_Examen(String _Numero_Examen) {
			this._Numero_Examen = _Numero_Examen;
		}
		public int get_CODMEM() {
			return _CODMEM;
		}
		public void set_CODMEM(int _CODMEM) {
			this._CODMEM = _CODMEM;
		}
		public String get_DESMEM() {
			return _DESMEM;
		}
		public void set_DESMEM(String _DESMEM) {
			this._DESMEM = _DESMEM;
		}
		public String get_MedDictee() {
			return _MedDictee;
		}
		public void set_MedDictee(String _MedDictee) {
			this._MedDictee = _MedDictee;
		}
		public int get_ValiderMedDictee() {
			return _ValiderMedDictee;
		}
		public void set_ValiderMedDictee(int _ValiderMedDictee) {
			this._ValiderMedDictee = _ValiderMedDictee;
		}
		public String get_User_Valid() {
			return _User_Valid;
		}
		public void set_User_Valid(String _User_Valid) {
			this._User_Valid = _User_Valid;
		}
		public Date get_Date_Valid() {
			return _Date_Valid;
		}
		public void set_Date_Valid(Date _Date_Valid) {
			this._Date_Valid = _Date_Valid;
		}
		public Date get_Heure_Valid() {
			return _Heure_Valid;
		}
		public void set_Heure_Valid(Date _Heure_Valid) {
			this._Heure_Valid = _Heure_Valid;
		}
		public String get_User_Livre() {
			return _User_Livre;
		}
		public void set_User_Livre(String _User_Livre) {
			this._User_Livre = _User_Livre;
		}
		public Date get_DateHeureLivre() {
			return _DateHeureLivre;
		}
		public void set_DateHeureLivre(Date _DateHeureLivre) {
			this._DateHeureLivre = _DateHeureLivre;
		}
		public int get_Livre() {
			return _Livre;
		}
		public void set_Livre(int _Livre) {
			this._Livre = _Livre;
		}
		public int get_Imprimer() {
			return _Imprimer;
		}
		public void set_Imprimer(int _Imprimer) {
			this._Imprimer = _Imprimer;
		}
		public Date getdate_imp() {
			return date_imp;
		}
		public void setdate_imp(Date date_imp) {
			this.date_imp = date_imp;
		}
		public int get_ordre() {
			return _ordre;
		}
		public void set_ordre(int _ordre) {
			this._ordre = _ordre;
		}
		private	Date _DateHeureLivre;
		
}
		