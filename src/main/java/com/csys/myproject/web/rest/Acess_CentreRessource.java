///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.csys.myproject.web.rest;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.Collection;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.csys.myproject.dto.Acess_CentreDTO;
//import com.csys.myproject.service.Acess_CentreService;
//import com.csys.myproject.util.RestPreconditions;
//
///**
// *
// * @author Fayrouz
// */
//@CrossOrigin("*")
//@RestController
//@RequestMapping({ "/api/acess_Centre" })
//public class Acess_CentreRessource {
//
//	@Autowired
//	Acess_CentreService acess_CentreService;
//	private static final String ENTITY_NAME = "Acess_Centre";
//
//	@GetMapping("/acess_Centres")
//	public Collection<Acess_CentreDTO> findAll() {
//		return acess_CentreService.findAll();
//	}
//
//	@GetMapping("/{id}")
//	public Acess_CentreDTO findOne(@PathVariable String id) {
//		Acess_CentreDTO acess_Centre = acess_CentreService.findOne(id);
//		RestPreconditions.checkFound(acess_Centre, ENTITY_NAME + " not found");
//		return acess_Centre;
//	}
//
//	@PostMapping
//	public ResponseEntity<Acess_CentreDTO> addAcess_Centre(@Valid @RequestBody Acess_CentreDTO acess_Centre,
//			BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
//		if (bindingResults.hasErrors()) {
//			throw new MethodArgumentNotValidException(null, bindingResults);
//		}
//		if (acess_Centre.get_User_Centre() != null) {
//			bindingResults
//					.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an acess_Centre with a code"));
//			throw new MethodArgumentNotValidException(null, bindingResults);
//		}
//		Acess_CentreDTO result = acess_CentreService.add(acess_Centre);
//		return ResponseEntity.created(new URI("/api/acess_Centres/" + result.get_User_Centre())).body(result);
//	}
//
//	@PutMapping
//	public ResponseEntity<Acess_CentreDTO> updateAcess_Centre(@Valid @RequestBody Acess_CentreDTO acess_CentreDTO,
//			BindingResult bindingResults) throws MethodArgumentNotValidException {
//		if (bindingResults.hasErrors()) {
//			throw new MethodArgumentNotValidException(null, bindingResults);
//		}
//		if (acess_CentreDTO.get_User_Centre() == null) {
//			bindingResults
//					.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an acess_Centre without a code"));
//			throw new MethodArgumentNotValidException(null, bindingResults);
//		}
//		Acess_CentreDTO result = acess_CentreService.add(acess_CentreDTO);
//		return ResponseEntity.ok(result);
//	}
//
//	@DeleteMapping("/acess_Centre/{id}")
//	public ResponseEntity<Void> deleteAcess_Centre(@PathVariable String id) {
//		acess_CentreService.deleteAcess_Centre(id);
//		return ResponseEntity.ok().build();
//
//	}
//}
