package com.example.countrycodes.repositories;

import com.example.countrycodes.models.CountryLanguage;
import com.example.countrycodes.models.CountryLanguageKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;




public interface CountryLanguageRepo extends JpaRepository<CountryLanguage, CountryLanguageKey> {

    @Query(value = "SELECT  * FROM country_language u WHERE u.country_code=:code AND u.is_official = TRUE LIMIT 1",
            nativeQuery = true)


    CountryLanguage findLanguage(String code);
}
