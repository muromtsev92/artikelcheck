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
public class NounServiceImpl implements WordService<NounDto>{

    private final NounRepository nounRepository;

    @Override
    public NounDto addWord(NounDto nounDto) {

        Noun noun = NounsMapper.toNoun(nounDto);

        return NounsMapper.toNounDto(nounRepository.save(noun));
    }

    @Override
    public NounDto findWord(NounDto word) {
        return null;
    }

    @Override
    public List<NounDto> findAllWords() {
        List<Noun> list = nounRepository.findAll();
        List<NounDto> dtoList = list.stream()
                .map(NounsMapper::toNounDto)
                .toList();
        return dtoList;
    }

    @Override
    public void deleteWord(NounDto word) {

    }

    @Override
    public List<NounDto> getRandomWords(int howMuch) {
        return List.of();
    }

}
