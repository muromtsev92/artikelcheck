package com.cardsapp.artikelcheck.controller;

import com.cardsapp.artikelcheck.service.WordService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NounController {
    private final WordService nounService;
}
