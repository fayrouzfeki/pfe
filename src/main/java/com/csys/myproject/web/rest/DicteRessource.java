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

import com.csys.myproject.domain.dicte.Dicte;
import com.csys.myproject.dto.DicteDTO;
import com.csys.myproject.service.DicteService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/dictes"})
public class DicteRessource {

    @Autowired
    DicteService dicteService;
    private static final String ENTITY_NAME = "Recept.dicte";

    @GetMapping("/dictes")
    public Collection<DicteDTO> findAll() {
        return dicteService.findAll();
    }
    @GetMapping("/{id}")
    public DicteDTO findOne(@PathVariable Long id) {
        DicteDTO dicte=dicteService.findOne(id);
        RestPreconditions.checkFound(dicte,ENTITY_NAME+" not found");
        return dicte;
    }

    @PostMapping("/dicte1")
    public ResponseEntity<DicteDTO> addDicte(@Valid @RequestBody DicteDTO dicte,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(dicte.getNum()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "Num", "Post does not allow an dicte with a Num"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        DicteDTO result = dicteService.add(dicte);
        return ResponseEntity.created(new URI("/api/dicte/" + result.getNum())).body(result);
    }
  
   
    @PutMapping
    public ResponseEntity<DicteDTO> updateDicte(@Valid @RequestBody DicteDTO dicteDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(dicteDTO.getNum()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "Num", "Put does not allow an dicte without a Num"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        DicteDTO result = dicteService.add(dicteDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/dicte/{id}")
    public ResponseEntity<Void> deleteDicte(@PathVariable Long id) {
        dicteService.deleteDicte(id);
        return ResponseEntity.ok().build();

    }
}
