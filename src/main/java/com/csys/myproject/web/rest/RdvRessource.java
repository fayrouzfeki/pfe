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

import com.csys.myproject.dto.RdvDTO;
import com.csys.myproject.service.RdvService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/Centre.rdv"})
public class RdvRessource {

    @Autowired
    RdvService rdvService;
    private static final String ENTITY_NAME = "rdv";

    @GetMapping("/rdvs")
    public Collection<RdvDTO> findAll() {
        return rdvService.findAll();
    }
    @GetMapping("/{id}")
    public RdvDTO findOne(@PathVariable Long id) {
        RdvDTO rdv=rdvService.findOne(id);
        RestPreconditions.checkFound(rdv,ENTITY_NAME+" not found");
        return rdv;
    }

    @PostMapping
    public ResponseEntity<RdvDTO> addRdv(@Valid @RequestBody RdvDTO rdv,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(rdv.getnum_Rdv()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an rdv with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        RdvDTO result = rdvService.add(rdv);
        return ResponseEntity.created(new URI("/api/rdvs/" + result.getnum_Rdv())).body(result);
    }

    @PutMapping
    public ResponseEntity<RdvDTO> updateRdv(@Valid @RequestBody RdvDTO rdvDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(rdvDTO.getnum_Rdv()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an rdv without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        RdvDTO result = rdvService.add(rdvDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/rdv/{id}")
    public ResponseEntity<Void> deleteRdv(@PathVariable Long id) {
        rdvService.deleteRdv(id);
        return ResponseEntity.ok().build();

    }
}
