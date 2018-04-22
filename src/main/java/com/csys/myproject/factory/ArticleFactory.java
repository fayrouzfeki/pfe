/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.factory;

import com.csys.myproject.domain.param.Article;
import com.csys.myproject.dto.ArticleDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Fayrouz
 */
public class ArticleFactory {

    public static Article articleDTOTOArticle(ArticleDTO articleDTO) {
        Article article = new Article();
        article.setCode(articleDTO.getCode());
        article.setDesignation(articleDTO.getDesignation());
        article.setprix_Achat(articleDTO.getprix_Achat());
        return article;
    }

    public static ArticleDTO articleTOArticleDTO(Article article) {
        if (article != null) {
            ArticleDTO articleDTO = new ArticleDTO();
            articleDTO.setCode(article.getCode());
            articleDTO.setDesignation(article.getDesignation());
            articleDTO.setprix_Achat(article.getprix_Achat());
            articleDTO.setCategorie(article.getCategorie().getnom_Categorie());
            return articleDTO;
        } else {
            return null;
        }
    }

    public static Collection<ArticleDTO> articlesToArticleDTOs(Collection<Article> articles) {
        List<ArticleDTO> articleDTOs = new ArrayList<>();
        for (Article article : articles) {
            ArticleDTO articleDTO = articleTOArticleDTO(article);
            articleDTOs.add(articleDTO);
        }
        return articleDTOs;
    }

}
