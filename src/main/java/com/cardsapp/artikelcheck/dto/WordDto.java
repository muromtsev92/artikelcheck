package com.cardsapp.artikelcheck.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public abstract class WordDto {
    protected Long id;
    protected String word;
    protected String russian;
    protected LocalDate additionDate;
}
