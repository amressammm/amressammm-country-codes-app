package com.example.countrycodes.controller;

import com.example.countrycodes.dto.CountryResponse;

import com.example.countrycodes.services.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor

public class CountryController {
    @Autowired
    private final CountryService countryService;


    @GetMapping("/{code}")
    public ResponseEntity getCountry(@PathVariable String code){
        CountryResponse response= countryService.getCountry(code);
        if (response==null)
            return ResponseEntity.badRequest().body(response);
         return (ResponseEntity.ok().body(response));
    }
}
