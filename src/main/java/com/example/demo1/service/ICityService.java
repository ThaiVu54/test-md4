package com.example.demo1.service;

import com.example.demo1.model.City;
import com.example.demo1.model.Country;
import com.example.demo1.repository.ICityRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICityService extends IGeneralService<City> {
    @Override
    Iterable<City> findAll();

    @Override
    Optional<City> findById(Long id);

    @Override
    City save(City city);

    @Override
    void deleteById(Long id);

    public Iterable<City> findCityByCountry(Country country);
    public Iterable<City> findCityById(Long id);
}
