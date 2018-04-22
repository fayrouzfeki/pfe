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

import com.csys.myproject.dto.ConventionDTO;
import com.csys.myproject.service.ConventionService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/Convention"})
public class ConventionRessource {

    @Autowired
    ConventionService conventionService;
    private static final String ENTITYNAME = "param.Convention";

    @GetMapping("/conventions")
    public Collection<ConventionDTO> findAll() {
        return conventionService.findAll();
    }
    @GetMapping("/{id}")
    public ConventionDTO findOne(@PathVariable Integer id) {
        ConventionDTO convention=conventionService.findOne(id);
        RestPreconditions.checkFound(convention,ENTITYNAME+" not found");
        return convention;
    }

    @PostMapping
    public ResponseEntity<ConventionDTO> addConvention(@Valid @RequestBody ConventionDTO convention,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(convention.getCode()!=null){
           bindingResults.addError(new FieldError(ENTITYNAME, "Code", "Post does not allow an convention with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        ConventionDTO result = conventionService.add(convention);
        return ResponseEntity.created(new URI("/api/conventions/" + result.getCode())).body(result);
    }

    @PutMapping
    public ResponseEntity<ConventionDTO> updateConvention(@Valid @RequestBody ConventionDTO conventionDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(conventionDTO.getCode()==null){
           bindingResults.addError(new FieldError(ENTITYNAME, "code", "Put does not allow an convention without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        ConventionDTO result = conventionService.add(conventionDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/convention/{id}")
    public ResponseEntity<Void> deleteConvention(@PathVariable Integer id) {
        conventionService.deleteConvention(id);
        return ResponseEntity.ok().build();

    }
}
