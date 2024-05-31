package com.cardsapp.artikelcheck.mapper;

import com.cardsapp.artikelcheck.dto.NounDto;
import com.cardsapp.artikelcheck.model.Noun;

public class NounsMapper {
    public static Noun toNoun(NounDto nounDto){
        return Noun.builder()
                .id(nounDto.getId())
                .article(nounDto.getArticle())
                .word(nounDto.getWord())
                .russian(nounDto.getRussian())
                .plural(nounDto.getPlural())
                .additionDate(nounDto.getAdditionDate()).build();
    }

    public static NounDto toNounDto(Noun noun){
        return NounDto.builder()
                .id(noun.getId())
                .article(noun.getArticle())
                .word(noun.getPlural())
                .russian(noun.getRussian())
                .plural(noun.getPlural())
                .additionDate(noun.getAdditionDate()).build();
    }
}
