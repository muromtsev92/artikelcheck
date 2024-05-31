package com.cardsapp.artikelcheck.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public abstract class WordDto {
    protected Long id;
    protected String word;
    protected String russian;
    protected LocalDate additionDate;
}
