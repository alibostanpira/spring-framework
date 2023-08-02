package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example02 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vehicleOne = context.getBean("vehicleOne", Vehicle.class);
        Vehicle vehicleTwo = context.getBean("vehicleTwo", Vehicle.class);
        Vehicle vehicleThree = context.getBean("vehicleThree", Vehicle.class);

        System.out.println(vehicleOne.getName());
        System.out.println(vehicleTwo.getName());
        System.out.println(vehicleThree.getName());
    }
}