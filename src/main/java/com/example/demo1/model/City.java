package com.example.demo1.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne(targetEntity = Country.class)
    private Country country;
    private Double area;
    private Long population;
    private Long gpa;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }

    public Long getGpa() {
        return gpa;
    }

    public void setGpa(Long gpa) {
        this.gpa = gpa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City() {
    }

    public City(String name, Country country, Double area, Long population, Long gpa, String description) {
        this.name = name;
        this.country = country;
        this.area = area;
        this.population = population;
        this.gpa = gpa;
        this.description = description;
    }

    public City(Long id, String name, Country country, Double area, Long population, Long gpa, String description) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.area = area;
        this.population = population;
        this.gpa = gpa;
        this.description = description;
    }
}
