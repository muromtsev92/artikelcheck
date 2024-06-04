package com.cardsapp.artikelcheck.repository;

import com.cardsapp.artikelcheck.model.Noun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NounRepository extends JpaRepository<Noun, Long> {

    @Query(value="SELECT * FROM nouns ORDER BY RANDOM() LIMIT :number", nativeQuery = true)
    public List<Noun> findRandomNouns(@Param("number") int number);
}
