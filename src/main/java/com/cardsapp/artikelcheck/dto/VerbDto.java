package com.cardsapp.artikelcheck.dto;

import com.cardsapp.artikelcheck.model.Hilfsverb;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class VerbDto extends WordDto{
    private String partizipZwei;
    private Hilfsverb hilfsverb;
}
