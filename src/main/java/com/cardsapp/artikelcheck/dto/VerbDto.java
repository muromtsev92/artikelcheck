package com.cardsapp.artikelcheck.dto;

import com.cardsapp.artikelcheck.model.Hilfsverb;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class VerbDto extends WordDto{
    private String partizipZwei;
    private Hilfsverb hilfsverb;
}
