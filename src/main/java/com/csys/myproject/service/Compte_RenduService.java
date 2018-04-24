package com.csys.myproject.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.StringMatcher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csys.myproject.domain.param.Admission;
import com.csys.myproject.domain.param.Compte_Rendu;
import com.csys.myproject.domain.param.Demande_Examen;
import com.csys.myproject.domain.param.Etat_Examen_Patient;
import com.csys.myproject.domain.param.Intervenant;
import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.dto.Compte_RenduDTO;
import com.csys.myproject.factory.Compte_RenduFactory;
import com.csys.myproject.repository.param.Compte_RenduRepository;
import com.csys.myproject.repository.param.RdvRepository;

@Service
@Transactional
public class Compte_RenduService {

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@Autowired
	Compte_RenduRepository compte_renduRepository;
	@Autowired
	RdvRepository rdvRepository;

	@Autowired
	Compte_RenduService compte_renduService;

	@Transactional(readOnly = true)
	public Compte_RenduDTO findOne(Long id) {
		Compte_Rendu compte_rendu = compte_renduRepository.findOne(id);
		return Compte_RenduFactory.compte_renduTOCompte_RenduDTO(compte_rendu);
	}

	
	@Transactional(readOnly = true)
	public Collection<Compte_RenduDTO> findByExample(String code_admission,String nom_ar,String nom_ar_brut,
			String nom_complet_ar,String nom_complet_en,String prenom_ar,
			String prenom_en,String NomInterv,String NomIntervAr,String Designation_ar,String tel,String code_patient) {
		Compte_Rendu compte_rendu = new Compte_Rendu();
		Rdv rdv = new Rdv();
		Intervenant intervenant =new Intervenant();
		Demande_Examen demande_Examen =new Demande_Examen();
		Admission admission =new Admission();
		Etat_Examen_Patient etat_Examen_Patient =new Etat_Examen_Patient();
		rdv.setcode_admission(code_admission);
		rdv.setnom_ar(nom_ar);
		rdv.setnom_ar_brut(nom_ar_brut);
	
		rdv.setnom_complet_ar(nom_complet_ar);
		rdv.setnom_complet_en(nom_complet_en);
		rdv.setprenom_ar(prenom_ar);
		rdv.setprenom_en(prenom_en);
//		a?.medecin?.nomInterv
		
		intervenant.setNomInterv(NomInterv);
		intervenant.setNomIntervAr(NomIntervAr);
		compte_rendu.setMedecin(intervenant);
		compte_rendu.setRdv(rdv);
		//{{a.rdv.demande_examen.admission.tel}} 
	//	a.rdv.etat_examen_patient.designation_ar
		
		etat_Examen_Patient.setDesignation_ar(Designation_ar);
		rdv.setEtat_examen_patient(etat_Examen_Patient);
		//
		admission.settel(tel);
		demande_Examen.setAdmission(admission);
		rdv.setDemande_examen(demande_Examen);
		compte_rendu.setcode_patient(code_patient);
	//	compte_rendu.setnum_compte_rendu((long) 555);

		ExampleMatcher matcher = ExampleMatcher.matchingAny().withStringMatcher(StringMatcher.CONTAINING );
		Example<Compte_Rendu> exp = Example.of(compte_rendu, matcher);

		List<Compte_Rendu> result = compte_renduRepository.findAll(exp);

		return Compte_RenduFactory.compte_rendusToCompte_RenduDTOs(result);
	}

//	@Transactional(readOnly = true)
//	public Collection<Compte_RenduDTO> findByExample(Example<Compte_Rendu> exple) {
//		List<Compte_Rendu> result = compte_renduRepository.findAll(exple);
//		return Compte_RenduFactory.compte_rendusToCompte_RenduDTOs(result);
//	}

	public Compte_RenduDTO add(Compte_RenduDTO compte_renduDTO) {
		Compte_Rendu compte_rendu = Compte_RenduFactory.compte_renduDTOTOCompte_rendu(compte_renduDTO);
		compte_rendu = compte_renduRepository.save(compte_rendu);
		return Compte_RenduFactory.compte_renduTOCompte_RenduDTO(compte_rendu);
	}

	public Compte_Rendu update(Compte_Rendu compte_rendu) {

		return compte_renduRepository.save(compte_rendu);

	}

	public void deleteCompte_Rendu(Long id) {
		compte_renduRepository.delete(id);

	}

	 @Transactional(readOnly = true)
	 public Collection<Compte_RenduDTO> findAll() {
	 List<Compte_Rendu> result = compte_renduRepository.findAll();
	 return Compte_RenduFactory.compte_rendusToCompte_RenduDTOs(result);
	 }
	
	@Transactional(readOnly = true)
	public List<Compte_RenduDTO> findByPeriode1(String d1, String d2, String code) throws ParseException {

		// convert String to LocalDate
		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d1, formatter);

		return compte_renduService.findAll().stream().filter(c2 -> {
			return (c2.getRdv().getDemande_examen().getDate_Create().isAfter(date1))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date1))
							&& (c2.getRdv().getDemande_examen().getDate_Create().isBefore(date2))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date2))
							&& (c2.getRdv().getDemande_examen().getAdmission().getcode().equals(code));
		}).collect(Collectors.toList());
	}

}
