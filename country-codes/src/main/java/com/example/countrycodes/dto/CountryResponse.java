package com.example.countrycodes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class CountryResponse {

   private  String name;
   private String continent;
   private int population;
   private int life_expectancy;
   private String country_language;

}
