package com.example.countrycodes.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Country {
    @Id
    private String code;

    private String name;

    private String continent;

    private int population;

    private int life_expectancy;







}
