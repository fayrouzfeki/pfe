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
import java.util.stream.Collectors;

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

import com.csys.myproject.dto.IntervenantDTO;
import com.csys.myproject.service.IntervenantService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/intervenants"})
public class IntervenantRessource {

    @Autowired
    IntervenantService intervenantService;
    private static final String ENTITY_NAME = "intervenant";

    @GetMapping("/intervenants")
    public Collection<IntervenantDTO> findAll() {
        return intervenantService.findAll();
    }
    @GetMapping("/{id}")
    public IntervenantDTO findOne(@PathVariable Integer id) {
        IntervenantDTO intervenant=intervenantService.findOne(id);
        RestPreconditions.checkFound(intervenant,ENTITY_NAME+" not found");
        return intervenant;
    }
    
 // recherche par code type intervenat verifer medecin
 	@GetMapping("/intervenant1")
 	public List<IntervenantDTO> findByCode_type() {
 		return intervenantService.findAll().stream()
 				.filter(c2 ->c2.getCodeTypeIntervenant()==120)
 				.collect(Collectors.toList());
 	}

    @PostMapping
    public ResponseEntity<IntervenantDTO> addIntervenant(@Valid @RequestBody IntervenantDTO intervenant,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(intervenant.getCode()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an intervenant with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        IntervenantDTO result = intervenantService.add(intervenant);
        return ResponseEntity.created(new URI("/api/intervenants/" + result.getCode())).body(result);
    }

    @PutMapping
    public ResponseEntity<IntervenantDTO> updateIntervenant(@Valid @RequestBody IntervenantDTO intervenantDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(intervenantDTO.getCode()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an intervenant without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        IntervenantDTO result = intervenantService.add(intervenantDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/intervenant/{id}")
    public ResponseEntity<Void> deleteIntervenant(@PathVariable Integer id) {
        intervenantService.deleteIntervenant(id);
        return ResponseEntity.ok().build();

    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
