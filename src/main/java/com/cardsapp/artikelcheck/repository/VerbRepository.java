package com.cardsapp.artikelcheck.repository;

import com.cardsapp.artikelcheck.model.words.Verb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbRepository extends JpaRepository<Verb, Long> {
}
