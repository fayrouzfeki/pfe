/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.csys.myproject.domain.param.Compte_Rendu;
import com.csys.myproject.domain.param.Rdv;
import com.csys.myproject.dto.Compte_RenduDTO;
import com.csys.myproject.dto.Demande_ExamenDTO;
import com.csys.myproject.service.Compte_RenduService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping({ "/Compte_Rendu/" })
public class Compte_RenduRessource {
	SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	Compte_RenduService compte_renduService;
	private static final String ENTITY_NAME = "compte_rendu";
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	@GetMapping("/compte_rendus")
	public Collection<Compte_RenduDTO> findAll(
			@RequestParam(name = "nom-compte-rendu", required = false) Long numCompteRdv,
			@RequestParam(name = "designation", required = false) String designation,
			@RequestParam(name = "terminer", required = false) Integer terminer
			,@RequestParam(name = "code_admission", required = false) String code_admission
			) {
		Compte_Rendu compte_rendu = new Compte_Rendu();
		Rdv rdv=new Rdv();
		
		compte_rendu.setnum_compte_rendu(numCompteRdv);
		compte_rendu.setDesignation(designation);
		compte_rendu.settermine(terminer);
		
		return compte_renduService.findAll();
	}
	 
	@RequestMapping(value = "/findByExample", method = RequestMethod.GET)
	public Collection<Compte_RenduDTO> findByExample(
			@RequestParam(name = "code", required = false)
			 String code
			  ) {
		
		return compte_renduService.findByExample(code);
	}

	@GetMapping("/{id}")
	public Compte_RenduDTO findOne(@PathVariable Long id) {
		Compte_RenduDTO compte_rendu = compte_renduService.findOne(id);
		RestPreconditions.checkFound(compte_rendu, ENTITY_NAME + " not found");
		return compte_rendu;
	}
	// recherche par code centre
	@RequestMapping(value = "/findByCode_Centre/{code_centre}", method = RequestMethod.GET)
	// @GetMapping("/compte/{designation}")
	public List<Compte_RenduDTO> findByCode_Centre(@PathVariable Integer code_centre) {

		return compte_renduService.findAll().stream()
				.filter(c -> c.getRdv().getCode_centre().getCode() == (code_centre)).collect(Collectors.toList());
	}

	// recherche par designation centre
	@RequestMapping(value = "/findByinterv/{interv}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByinterv(@PathVariable String interv) {
		return compte_renduService.findAll().stream().filter(c -> c.getRdv().getDemande_examen().getAdmission()
				.getMedecin_traitant().getNomIntervAr().equals(interv)).collect(Collectors.toList());
	}

	@RequestMapping(value = "/findByCodeAdmission/{code}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByCodeAdmission(@PathVariable String code,
			@RequestParam(name = "d1", required = false) String d1,
			@RequestParam(name = "d2", required = false) String d2,
			@RequestParam(name = "interv", required = false) String interv) {

		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d2, formatter);
		return compte_renduService.findAll().stream().filter(c2 -> {
			return ((c2.getRdv().getDemande_examen().getDate_Create().isAfter(date1))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date1))
							&& ((c2.getRdv().getDemande_examen().getDate_Create().isBefore(date2))

									|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date2))))

					&& ((StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
							&& c2.getRdv().getcode_admission().equalsIgnoreCase(code))
					&& (StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
					&& (c2.getRdv().getcode_admission().equalsIgnoreCase(code) && c2.getRdv().getDemande_examen()
							.getAdmission().getMedecin_traitant().getNomIntervAr().equals(interv))

			;
		}).collect(Collectors.toList());

	}

	// dure+code admission
	@RequestMapping(value = "/findByCodeAdmission1/{code}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByCodeAdmission1(@PathVariable String code,
			@RequestParam(name = "dure", required = false) Integer dure,
			@RequestParam(name = "interv", required = false) String interv) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, (-dure));
		Date input = calendar.getTime();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		return compte_renduService.findAll().stream().filter(c2 -> {

			return( ((c2.getRdv().getDemande_examen().getDate_Create().isAfter(date))

					||( c2.getRdv().getDemande_examen().getDate_Create().equals(date)))
					&& ((StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
					&&( c2.getRdv().getcode_admission().equalsIgnoreCase(code))
					&& (StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
					&&( c2.getRdv().getcode_admission().equalsIgnoreCase(code)) ))
					||
					//2 eme condition
				(	((c2.getRdv().getDemande_examen().getDate_Create().isAfter(date))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date)))
					&&( (StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
				    &&( c2.getRdv().getcode_admission().equalsIgnoreCase(code)	)				
					&& (StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
					&& (c2.getRdv().getcode_admission().equalsIgnoreCase(code) )
					&& (c2.getRdv().getDemande_examen()
					.getAdmission().getMedecin_traitant().getNomIntervAr().equals(interv))));
		}).collect(Collectors.toList());
	}

	// recherche par code+date1+d2+nomintervenat arabe
	@RequestMapping(value = "/findByCodeAdmissioninterv/{code}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByCodeAdmissioninterv(@PathVariable String code,
			@RequestParam(name = "interv", required = false) String interv) {
		return compte_renduService.findAll().stream().filter(c2 -> {

			return ((StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
					&& c2.getRdv().getcode_admission().equalsIgnoreCase(code) && c2.getRdv().getDemande_examen()
							.getAdmission().getMedecin_traitant().getNomIntervAr().equals(interv));
		}).collect(Collectors.toList());
	}

	// PAR DURE+ recherche par code+nomintervenat arabe
	@RequestMapping(value = "/findByCodeAdmissioninter1/{code}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByCodeAdmissioninter1(@PathVariable String code,
			@RequestParam(name = "dure", required = false) Integer dure,
			@RequestParam(name = "interv", required = false) String interv) {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, (-dure));
		Date input = calendar.getTime();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		return compte_renduService.findAll().stream().filter(c2 -> {

			return ((c2.getRdv().getDemande_examen().getDate_Create().isAfter(date))

					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date)))
					&& ((StringUtils.isEmpty(c2.getRdv().getcode_admission()) == false)
							&& c2.getRdv().getcode_admission().equalsIgnoreCase(code))
					&&

					(c2.getRdv().getDemande_examen().getAdmission().getMedecin_traitant().getNomIntervAr()
							.equals(interv))

			;
		}).collect(Collectors.toList());
	}

	@RequestMapping(value = "/findByDure/{dure}", method = RequestMethod.GET)
	public List<Compte_RenduDTO> findByDure(@PathVariable int dure) throws ParseException {

		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, (-dure));
		Date input = calendar.getTime();
		LocalDate date = input.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		return compte_renduService.findAll().stream().filter(c2 -> {
			return (c2.getRdv().getDemande_examen().getDate_Create().isAfter(date))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date));
		}).collect(Collectors.toList());
	}

	// @RequestMapping(value = "/findByCodeAdmission1/{code1}", method =
	// RequestMethod.GET)
	//
	// public List<Compte_RenduDTO> findByCodeAdmission1(@PathVariable String code1)
	// {
	// return compte_renduService.findAll().stream().filter(c
	// ->((StringUtils.isEmpty( c.getRdv().getcode_admission())==true) &&
	// c.getRdv().getcode_admission().equalsIgnoreCase(code1)))
	// .collect(Collectors.toList());
	// }

	/// PAR PERIODE ENTRE DEUX DATE
	@RequestMapping(value = "/findByTS", method = RequestMethod.GET)
	// @GetMapping("/compte100")
	public List<Compte_RenduDTO> findByTS(@RequestParam(name = "d1", required = false) String d1,
			@RequestParam(name = "d2", required = false) String d2,
			@RequestParam(name = "code", required = false) String code) throws ParseException {
		// convert String to LocalDate
		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d1, formatter);
		return compte_renduService.findAll().stream().filter(c2 -> {
			return ((c2.getRdv().getDemande_examen().getDate_Create().isAfter(date1))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date1))
							&& (c2.getRdv().getDemande_examen().getDate_Create().isBefore(date2))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date2)))
					&& (c2.getRdv().getDemande_examen().getAdmission().getcode().equals(code));
		}).collect(Collectors.toList());
	}

	// recherche par code patient
	@RequestMapping(value = "/findByCode_patient/{code_patient}", method = RequestMethod.GET)
	// @GetMapping("/compte1/{code_patient}")
	public List<Compte_RenduDTO> findByCode_patient(@PathVariable String code_patient) {
		return compte_renduService.findAll().stream().filter(c2 -> c2.getRdv().getcode_patient().equals(code_patient))
				.collect(Collectors.toList());
	}

	// recherche par nom patient+dure
	@RequestMapping(value = "/findByNomPatient/{nom_patient}", method = RequestMethod.GET)
	// @GetMapping("/compte3/{nom_patient}")
	public List<Compte_RenduDTO> findByNomPatient(@PathVariable String nom_patient) {
		return compte_renduService.findAll().stream()
				.filter(c2 -> c2.getRdv().getnom_ar_brut().equals(nom_patient)
						|| c2.getRdv().getnom_complet_en().equals(nom_patient)
						|| c2.getRdv().getnom_complet_ar().equals(nom_patient))
				.collect(Collectors.toList());

	}

	// recherche par date naissance
	// @GetMapping("/compte4/{date}")
	// @GetMapping (params="date")
	@RequestMapping(value = "/findByDateNaissance/{date}", method = RequestMethod.GET)

	public List<Compte_RenduDTO> findByDateNaissance(@PathVariable String date) throws ParseException {
		// LocalDate date1 = LocalDate.parse(date);2013-12-31 01:00:00.000
		// Format formatter = new SimpleDateFormat ("yyyy-MM-dd");

		return compte_renduService.findAll().stream()
				.filter(c2 -> (formatter.format(c2.getRdv().getDateNaissance())).equals(date))
				.collect(Collectors.toList());

	}

	// recherche par periode 30 jour

	// @GetMapping("/compte5/{var}")
	// public List<Compte_RenduDTO> findByDate_entre(@PathVariable String
	// date_entre) throws ParseException {
	// Date date2 = formatter.parse(date_entre);
	// return compte_renduService.findAll().stream()
	//
	// .filter(c2->{
	// return
	// c2.getRdv().getDemande_examen().getDate_Create().equals(date2-(c2.getRdv().getDemande_examen().getDate_Create()));
	// })
	// .collect(Collectors.toList());
	//
	//

	//// PAR PERIODE ENTRE DEUX DATE
	@RequestMapping(value = "/findByPeriode/{d1}/{d2}", method = RequestMethod.GET)
	// @GetMapping("/compte7/{d1}/{d2}")
	public List<Compte_RenduDTO> findByPeriode(@PathVariable String d1, @PathVariable String d2) throws ParseException {

		// convert String to LocalDate
		LocalDate date1 = LocalDate.parse(d1, formatter);
		LocalDate date2 = LocalDate.parse(d1, formatter);

		return compte_renduService.findAll().stream().filter(c2 -> {
			return (c2.getRdv().getDemande_examen().getDate_Create().isAfter(date1))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date1))
							&& (c2.getRdv().getDemande_examen().getDate_Create().isBefore(date2))
					|| (c2.getRdv().getDemande_examen().getDate_Create().equals(date2));
		}).collect(Collectors.toList());
	}
	// Age calcul

	@RequestMapping(value = "/findByagee/{date_naissance}", method = RequestMethod.GET)
	// @GetMapping("/compte5/{date_naissance}")
	Long findByagee(@PathVariable String date_naissance) throws ParseException {
		Date date2 = new Date();
		Date date_naissance2 = formatter2.parse(date_naissance);
		return (long) (date2.getYear() - date_naissance2.getYear());

		// return (long) date_naissance2.getYear();

	}

	// recherche par ecrit compte_rendu
	@RequestMapping(value = "/findByEtat_Ecrit/{ecrit}/{terminer}", method = RequestMethod.GET)
	// @GetMapping("/compte14/{ecrit}/{terminer}")
	public List<Compte_RenduDTO> findByEtat_Ecrit(@PathVariable Integer ecrit, @PathVariable Integer terminer) {
		return compte_renduService.findAll().stream()
				.filter(c2 -> (c2.getecrit() == (ecrit)) && (c2.gettermine() == (terminer)))
				.collect(Collectors.toList());
	}

	// recherche par terminer compte_rendu
	@RequestMapping(value = "/findByEtat_Terminer/{terminer}", method = RequestMethod.GET)
	// @GetMapping("/compte8/{terminer}")
	public List<Compte_RenduDTO> findByEtat_Terminer(@PathVariable Integer terminer) {
		return compte_renduService.findAll().stream().filter(c2 -> c2.gettermine() == (terminer))
				.collect(Collectors.toList());
	}

	// recherche par valider compte_rendu
	@RequestMapping(value = "/findByEtat_Valider/{valider}", method = RequestMethod.GET)
	// @GetMapping("/compte9/{valider}")
	public List<Compte_RenduDTO> findByEtat_Valider(@PathVariable Integer valider) {
		return compte_renduService.findAll().stream().filter(c2 -> c2.getvalider() == (valider))
				.collect(Collectors.toList());
	}

	// recherche par imprimer compte_rendu
	@RequestMapping(value = "/findByEtat_Imprimer/{imprimer}", method = RequestMethod.GET)
	// @GetMapping("/compte10/{imprimer}")
	public List<Compte_RenduDTO> findByEtat_Imprimer(@PathVariable Integer imprimer) {
		return compte_renduService.findAll().stream().filter(c2 -> c2.getimprimer() == (imprimer))
				.collect(Collectors.toList());
	}

	// recherche par planifier compte_rendu
	@RequestMapping(value = "/findByEtat_Planifier/{planifier}", method = RequestMethod.GET)
	// @GetMapping("/compte11/{planifier}")
	public List<Compte_RenduDTO> findByEtat_Planifier(@PathVariable Integer planifier) {
		return compte_renduService.findAll().stream()
				.filter(c2 -> c2.getRdv().getDemande_examen().getplanifier() == (planifier))
				.collect(Collectors.toList());
	}

	// recherche par pret compte_rendu
	@RequestMapping(value = "/findByEtat_Pret/{pret}", method = RequestMethod.GET)
	// @GetMapping("/compte12/{pret}")
	public List<Compte_RenduDTO> findByEtat_Pret(@PathVariable Integer pret) {
		return compte_renduService.findAll().stream().filter(c2 -> c2.getRdv().getDemande_examen().getPret() == (pret))
				.collect(Collectors.toList());
	}

	// recherche par realiser compte_rendu
	@RequestMapping(value = "/findByEtat_Realiser/{realiser}", method = RequestMethod.GET)
	// @GetMapping("/compte13/{realiser}")
	public List<Compte_RenduDTO> findByEtat_Realiser(@PathVariable Integer realiser) {
		return compte_renduService.findAll().stream()
				.filter(c2 -> c2.getRdv().getDemande_examen().getRealiser() == (realiser)).collect(Collectors.toList());
	}

	// recherche wousoul marith
	@RequestMapping(value = "/findByEtat_arrive_patient", method = RequestMethod.GET)
	// @GetMapping("/compte15")
	public List<Compte_RenduDTO> findByEtat_arrive_patient() {
		return compte_renduService
				.findAll().stream().filter(c2 -> c2.getRdv().getarrivee_centre() != null
						&& c2.getRdv().getEntree_Salle() == null && c2.getRdv().getSortie_Salle() == null)
				.collect(Collectors.toList());
	}

	// recherche tawr injaz
	@RequestMapping(value = "/findByEtat_Patient_Encour", method = RequestMethod.GET)
	// @GetMapping("/compte16")
	public List<Compte_RenduDTO> findByEtat_Patient_Encour() {
		return compte_renduService
				.findAll().stream().filter(c2 -> c2.getRdv().getarrivee_centre() != null
						&& c2.getRdv().getEntree_Salle() != null && c2.getRdv().getSortie_Salle() == null)
				.collect(Collectors.toList());
	}

	// recherche nihayat kachf
	@RequestMapping(value = "/findByEtat_Patient_terminer", method = RequestMethod.GET)
	// @GetMapping("/compte17")
	public List<Compte_RenduDTO> findByEtat_Patient_terminer() {
		return compte_renduService
				.findAll().stream().filter(c2 -> c2.getRdv().getarrivee_centre() != null
						&& c2.getRdv().getEntree_Salle() != null && c2.getRdv().getSortie_Salle() != null)
				.collect(Collectors.toList());
	}

	// recherche par marith fil intithar
	@RequestMapping(value = "/findByEtat_Patient_Enattent", method = RequestMethod.GET)
	// @GetMapping("/compte18")
	public List<Compte_RenduDTO> findByEtat_Patient_Enattent() {
		return compte_renduService
				.findAll().stream().filter(c2 -> c2.getRdv().getarrivee_centre() == null
						&& c2.getRdv().getEntree_Salle() == null && c2.getRdv().getSortie_Salle() == null)
				.collect(Collectors.toList());
	}

	// a.rdv.demande_examen.admission.medecin_traitant.nomIntervAr}

	// modet intidhar calcul
	SimpleDateFormat formatter3 = new SimpleDateFormat("yyyy-MM-dd HH:MM:SS.sss");

	@RequestMapping(value = "/findBydureattente/{arrivee_centre}", method = RequestMethod.GET)
	// @GetMapping("/compte19/{arrivee_centre}")
	String findBydureattente(@PathVariable String arrivee_centre) throws ParseException {

		Date date5 = new Date();
		Date arrivee_centre2 = formatter2.parse(arrivee_centre);

		Long intervalle = date5.getTime() - arrivee_centre2.getTime();

		Long Hours = TimeUnit.HOURS.convert(intervalle, TimeUnit.MILLISECONDS);
		Long Minutes = TimeUnit.MINUTES.convert(intervalle, TimeUnit.MILLISECONDS);
		return Hours + ":" + Minutes;

	}

	@PostMapping
	public ResponseEntity<Compte_RenduDTO> addCompte_Rendu(@Valid @RequestBody Compte_RenduDTO compte_rendu,
			BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
		if (bindingResults.hasErrors()) {
			throw new MethodArgumentNotValidException(null, bindingResults);
		}
		if (compte_rendu.getnum_compte_rendu() != null) {
			bindingResults
					.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an compte_rendu with a code"));
			throw new MethodArgumentNotValidException(null, bindingResults);
		}
		Compte_RenduDTO result = compte_renduService.add(compte_rendu);
		return ResponseEntity.created(new URI("/api/compte_rendus/" + result.getnum_compte_rendu())).body(result);
	}

	@PutMapping
	public ResponseEntity<Compte_RenduDTO> updateCompte_Rendu(@Valid @RequestBody Compte_RenduDTO compte_renduDTO,
			BindingResult bindingResults) throws MethodArgumentNotValidException {
		if (bindingResults.hasErrors()) {
			throw new MethodArgumentNotValidException(null, bindingResults);
		}
		if (compte_renduDTO.getnum_compte_rendu() == null) {
			bindingResults
					.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an compte_rendu without a code"));
			throw new MethodArgumentNotValidException(null, bindingResults);
		}
		Compte_RenduDTO result = compte_renduService.add(compte_renduDTO);
		return ResponseEntity.ok(result);
	}

	@DeleteMapping("/compte_rendu/{id}")
	public ResponseEntity<Void> deleteCompte_Rendu(@PathVariable Long id) {
		compte_renduService.deleteCompte_Rendu(id);
		return ResponseEntity.ok().build();

	}

}
