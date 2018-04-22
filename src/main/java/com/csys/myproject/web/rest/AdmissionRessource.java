/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import org.springframework.web.bind.annotation.RestController;

import com.csys.myproject.dto.AdmissionDTO;
import com.csys.myproject.service.AdmissionService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/admission"})
public class AdmissionRessource {

    @Autowired
    AdmissionService admissionService;
    private static final String ENTITY_NAME = "Recept.admission";

    @GetMapping("/admissions")
    public Collection<AdmissionDTO> findAll() {
        return admissionService.findAll();
    }
    @GetMapping("/{id}")
    public AdmissionDTO findOne(@PathVariable String id) {
        AdmissionDTO admission=admissionService.findOne(id);
        RestPreconditions.checkFound(admission,ENTITY_NAME+" not found");
        return admission;
    }

    @PostMapping
    public ResponseEntity<AdmissionDTO> addAdmission(@Valid @RequestBody AdmissionDTO admission,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(admission.getcode()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an admission with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        AdmissionDTO result = admissionService.add(admission);
        return ResponseEntity.created(new URI("/api/admissions/" + result.getcode())).body(result);
    }

    @PutMapping
    public ResponseEntity<AdmissionDTO> updateAdmission(@Valid @RequestBody AdmissionDTO admissionDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(admissionDTO.getcode()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an admission without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        AdmissionDTO result = admissionService.add(admissionDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/admission/{id}")
    public ResponseEntity<Void> deleteAdmission(@PathVariable String id) {
        admissionService.deleteAdmission(id);
        return ResponseEntity.ok().build();

    }
}
