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

import com.csys.myproject.dto.Demande_ExamenDTO;
import com.csys.myproject.service.Demande_ExamenService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/Recept.demande_examen"})
public class Demande_ExamenRessource {

    @Autowired
    Demande_ExamenService demande_examenService;
    private static final String ENTITY_NAME = "demande_examen";

    @GetMapping("/demande_examens")
    public Collection<Demande_ExamenDTO> findAll() {
        return demande_examenService.findAll();
    }
    @GetMapping("/{id}")
    public Demande_ExamenDTO findOne(@PathVariable Integer id) {
        Demande_ExamenDTO demande_examen=demande_examenService.findOne(id);
        RestPreconditions.checkFound(demande_examen,ENTITY_NAME+" not found");
        return demande_examen;
    }
    
 


    @PostMapping
    public ResponseEntity<Demande_ExamenDTO> addDemande_Examen(@Valid @RequestBody Demande_ExamenDTO demande_examen,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(demande_examen.getcode_demande()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an demande_examen with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        Demande_ExamenDTO result = demande_examenService.add(demande_examen);
        return ResponseEntity.created(new URI("/api/demande_examens/" + result.getcode_demande())).body(result);
    }

    @PutMapping
    public ResponseEntity<Demande_ExamenDTO> updateDemande_Examen(@Valid @RequestBody Demande_ExamenDTO demande_examenDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(demande_examenDTO.getcode_demande()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an demande_examen without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        Demande_ExamenDTO result = demande_examenService.add(demande_examenDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/demande_examen/{id}")
    public ResponseEntity<Void> deleteDemande_Examen(@PathVariable Integer id) {
        demande_examenService.deleteDemande_Examen(id);
        return ResponseEntity.ok().build();

    }
}
