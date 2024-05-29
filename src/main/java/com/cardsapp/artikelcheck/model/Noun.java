package com.cardsapp.artikelcheck.model;

import jakarta.persistence.Entity;

@Entity
public class Noun extends Word {
    private String plural;
    private NominativeArticle article;
}
