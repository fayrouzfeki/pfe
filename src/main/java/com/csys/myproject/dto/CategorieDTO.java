/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Collection;
import java.util.List;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Fayrouz
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategorieDTO {

    private Long code;
     @NotNull
    private String designation;

    Collection<ArticleDTO> articles;

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

   

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Collection<ArticleDTO> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleDTO> articles) {
        this.articles = articles;
    }

    

   
}
