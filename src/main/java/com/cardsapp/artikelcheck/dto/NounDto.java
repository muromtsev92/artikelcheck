package com.cardsapp.artikelcheck.dto;

import com.cardsapp.artikelcheck.model.words.NominativeArticle;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
@NoArgsConstructor
public class NounDto extends WordDto{
    private String plural;
    private NominativeArticle article;
}
