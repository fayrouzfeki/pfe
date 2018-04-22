/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.myproject.service;

import com.csys.myproject.domain.param.Article;
import com.csys.myproject.dto.ArticleDTO;
import com.csys.myproject.factory.ArticleFactory;
import com.csys.myproject.repository.param.ArticleRepository;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Fayrouz
 */
@Service
@Transactional
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public ArticleDTO findOne(Integer id) {
        Article article = articleRepository.findOne(id);
        return ArticleFactory.articleTOArticleDTO(article);
    }

    @Transactional(readOnly = true)
    public Collection<ArticleDTO> findAll() {
        List<Article> result=articleRepository.findAll();
        return ArticleFactory.articlesToArticleDTOs(result);
    }

    public ArticleDTO add(ArticleDTO articleDTO) {
      Article article = ArticleFactory.articleDTOTOArticle(articleDTO);
      article=articleRepository.save(article);
        return ArticleFactory.articleTOArticleDTO(article);
    }

    public Article update(Article article) {
        return articleRepository.save(article);

    }

    public void deleteArticle(Integer id) {
        articleRepository.delete(id);

    }

}
