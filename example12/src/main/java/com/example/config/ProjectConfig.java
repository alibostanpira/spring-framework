package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    @Bean
    Vehicle vehicleOne() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Bean
    Vehicle vehicleTwo() {
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    @Primary
    Vehicle vehicleThree() {
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }
}
