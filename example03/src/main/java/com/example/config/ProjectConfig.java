package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name = "Audi")
    Vehicle vehicleOne() {
        var car = new Vehicle();
        car.setName("Audi");
        return car;
    }

    @Bean(value = "Honda")
    Vehicle vehicleTwo() {
        var car = new Vehicle();
        car.setName("Honda");
        return car;
    }

    @Bean("Ferrari")
    Vehicle vehicleThree() {
        var car = new Vehicle();
        car.setName("Ferrari");
        return car;
    }
}