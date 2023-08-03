package com.example.main;

import com.example.beans.*;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example13 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        for (String s : persons) System.out.println(s);
        System.out.println(vehicle.getServices().getSpeaker().makeSound());
        System.out.println(vehicle.getServices().getTyre().rotate());
        System.out.println(person.getVehicle().getServices().getSpeaker().makeSound());
        System.out.println(person.getName());


    }
}
