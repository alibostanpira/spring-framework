package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    //@Autowired
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicleTwo") Vehicle vehicle) {
        this.vehicle = vehicle;
        this.name = "Lucy";
        System.out.println("Person bean created by Spring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}
