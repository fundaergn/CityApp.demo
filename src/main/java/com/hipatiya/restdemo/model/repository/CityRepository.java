package com.hipatiya.restdemo.model.repository;

import com.hipatiya.restdemo.model.domain.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
    City findAllByCode(int code);
    List<City> findAll();
}
