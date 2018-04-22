/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Article;
import com.csys.myproject.domain.param.Categorie;
import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.dto.CategorieDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class CategorieFactory {

    public static Categorie categorieDTOTOCategorie(CategorieDTO categorieDTO) {
        Categorie categorie = new Categorie();
        categorie.setid_Categorie(categorieDTO.getCode());
        categorie.setnom_Categorie(categorieDTO.getDesignation());
        Collection<Article> articles = new ArrayList<>();
        for (ArticleDTO articleDTO : categorieDTO.getArticles()) {
            Article article = ArticleFactory.articleDTOTOArticle(articleDTO);
            article.setCategorie(categorie);
            articles.add(article);
        }
        categorie.setArticles(articles);
        return categorie;
    }

    public static CategorieDTO categorieTOCategorieDTO(Categorie categorie) {
        if (categorie != null) {
            CategorieDTO categorieDTO = new CategorieDTO();
            categorieDTO.setCode(categorie.getid_Categorie());
            categorieDTO.setDesignation(categorie.getnom_Categorie());
            categorieDTO.setArticles(ArticleFactory.articlesToArticleDTOs(categorie.getArticles()));
            return categorieDTO;
        } else {
            return null;
        }
    }

    public static CategorieDTO lazyCategorieTOCategorieDTO(Categorie categorie) {
        if (categorie != null) {
            CategorieDTO categorieDTO = new CategorieDTO();
            categorieDTO.setCode(categorie.getid_Categorie());
            categorieDTO.setDesignation(categorie.getnom_Categorie());
            return categorieDTO;
        } else {
            return null;
        }
    }

    public static Collection<CategorieDTO> categoriesToCategorieDTOs(Collection<Categorie> categories) {
        List<CategorieDTO> categorieDTOs = new ArrayList<>();
        for (Categorie categorie : categories) {
            CategorieDTO categorieDTO = lazyCategorieTOCategorieDTO(categorie);
            categorieDTOs.add(categorieDTO);
        }
        return categorieDTOs;
    }

}
