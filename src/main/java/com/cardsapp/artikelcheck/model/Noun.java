package com.cardsapp.artikelcheck.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="nouns")
@Data
@RequiredArgsConstructor
@SuperBuilder
public class Noun extends Word {
    private String plural;
    private NominativeArticle article;
}
