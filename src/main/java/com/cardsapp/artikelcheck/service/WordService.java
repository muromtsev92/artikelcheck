package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.model.Noun;
import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.dto.WordDto;

import java.util.List;

public interface WordService<T extends Word, D extends WordDto> {
    T addWord(D wordDto);

    Noun addWord(NounDto word);

    WordDto findWord(WordDto word);
    List<WordDto> findAllWords();
    void deleteWord(Word word);
    List<WordDto> getRandomWords(int howMuch);
}
