/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Spring_Full_CalismalarV2.SpringConfig;

/**
 *
 * @author bahad
 */
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *
 * @author bahad
 */
//xml ile bağımızı tamamen koparacak bir class hazırlıyoruzç
@Configuration
@ComponentScan("com.Spring_Full_CalismalarV2")
public class IocConfig {
}

