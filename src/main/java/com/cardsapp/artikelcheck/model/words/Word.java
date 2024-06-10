package com.cardsapp.artikelcheck.model.words;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@MappedSuperclass
@SuperBuilder
@NoArgsConstructor
@Getter
@Setter
public abstract class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    protected String word;
    protected String russian;
    @Column(name="addition_date")
    protected LocalDateTime additionDate;
}
