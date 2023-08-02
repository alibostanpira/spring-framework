package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicleOne() {
        var car = new Vehicle();
        car.setName("Audi");
        return car;
    }

    @Bean
    Vehicle vehicleTwo() {
        var car = new Vehicle();
        car.setName("Honda");
        return car;
    }

    @Bean
    Vehicle vehicleThree() {
        var car = new Vehicle();
        car.setName("Ferrari");
        return car;
    }
}