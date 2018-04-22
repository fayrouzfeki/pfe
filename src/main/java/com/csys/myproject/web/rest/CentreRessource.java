/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.csys.myproject.domain.param.Compte_Rendu;
import com.csys.myproject.dto.CentreDTO;
import com.csys.myproject.service.CentreService;
import com.csys.myproject.util.RestPreconditions;


/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/Centre"})
public class CentreRessource {

    @Autowired
    CentreService centreService;
    private static final String ENTITYNAME = "param.Centre";
   
    @GetMapping("/centres")
    public Collection<CentreDTO> findAll() {
        return centreService.findAll();
    }
    @GetMapping("/{id}")
    public CentreDTO findOne(@PathVariable Integer id) {
        CentreDTO centre=centreService.findOne(id);
        RestPreconditions.checkFound(centre,ENTITYNAME+" not found");
        return centre;
    }

    @PostMapping
    public ResponseEntity<CentreDTO> addCentre(@Valid @RequestBody CentreDTO centre,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(centre.getCode()!=null){
           bindingResults.addError(new FieldError(ENTITYNAME, "Code", "Post does not allow an centre with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        CentreDTO result = centreService.add(centre);
        return ResponseEntity.created(new URI("/api/centres/" + result.getCode())).body(result);
    }

    @PutMapping
    public ResponseEntity<CentreDTO> updateCentre(@Valid @RequestBody CentreDTO centreDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(centreDTO.getCode()==null){
           bindingResults.addError(new FieldError(ENTITYNAME, "code", "Put does not allow an centre without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        CentreDTO result = centreService.add(centreDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/centre/{id}")
    public ResponseEntity<Void> deleteCentre(@PathVariable Integer id) {
        centreService.deleteCentre(id);
        return ResponseEntity.ok().build();

    }
}
