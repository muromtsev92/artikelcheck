package com.cardsapp.artikelcheck.controller;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.dto.WordDto;
import com.cardsapp.artikelcheck.mapper.NounsMapper;
import com.cardsapp.artikelcheck.model.Noun;
import com.cardsapp.artikelcheck.model.Word;
import com.cardsapp.artikelcheck.service.WordService;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/nouns")
@RequiredArgsConstructor
public class NounController {
    private final WordService<NounDto> nounService;

    @GetMapping
    public List<NounDto> getAllWords(){
        log.info("getAllWords() works");
        return nounService.findAllWords();
    }

    @PostMapping
    public NounDto addWord(@RequestBody NounDto nounDto){
        log.info("addWord() {id}", nounDto.getId());
        return nounService.addWord(nounDto);
    }
}
