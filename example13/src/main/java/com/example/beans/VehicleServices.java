package com.example.beans;

import com.example.beans.interfaces.Speaker;
import com.example.beans.interfaces.Tyre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {
    private Speaker speaker;
    private Tyre tyre;

    @Autowired
    public VehicleServices(Speaker speaker, Tyre tyre) {
        System.out.println("VehicleServices Created");
        if (speaker instanceof SonySpeakers sony) {
            this.speaker = sony;
        } else if (speaker instanceof BoseSpeakers bose){
            this.speaker = bose;
        } else {
            this.speaker = null;
        }

        if (tyre instanceof BridgestoneTyres bridgestone) {
            this.tyre = bridgestone;
        } else if (tyre instanceof MichelinTyres michelin){
            this.tyre = tyre;
        } else {
            this.tyre = null;
        }
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return "VehicleServices{" +
                "speaker=" + speaker +
                ", tyre=" + tyre +
                '}';
    }
}
