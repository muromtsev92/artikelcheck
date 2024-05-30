package com.cardsapp.artikelcheck.dto;

import com.cardsapp.artikelcheck.model.NominativeArticle;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Data
public class NounDto extends WordDto{
    private String plural;
    private NominativeArticle article;
}
