package com.example.countrycodes.controller;


import static org.hamcrest.CoreMatchers.notNullValue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.ResultActions;



class CountryControllerTest extends AbstractControllerIT {


    @Test
    void shouldGetCountry() throws Exception {
        //given
        final String url = "/EGY";

        //when
        ResultActions result = this.mvc.perform(get(url));

        //then
        result.andExpect(status().isOk())
                .andExpect( jsonPath("$.name").value("Egypt"))
                .andExpect( jsonPath("$.continent").value("Africa"))
                .andExpect( jsonPath("$.country_language").value("Arabic"))
                .andExpect(jsonPath("$.population", notNullValue()))
                .andExpect(jsonPath("$.life_expectancy", notNullValue()));


    }

    @Test
    void shouldReturnBadRequest() throws Exception {
        //given
        final String url = "/test";

        //when
        ResultActions result = this.mvc.perform(get(url));

        //then
        result.andExpect(status().isBadRequest());
    }}