package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.dto.WordDto;

import java.util.List;

public interface WordService<T extends WordDto> {
    //T addWord(T wordDto);

    T findWord(T wordDto);
    List<T> findAllWords();
    void deleteWord(T wordDto);
    List<T> getRandomWords(int howMuch);
    String addWord(T wordDto);
}
