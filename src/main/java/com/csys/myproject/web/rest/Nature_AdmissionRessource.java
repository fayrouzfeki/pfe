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

import com.csys.myproject.dto.Nature_AdmissionDTO;
import com.csys.myproject.service.Nature_AdmissionService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/Nature_Admission"})
public class Nature_AdmissionRessource {

    @Autowired
    Nature_AdmissionService nature_admissionService;
    private static final String ENTITYNAME = "param.Nature_Admission";

    @GetMapping("/nature_admissions")
    public Collection<Nature_AdmissionDTO> findAll() {
        return nature_admissionService.findAll();
    }
    @GetMapping("/{id}")
    public Nature_AdmissionDTO findOne(@PathVariable Integer id) {
        Nature_AdmissionDTO nature_admission=nature_admissionService.findOne(id);
        RestPreconditions.checkFound(nature_admission,ENTITYNAME+" not found");
        return nature_admission;
    }

    @PostMapping
    public ResponseEntity<Nature_AdmissionDTO> addNature_Admission(@Valid @RequestBody Nature_AdmissionDTO nature_admission,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(nature_admission.getcode_nature_admission()!=null){
           bindingResults.addError(new FieldError(ENTITYNAME, "Code", "Post does not allow an nature_admission with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        Nature_AdmissionDTO result = nature_admissionService.add(nature_admission);
        return ResponseEntity.created(new URI("/api/nature_admissions/" + result.getcode_nature_admission())).body(result);
    }

    @PutMapping
    public ResponseEntity<Nature_AdmissionDTO> updateNature_Admission(@Valid @RequestBody Nature_AdmissionDTO nature_admissionDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(nature_admissionDTO.getcode_nature_admission()==null){
           bindingResults.addError(new FieldError(ENTITYNAME, "code", "Put does not allow an nature_admission without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        Nature_AdmissionDTO result = nature_admissionService.add(nature_admissionDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/nature_admission/{id}")
    public ResponseEntity<Void> deleteNature_Admission(@PathVariable Integer id) {
        nature_admissionService.deleteNature_Admission(id);
        return ResponseEntity.ok().build();

    }
}
