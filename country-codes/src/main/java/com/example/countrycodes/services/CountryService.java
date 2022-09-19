package com.example.countrycodes.services;

import com.example.countrycodes.dto.CountryResponse;
import com.example.countrycodes.models.Country;
import com.example.countrycodes.models.CountryLanguage;
import com.example.countrycodes.repositories.CountryLanguageRepo;
import com.example.countrycodes.repositories.CountryRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CountryService {
    @Autowired
    private final CountryRepo countryRepo;
    @Autowired
    private final CountryLanguageRepo countryLanguageRepo;

    public CountryResponse getCountry(String code) {
        Country country= countryRepo.findById(code).orElse(null);
        if (country==null)
            return null;
        CountryLanguage countryLanguages= countryLanguageRepo.findLanguage(code);
        return (new CountryResponse(country.getName(),country.getContinent(),country.getPopulation(),country.getLife_expectancy(),countryLanguages.getLanguage()));

    }
}


