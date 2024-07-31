package com.cardsapp.artikelcheck.controller;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.model.words.Noun;
import com.cardsapp.artikelcheck.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nouns")
@Slf4j
@RequiredArgsConstructor
public class NounRestController {
    private final WordService<NounDto> nounService;

    @GetMapping("/get-rnd")
    public List<NounDto> getNounsForGame(){
        log.info("GET JSON nouns/get-rnd");
        return nounService.getRandomWords(3);
    }
}
