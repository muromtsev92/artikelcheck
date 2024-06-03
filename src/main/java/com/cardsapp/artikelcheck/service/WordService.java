package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.WordDto;

import java.util.List;

public interface WordService<T extends WordDto> {
    T findWord(T wordDto);
    List<T> findAllWords();
    void deleteWord(Long id);
    List<T> getRandomWords(int howMuch);
    String addWord(T wordDto);
    void updateNoun(Long id, T nounDto);
}
