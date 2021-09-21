/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.DataAccess;

import com.Spring_Full_CalismalarV2.Entities.City;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author bahad
 */
//SessionFactory açarken JPA  --> javax persistance api STANDARTI DEVREYE GİRER.

@Repository
public class HibernateCityDal implements ICityDal {
    private EntityManager entityManager;
    
    @Autowired // bizim için  sessionfactory 'i enjekte edicek.
    public HibernateCityDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    @Override
    @Transactional // bizim için seession basına ve sonuna transection açar. // AOP denir. -- Aspect Oriented Programing // spring olanı kullanıyoruz.
    public List<City> getAllCitys() {
        Session session = entityManager.unwrap(Session.class); // bize bir session nesnesi var.
        List<City> cities = session.createQuery("from City",City.class).getResultList();
        return cities;  // tüm sehirleri aldık. hibernate çok kısa bir hale getirdik.
    }

    

    @Override
    public void add(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(city);
    }

    @Override
    public void delete(City city) {
        Session session = entityManager.unwrap(Session.class);
        City cityToDelete = session.get(City.class,city.getID());
        session.delete(cityToDelete);
    }

    @Override
    public void update(City city) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(city);
    }

    @Override
    public City getById(int id) {
        Session session = entityManager.unwrap(Session.class);
        City city = session.get(City.class, id);
        return city;
    }
    
    
}
