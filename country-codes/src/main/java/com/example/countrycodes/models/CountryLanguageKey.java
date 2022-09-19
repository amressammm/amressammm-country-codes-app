package com.example.countrycodes.models;

import lombok.Data;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class CountryLanguageKey implements Serializable {

    private  String  code;
    private  String language;
}
