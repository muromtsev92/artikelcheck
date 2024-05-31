package com.cardsapp.artikelcheck.dto;

import com.cardsapp.artikelcheck.model.NominativeArticle;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class NounDto extends WordDto{
    private String plural;
    private NominativeArticle article;
}
