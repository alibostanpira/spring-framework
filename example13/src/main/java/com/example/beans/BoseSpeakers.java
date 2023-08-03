package com.example.beans;

import com.example.beans.interfaces.Speaker;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speaker {

    public BoseSpeakers() {
        System.out.println("BoseSpeakers Created");
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
        return "Bose Speakers";
    }
}
