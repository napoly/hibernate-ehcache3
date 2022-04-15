package com.devtalkers.hibernate2levelcache.service;

import com.devtalkers.hibernate2levelcache.entity.City;
import com.devtalkers.hibernate2levelcache.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public City getCityById(Integer id){
        return cityRepository.findById(id).get();
    }

    public List<City> getCitiesById(Integer id){
        return cityRepository.findAllById(id);
    }

    public City saveCity(City city){
        return cityRepository.save(city);
    }
}
