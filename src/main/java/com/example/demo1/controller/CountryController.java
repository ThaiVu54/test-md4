package com.example.demo1.controller;

import com.example.demo1.model.City;
import com.example.demo1.model.Country;
import com.example.demo1.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/countries")
public class CountryController {
    @Autowired
    private ICountryService countryService;

    @GetMapping
    public ResponseEntity<Iterable<Country>> listCountry(){
        Iterable<Country> c = countryService.findAll();
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Country> createCity(@RequestBody Country country){
        return new ResponseEntity<>(countryService.save(country), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public ResponseEntity<Country> updateCity(@PathVariable Long id, @RequestBody Country country){
        Optional<Country> countryOptional = countryService.findById(id);
        if (!countryOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        country.setId(id);
        return new ResponseEntity<>(countryService.save(country), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Country> deleteSmartphone(@PathVariable Long id) {
        Optional<Country> countryOptional = countryService.findById(id);
        if (!countryOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        countryService.deleteById(id);
        return new ResponseEntity<>(countryOptional.get(), HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Country> findOnePhone(@PathVariable Long id) {
        Optional<Country> countryOptional = countryService.findById(id);
        if (countryOptional.isPresent()) {
            return new ResponseEntity<>(countryOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
