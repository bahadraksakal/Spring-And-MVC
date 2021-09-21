/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author bahad
 */
//
@Entity
@Table(name = "city")
public class City {
    @Id // zorunlu notasyon
    
    @Column(name = "id")  // eğer column isimlerini vermez isek değişken ismi ile dataBase arama yapılır.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;    
    @Column(name = "name")
    private String name;    
    @Column(name = "countrycode")  // default adlandırmadan dolayi ilk hepsini küçük yazmak en mantıklısı yoksa saçma bir hata alınabilir büyük küçük duyarlılık yok. Büyük harfler errore sebep olur. 
    private String countrycode;    
    @Column(name = "district")
    private String district;    
    @Column(name = "population")    
    private int population;    
   
    public City(){
    
    } // default const --> hibernate kullanıcak
    public City(int ID, String name, String countrycode, String district, int population) {
        super();
        this.ID = ID;
        this.name = name;
        this.countrycode = countrycode;
        this.district = district;
        this.population = population;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
    
}
