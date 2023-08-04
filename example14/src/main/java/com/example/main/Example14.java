package com.example.main;

import com.example.config.ProjectConfig;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example14 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServicesOne = context.getBean(VehicleServices.class);
        VehicleServices vehicleServicesTwo = context.getBean("vehicleServices", VehicleServices.class);
        System.out.println("Hashcode of the VehicleServicesOne:" + vehicleServicesOne.hashCode());
        System.out.println("Hashcode of the VehicleServicesTwo:" + vehicleServicesTwo.hashCode());
        if (vehicleServicesOne == vehicleServicesTwo) {
            System.out.println("VehicleServices bean is a singleton scoped bean");
        }
    }
}