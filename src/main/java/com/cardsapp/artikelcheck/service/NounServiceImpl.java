package com.cardsapp.artikelcheck.service;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.exceptions.NotFoundException;
import com.cardsapp.artikelcheck.mapper.NounsMapper;
import com.cardsapp.artikelcheck.model.words.Noun;
import com.cardsapp.artikelcheck.repository.NounRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NounServiceImpl implements WordService<NounDto>{

    private final NounRepository nounRepository;

    @Override
    public NounDto findWord(NounDto nounDto) {
        Optional<Noun> noun = nounRepository.findById(nounDto.getId());
        return noun.map(NounsMapper::toNounDto)
                .orElseThrow(() -> new NotFoundException("Noun wasn't found"));
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

    public void updateNoun(Long id, NounDto nounDto) {
        Noun noun = nounRepository.findById(id).orElseThrow(() -> new NotFoundException("Noun not found"));
        noun.setArticle(nounDto.getArticle());
        noun.setWord(nounDto.getWord());
        noun.setPlural(nounDto.getPlural());
        noun.setRussian(nounDto.getRussian());
        NounsMapper.toNounDto(nounRepository.save(noun));
    }

    @Override
    public List<NounDto> getRandomWords(int howMuch) {
        return nounRepository.findRandomNouns(howMuch)
                .stream().map(NounsMapper::toNounDto).toList();
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
