package com.csys.myproject.domain.param;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Categorie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Categorie;
    @NotNull
    private String nom_Categorie;

    @JsonManagedReference
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "categorie",orphanRemoval = true)
    private Collection<Article> articles;

    public Long getid_Categorie() {
        return id_Categorie;
    }

    public void setid_Categorie(Long id_Categorie) {
        this.id_Categorie = id_Categorie;
    }

    public String getnom_Categorie() {
        return nom_Categorie;
    }

    public void setnom_Categorie(String nom_Categorie) {
        this.nom_Categorie = nom_Categorie;
    }

    public Collection<Article> getArticles() {
        return articles;
    }

    public void setArticles(Collection<Article> produits) {
        this.articles = produits;
    }

    public Categorie(String nom_Categorie, Collection<Article> produits) {
        super();
        this.nom_Categorie = nom_Categorie;
        this.articles = produits;
    }

    public Categorie(Long id_Categorie) {
        super();
        this.id_Categorie = id_Categorie;
    }

    public Categorie() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Categorie(String nom_Categorie) {
        super();
        this.nom_Categorie = nom_Categorie;
    }

}
