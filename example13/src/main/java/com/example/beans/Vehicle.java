package com.example.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle Created");
    }

    private String name;

    private VehicleServices services;



    public VehicleServices getServices() {
        return services;
    }

    @Autowired
    public void setServices(VehicleServices services) {
        this.services = services;
    }

    @PostConstruct
    public void initialize() {
        this.name = "Audi";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", services=" + services +
                '}';
    }
}
