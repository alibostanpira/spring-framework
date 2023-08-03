package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example06 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println(vehicle.getName());
        vehicle.printHello();
        vehicle.setName("BMW");
        System.out.println(vehicle.getName());
        context.close();
    }
}