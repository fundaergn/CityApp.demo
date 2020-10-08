package com.hipatiya.restdemo.model.service;

import com.hipatiya.restdemo.model.domain.City;
import com.hipatiya.restdemo.model.repository.CityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {

        this.cityRepository = cityRepository;
    }

    public List<City> getAllCity(){
        return (List<City>) cityRepository.findAll();
    }

    public City getCityById (Long id){
        return cityRepository.findById(id).get();
    }

    public void saveCity(City city){
        cityRepository.save(city);
    }

    public void update(City city, int cityId){
        cityRepository.save(city);
    }

    public void delete (Long id){
        cityRepository.deleteById(id);
    }
}
