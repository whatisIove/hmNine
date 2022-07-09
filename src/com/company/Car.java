package com.company;

import ua.ithillel.car.*;

public class Car {

    private String model;
    private String wheel1;
    private String wheel2;
    private String wheel3;
    private String wheel4;
    private int transmission;
    private String engine;
    private int door;

    private int passengers;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWheel1() {
        return wheel1;
    }

    public void setWheel1(String wheel1) {
        this.wheel1 = wheel1;
    }

    public String getWheel2() {
        return wheel2;
    }

    public void setWheel2(String wheel2) {
        this.wheel2 = wheel2;
    }

    public String getWheel3() {
        return wheel3;
    }

    public void setWheel3(String wheel3) {
        this.wheel3 = wheel3;
    }

    public String getWheel4() {
        return wheel4;
    }

    public void setWheel4(String wheel4) {
        this.wheel4 = wheel4;
    }

    public int getTransmission() {
        return transmission;
    }

    public void setTransmission(int transmission) {
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}