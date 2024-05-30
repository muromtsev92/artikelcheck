package com.cardsapp.artikelcheck.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="nouns")
@Data
public class Noun extends Word {
    private String plural;
    private NominativeArticle article;
}
