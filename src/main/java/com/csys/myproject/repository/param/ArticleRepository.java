/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.repository.param;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.csys.myproject.domain.param.Article;

/**
 *
 * @author Fayrouz
 */
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    
    Article findByDesignation(String des);
}
