package com.example.beans;

import com.example.beans.interfaces.Speaker;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class SonySpeakers implements Speaker {

    public SonySpeakers() {
        System.out.println("SonySpeakers Created");

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String makeSound() {
        return "Sony Speakers";
    }
}
