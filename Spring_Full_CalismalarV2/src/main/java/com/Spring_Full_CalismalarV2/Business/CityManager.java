/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.Business;

import com.Spring_Full_CalismalarV2.DataAccess.ICityDal;
import com.Spring_Full_CalismalarV2.Entities.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bahad
 */
@Service // bu bir iş katmanıdır işaretliyoruz.
public class CityManager implements ICityService{

    private ICityDal cityDal;
    
    @Autowired
    public CityManager(ICityDal cityDal) {
        this.cityDal = cityDal;
    }
    
    @Override
    @Transactional
    public List<City> getAllCitys() {
        return this.cityDal.getAllCitys();
    }

    @Override
    @Transactional
    public void add(City city) {
        this.cityDal.add(city);
    }

    @Override
    @Transactional
    public void delete(City city) {
        this.cityDal.delete(city);
    }

    @Override
    @Transactional
    public void update(City city) {
        this.cityDal.update(city);
    }

    @Override
    public City getById(int id) {
       return  this.cityDal.getById(id);
    }
    
    
}
