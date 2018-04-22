/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.dto;

import java.math.BigDecimal;

/**
 *
 * @author Fayrouz
 */
public class ArticleDTO {

    private Integer code;
    private String designation;

    private BigDecimal prix_Achat;
    private String categorie;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public BigDecimal getprix_Achat() {
        return prix_Achat;
    }

    public void setprix_Achat(BigDecimal prix_Achat) {
        this.prix_Achat = prix_Achat;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
}
