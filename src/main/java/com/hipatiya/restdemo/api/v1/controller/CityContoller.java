package com.hipatiya.restdemo.api.v1.controller;

import com.hipatiya.restdemo.model.domain.City;
import com.hipatiya.restdemo.model.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/cities")
public class CityContoller {

    //@Autowired
    private final CityService cityService;

    public CityContoller(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/")
    public List<City> getAllCity() {
        return cityService.getAllCity();
    }

    @GetMapping("/{id}")
    public List<City> getCityById(@PathVariable(value = "id") Long cityId) {
        return cityService.getAllCity();
    }

    @PostMapping("/")
    public Long create(@RequestBody City city) {
        cityService.saveCity(city);
        return city.getId();

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(value = "id") Long cityId, City cityDetails) {
        cityService.delete(cityId);
    }

    @PutMapping("/")
    private City update(@RequestBody City city) {
        cityService.saveCity(city);
        return city;
    }
}
