///*
// * Copyright 2012-2016 the original author or authors.
// *
// * Licensed under the Apache License, Version 2.0 (the "License");
// * you may not use this file except in compliance with the License.
// * You may obtain a copy of the License at
// *
// *      http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//package com.csys.myproject.Service;
//
//import com.csys.myproject.domain.Article;
//import com.csys.myproject.domain.Categorie;
//import com.csys.myproject.repository.CategorieRepository;
//
//import com.csys.myproject.service.CategorieService;
//
//import com.csys.myproject.web.rest.errors.MyResourceNotFoundException;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Collection;
//
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.ExpectedException;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Matchers.anyLong;
//
///**
// * Tests for {@link UserVehicleService}.
// *
// * @author Phillip Webb
// */
//public class CategorieServiceTest {
//
//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Mock
//    private CategorieRepository categorieRepository;
//
//    private CategorieService service;
//    private Categorie categorie;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//        this.service = new CategorieService(this.categorieRepository);
//        this.categorie = new Categorie();
//        this.categorie.setid_Categorie(1L);
//        this.categorie.setnom_Categorie("Drugs");
//        Collection<Article> articles = new ArrayList<>();
//        Article article = new Article();
//        article.setCode(1);
//        article.setDesignation("designation");
//        article.setprix_Achat(new BigDecimal(20));
//        Article article2 = new Article();
//        article2.setCode(1);
//        article2.setDesignation("designation");
//        article2.setprix_Achat(new BigDecimal(10));
//        articles.add(article);
//        articles.add(article2);
//        this.categorie.setArticles(articles);
//    }
//
//    @Test
//    public void calculeAVGShouldReturnAVG() {
//        given(this.categorieRepository.findOne(anyLong())).willReturn(this.categorie);
//        assertThat(this.service.calculateAvgPrice(1L)).isEqualTo(BigDecimal.valueOf(15));
//
//    }
//
//}
