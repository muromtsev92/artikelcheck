package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.dto.WordDto;

import java.util.List;

public interface WordService {
    WordDto addWord(WordDto word);
    WordDto findWord(WordDto word);
    List<WordDto> findAllWords();
    void deleteWord(Word word);
    List<WordDto> getRandomWords(int howMuch);
}
