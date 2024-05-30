package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.WordDto;
import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.repository.NounRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NounServiceImpl implements WordService{

    private final NounRepository nounRepository;

    @Override
    public WordDto addWord(WordDto word) {
        return null;
    }

    @Override
    public WordDto findWord(WordDto word) {
        return null;
    }

    @Override
    public List<WordDto> findAllWords() {
        return List.of();
    }

    @Override
    public void deleteWord(Word word) {

    }

    @Override
    public List<WordDto> getRandomWords(int howMuch) {
        return List.of();
    }

}
