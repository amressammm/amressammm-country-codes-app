package com.example.countrycodes.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(CountryLanguageKey.class)
public class CountryLanguage {

    @Id
    @Column(name="country_code")
    private  String  code;

    @Id
    private  String language;

    boolean is_official;

}
