package com.cardsapp.artikelcheck.repository;

import com.cardsapp.artikelcheck.model.Noun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NounRepository extends JpaRepository<Noun, Long> {
}
