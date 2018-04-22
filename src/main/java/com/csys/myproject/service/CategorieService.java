///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.csys.myproject.service;
//
//import com.csys.myproject.domain.Article;
//import com.csys.myproject.domain.Categorie;
//import com.csys.myproject.dto.CategorieDTO;
//import com.csys.myproject.factory.CategorieFactory;
//import com.csys.myproject.repository.CategorieRepository;
//import com.google.common.base.Preconditions;
//import java.math.BigDecimal;
//import java.util.Collection;
//import java.util.Optional;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
///**
// *
// * @author Fayrouz
// */
//@Service
//@Transactional
//public class CategorieService {
//
//    private final Logger log = LoggerFactory.getLogger(CategorieService.class);
//    private final CategorieRepository categorieRepository;
//
//    public CategorieService(CategorieRepository categorieRepository) {
//        this.categorieRepository = categorieRepository;
//    }
//
//    @Value("${delete-categorie-without-check}")
//    private boolean deleteCategorieWithoutCheck;
//
//    @Transactional(readOnly = true)
//    public CategorieDTO findOne(Long id) {
//        Categorie categorie = categorieRepository.findOne(id);
//        return CategorieFactory.categorieTOCategorieDTO(categorie);
//    }
//
//    @Transactional(readOnly = true)
//    public Collection<CategorieDTO> findAll() {
//        Collection<Categorie> result = categorieRepository.findAll();
//        return CategorieFactory.categoriesToCategorieDTOs(result);
//    }
//
//    public CategorieDTO add(CategorieDTO categorieDTO) {
//        Categorie categorie = CategorieFactory.categorieDTOTOCategorie(categorieDTO);
//        categorie = categorieRepository.save(categorie);
//        return CategorieFactory.categorieTOCategorieDTO(categorie);
//    }
//
//    public CategorieDTO update(CategorieDTO categorieDTO) {
//        Categorie categorieInBase = categorieRepository.findOne(categorieDTO.getCode());
//        Preconditions.checkArgument(categorieInBase != null, "Categore has been deleted");
//        Categorie categorie = categorieRepository.save(CategorieFactory.categorieDTOTOCategorie(categorieDTO));
//        return CategorieFactory.categorieTOCategorieDTO(categorie);
//    }
//
//    public BigDecimal calculateAvgPrice(Long id) { 
//        Categorie categorieInBase = categorieRepository.findOne(id);
//        Preconditions.checkArgument(categorieInBase != null, "Categore has been deleted");
//        log.info(categorieInBase.getnom_Categorie());
//        BigDecimal sum = BigDecimal.ZERO;
//        for (Article article : categorieInBase.getArticles()) {
//            log.info(article.getprix_Achat().toString());
//            sum = article.getprix_Achat().add(sum);
//        }
//        return sum.divide(BigDecimal.valueOf(categorieInBase.getArticles().size()));
//      
//    }
//
//    public void deleteCategorie(Long id) {
//        Categorie categorieInBase = categorieRepository.findOne(id);
//        if (categorieInBase != null && categorieInBase.getArticles() != null && !deleteCategorieWithoutCheck) {
//            Optional<Article> badArticle = categorieInBase.getArticles().stream().filter(dto -> dto.getprix_Achat().compareTo(BigDecimal.ZERO) != 0).findFirst();
//            Preconditions.checkArgument(!badArticle.isPresent(), "We can't delete a categorie that have articles with price greater than 0");
//        }
//
//        categorieRepository.delete(id);
//
//    }
//
//}
