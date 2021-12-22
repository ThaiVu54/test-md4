package com.example.demo1.repository;

import com.example.demo1.model.City;
import com.example.demo1.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends JpaRepository<City, Long> {
    public Iterable<City> findCityByCountry(Country country);
    public Iterable<City> findCityById(Long id);

}
