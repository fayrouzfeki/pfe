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

import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.service.ArticleService;
import com.csys.myproject.util.RestPreconditions;

/**
 *
 * @author Fayrouz
 */
@CrossOrigin("*")
@RestController
@RequestMapping({"/api/article"})
public class ArticleRessource {

    @Autowired
    ArticleService articleService;
    private static final String ENTITY_NAME = "Article";

    @GetMapping("/articles")
    public Collection<ArticleDTO> findAll() {
        return articleService.findAll();
    }
    @GetMapping("/{id}")
    public ArticleDTO findOne(@PathVariable Integer id) {
        ArticleDTO article=articleService.findOne(id);
        RestPreconditions.checkFound(article,ENTITY_NAME+" not found");
        return article;
    }

    @PostMapping
    public ResponseEntity<ArticleDTO> addArticle(@Valid @RequestBody ArticleDTO article,BindingResult bindingResults) throws URISyntaxException, MethodArgumentNotValidException {
         if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
        if(article.getCode()!=null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Post does not allow an article with a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        ArticleDTO result = articleService.add(article);
        return ResponseEntity.created(new URI("/api/articles/" + result.getCode())).body(result);
    }

    @PutMapping
    public ResponseEntity<ArticleDTO> updateArticle(@Valid @RequestBody ArticleDTO articleDTO,BindingResult bindingResults) throws MethodArgumentNotValidException {
        if (bindingResults.hasErrors()) {
            throw new MethodArgumentNotValidException(null, bindingResults);
        }
         if(articleDTO.getCode()==null){
           bindingResults.addError(new FieldError(ENTITY_NAME, "code", "Put does not allow an article without a code"));
           throw new MethodArgumentNotValidException(null,bindingResults);
        }
        ArticleDTO result = articleService.add(articleDTO);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/article/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable Integer id) {
        articleService.deleteArticle(id);
        return ResponseEntity.ok().build();

    }
}
