/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.restApi;

import com.Spring_Full_CalismalarV2.Business.ICityService;
import com.Spring_Full_CalismalarV2.Entities.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bahad
 */
@RestController
@RequestMapping("/api") // bu kılastaki herşin başına bir api gelicek bu bir standarttır.
public class CityController {
    private ICityService cityService;
    
    @Autowired // eğer ICityService yi birden fazla implemente eden sınıf olsaydı bu şekilde hızlı injeksiyon yapamazdık.
    public CityController(ICityService cityService) {
        this.cityService = cityService;
    }
    @GetMapping("/cities")
    public List<City> get(){
        return cityService.getAllCitys();
    }
    // get maping database değişiklik yok ise kullanılır eğer databased de vir değişim olucaksa postmapping kullanılır.
    @PostMapping("/add")
    public void add(@RequestBody City city){
        cityService.add(city);
    }
    @PostMapping("/delete")
    public void delete(@RequestBody City city){
        cityService.delete(city);
    }
    @PostMapping("/update")
    public void update(@RequestBody City city){
        cityService.update(city);
    }
    @GetMapping("/cities/{id}") // parantezin içi elma olursa değişkenin adıda elma olur.
    public City getById(@PathVariable int id){
        return cityService.getById(id);
    }
}
