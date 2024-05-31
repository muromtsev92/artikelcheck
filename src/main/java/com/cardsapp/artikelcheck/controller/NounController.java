package com.cardsapp.artikelcheck.controller;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@Controller
@RequestMapping("/nouns")
@RequiredArgsConstructor
public class NounController {
    private final WordService<NounDto> nounService;

    @GetMapping
    public String getAllNouns(Model model){
        log.info("getAllWords() works");
        model.addAttribute("nouns", nounService.findAllWords());
        return "nouns";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("nounDto", new NounDto());
        return "add-noun";
    }

//    @PostMapping
//    public NounDto addWord(@RequestBody NounDto nounDto){
//        log.info("addWord() {id}", nounDto.getId());
//        return nounService.addWord(nounDto);
//    }

    @PostMapping("/add")
    public String addWord(@ModelAttribute NounDto nounDto){
        log.info("addNoun() {id}", nounDto.getId());
        return nounService.addWord(nounDto);
    }

}
