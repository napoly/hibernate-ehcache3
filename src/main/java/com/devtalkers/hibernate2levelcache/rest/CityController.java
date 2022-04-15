package com.devtalkers.hibernate2levelcache.rest;

import com.devtalkers.hibernate2levelcache.entity.City;
import com.devtalkers.hibernate2levelcache.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(cityService.getCityById(id), HttpStatus.OK);
    }

    @GetMapping("/allcities/{id}")
    public ResponseEntity<List<City>> getCitiesById(@PathVariable(name = "id") Integer id){
        return new ResponseEntity<>(cityService.getCitiesById(id), HttpStatus.OK);
    }

    @PostMapping("/cities")
    public ResponseEntity<City> saveCity(@RequestBody City city){
        return new ResponseEntity<>(cityService.saveCity(city), HttpStatus.CREATED);
    }
}
