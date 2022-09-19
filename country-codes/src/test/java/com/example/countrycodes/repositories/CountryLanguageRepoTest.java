package com.example.countrycodes.repositories;

import com.example.countrycodes.models.CountryLanguage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class CountryLanguageRepoTest {
    @Autowired
    private CountryLanguageRepo countryLanguageRepo;

    @Test
    void itShouldFindLanguage() {
        //given
        String  code="EGY";
        //when
        CountryLanguage language= countryLanguageRepo.findLanguage(code);
        //then
        assertEquals("Arabic",language.getLanguage());
    }

}