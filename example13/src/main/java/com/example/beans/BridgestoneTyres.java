package com.example.beans;

import com.example.beans.interfaces.Tyre;
import org.springframework.stereotype.Component;

@Component
public class BridgestoneTyres implements Tyre {

    public BridgestoneTyres() {
        System.out.println("BridgestoneTyres Created");

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String rotate() {
        return "Bridgestone Tyres";
    }
}
