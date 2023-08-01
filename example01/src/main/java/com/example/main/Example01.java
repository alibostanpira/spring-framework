package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle from non-spring framework is: " + vehicle.getName());

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle springVehicle = context.getBean(Vehicle.class);
        System.out.println("Vehicle from Spring Framework is: " + springVehicle.getName());

        String hello = context.getBean(String.class);
        System.out.println("String value from Spring Framework is: " + hello);

        Integer number = context.getBean(Integer.class);
        System.out.println("Integer value from Spring Framework is: " + number);
    }
}