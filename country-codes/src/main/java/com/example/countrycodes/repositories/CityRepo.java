package com.example.countrycodes.repositories;

import com.example.countrycodes.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepo extends JpaRepository<City,Long> {
}
