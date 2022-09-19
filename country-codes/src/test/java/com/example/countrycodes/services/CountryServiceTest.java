package com.example.countrycodes.services;

import com.example.countrycodes.dto.CountryResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryServiceTest {


    @Autowired
    private CountryService countryService;


    @Test
    void getCountry()  {
        //given
        String code ="EGY";
        //when
        CountryResponse country= countryService.getCountry(code);
        //then
        assertEquals(country.getName(),"Egypt");
    }
}