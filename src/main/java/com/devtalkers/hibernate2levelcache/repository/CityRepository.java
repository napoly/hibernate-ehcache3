package com.devtalkers.hibernate2levelcache.repository;

import com.devtalkers.hibernate2levelcache.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

import static org.hibernate.jpa.QueryHints.HINT_CACHEABLE;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

    @QueryHints({ @QueryHint(name = HINT_CACHEABLE, value = "true") })
    List<City> findAllById(Integer id);
}
