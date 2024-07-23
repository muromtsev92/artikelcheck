package com.cardsapp.artikelcheck.controller;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.mapper.NounsMapper;
import com.cardsapp.artikelcheck.model.words.Noun;
import com.cardsapp.artikelcheck.service.WordService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String user = authentication.getName();
        model.addAttribute("heading", "list of all nouns in the db");
        model.addAttribute("nounDtoList", nounService.findAllWords());
        model.addAttribute("user", user);
        return "nouns";
    }

    @GetMapping("/game")
    public String getRandomNouns(@RequestParam(name="number",defaultValue = "5") int number, Model model){
        log.info("getRandomNouns() works");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String user = authentication.getName();
        model.addAttribute("heading", "GAME");
        model.addAttribute("nounDtoList", nounService.getRandomWords(number));
        model.addAttribute("user", user);
        return "nouns";
    }

    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("nounDto", new NounDto());
        return "add-noun";
    }

    @PostMapping("/add")
    public String addWord(@ModelAttribute NounDto nounDto){
        log.info("addNoun() {id}", nounDto.getId());
        return nounService.addWord(nounDto);
    }

    @PostMapping("/update/{id}")
    @ResponseBody
    public void updateNoun(@PathVariable("id") Long id, @RequestBody NounDto nounDto) {
        log.info("update");
        nounService.updateNoun(id, nounDto);
    }

    @GetMapping("/delete/{id}")
    public String deleteNoun(@PathVariable Long id,
                             RedirectAttributes redirectAttributes){
        log.info("deleteNoun() {id}", id);
        nounService.deleteWord(id);
        redirectAttributes
                .addFlashAttribute("message", "запись " + id + " id удалена");
        return "redirect:/nouns";
    }

}
