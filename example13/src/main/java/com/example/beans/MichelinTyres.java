package com.example.beans;

import com.example.beans.interfaces.Tyre;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MichelinTyres implements Tyre {

    public MichelinTyres() {
        System.out.println("MichelinTyres Created");
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
        return "Michelin Tyres";
    }
}
