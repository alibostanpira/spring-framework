package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example07 {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle vw = new Vehicle();
        vw.setName("Volkswagen");
        Supplier<Vehicle> vwSupplier = () -> vw;


        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("randomNumber = " + randomNumber);

        if ((randomNumber % 2) == 0) {
            context.registerBean("volkswagen", Vehicle.class, vwSupplier);
        } else {
            context.registerBean("audi", Vehicle.class, () -> {
                Vehicle audi = new Vehicle();
                audi.setName("Audi");
                return audi;
            });
        }

        Vehicle volksVehicle = null;
        Vehicle audiVehicle = null;

        try {
            volksVehicle = context.getBean("volkswagen", Vehicle.class);
        } catch (NoSuchBeanDefinitionException exception) {
            System.out.println("Error while creating Volkswagen vehicle");
        }

        try {
            audiVehicle = context.getBean("audi", Vehicle.class);
        } catch (NoSuchBeanDefinitionException exception) {
            System.out.println("Error while creating Audi vehicle");
        }

        if (volksVehicle != null) {
            System.out.println("Volkswagen vehicle is: " + volksVehicle.getName());
        } else {
            assert audiVehicle != null;
            System.out.println("Volkswagen vehicle is: " + audiVehicle.getName());
        }
    }
}