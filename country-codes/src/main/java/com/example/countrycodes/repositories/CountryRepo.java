package com.example.countrycodes.repositories;


import com.example.countrycodes.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepo extends JpaRepository<Country,String> {
}
