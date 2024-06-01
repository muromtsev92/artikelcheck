package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.dto.WordDto;
import com.cardsapp.artikelcheck.mapper.NounsMapper;
import com.cardsapp.artikelcheck.model.Noun;
import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.repository.NounRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NounServiceImpl implements WordService<NounDto>{

    private final NounRepository nounRepository;

    @Override
    public NounDto findWord(NounDto word) {
        return null;
    }

    @Override
    public List<NounDto> findAllWords() {
        List<Noun> list = nounRepository.findAll();
        return list.stream()
                .map(NounsMapper::toNounDto)
                .toList();
    }

    @Override
    public void deleteWord(Long id) {
        nounRepository.deleteById(id);
    }

    @Override
    public List<NounDto> getRandomWords(int howMuch) {
        return List.of();
    }

    @Override
    public String addWord(NounDto nounDto) {
        Noun noun = Noun.builder()
                .word(nounDto.getWord())
                .plural(nounDto.getPlural())
                .article(nounDto.getArticle())
                .russian(nounDto.getRussian())
                .additionDate(LocalDateTime.now())
                .build();
        try{
            nounRepository.save(noun);
        } catch (Exception e){
            return "redirect:/nouns";
            //TODO: обработать нормально, спросить
            // как сделать всплывашку при попытке создать дубль
        }
        return "redirect:/nouns";
    }

}
