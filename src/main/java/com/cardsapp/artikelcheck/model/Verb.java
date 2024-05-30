package com.cardsapp.artikelcheck.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="verbs")
@Data
public class Verb extends Word {
    private String partizipZwei;
    private Hilfsverb hilfsverb;
}
