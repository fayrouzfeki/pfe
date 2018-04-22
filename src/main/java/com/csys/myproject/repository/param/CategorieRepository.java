/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.repository.param;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.param.Categorie;

/**
 *
 * @author Fayrouz
 */
public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    
   
}
