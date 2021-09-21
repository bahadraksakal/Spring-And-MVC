/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.Business;

import com.Spring_Full_CalismalarV2.Entities.City;
import java.util.List;

/**
 *
 * @author bahad
 */
public interface ICityService {
    public List<City> getAllCitys();
    public void add(City city);
    public void delete(City city);
    public void update(City city);
    public City getById(int id);
}
