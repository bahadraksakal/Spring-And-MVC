/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bahad
 */
@RestController
public class ProductsController {
   
    @GetMapping("/") // direkt get okunur.
    public String get(){
        return "laptop";
    }
    @GetMapping("/products") // http://localhost:8080/products  ile okunur.
    public String get2(){
        return "laptop2";
    }
    @GetMapping("/laptop3") // http://localhost:8080/products  ile okunur.
    public String get3(){
        return "laptop3";
    }
    // yeni bir metot eklediğimiz anda save as dediğimizde  değişiklik direkt webde görünmesi için pom xml bir dependeny yazılır.
    // spring boot devtoolsa kullanılır
}
