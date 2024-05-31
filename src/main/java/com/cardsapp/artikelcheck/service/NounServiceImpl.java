package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.dto.WordDto;
import com.cardsapp.artikelcheck.mapper.NounsMapper;
import com.cardsapp.artikelcheck.model.Noun;
import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.repository.NounRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NounServiceImpl implements WordService<Noun, NounDto>{

    private final NounRepository nounRepository;

    @Override
    public Noun addWord(NounDto word) {

        Noun noun = NounsMapper.toNoun(word);

        return nounRepository.save(noun);
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
