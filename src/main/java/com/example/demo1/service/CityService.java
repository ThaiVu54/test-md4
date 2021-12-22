package com.example.demo1.service;

import com.example.demo1.model.City;
import com.example.demo1.model.Country;
import com.example.demo1.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService {

    @Autowired
    private ICityRepository repository;

    @Override
    public Iterable<City> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public City save(City city) {
        return repository.save(city);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<City> findCityByCountry(Country country) {
        return repository.findCityByCountry(country);
    }

    @Override
    public Iterable<City> findCityById(Long id) {
        return repository.findCityById(id);
    }


}
