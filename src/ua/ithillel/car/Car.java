package ua.ithillel.car;

import java.net.PasswordAuthentication;

public class Car {

    private String model;
    private Wheel wheel1;
    private Wheel wheel2;
    private Wheel wheel3;
    private Wheel wheel4;
    private Transmission transmission;
    private Engine engine;
    private CarDoors door;
    private Passengers passengers;

    public Car(String model, Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Transmission transmission,
               Engine engine, CarDoors door, Passengers passengers) {
        this.model = model;
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.transmission = transmission;
        this.engine = engine;
        this.door = door;
        this.passengers = passengers;
    }

    public void openDoor() {
        door.openDoor();
    }

    public void takeSeats() {
        passengers.takeSeats();
    }

    public void startEngine() {
        engine.start();
    }

    public void moveWheels() {
        wheel1.move();
        wheel2.move();
        wheel3.move();
        wheel4.move();
    }

    public void changeGear() {
        transmission.changeGear();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public void setWheel1(Wheel wheel1) {
        this.wheel1 = wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public void setWheel2(Wheel wheel2) {
        this.wheel2 = wheel2;
    }

    public Wheel getWheel3() {
        return wheel3;
    }

    public void setWheel3(Wheel wheel3) {
        this.wheel3 = wheel3;
    }

    public Wheel getWheel4() {
        return wheel4;
    }

    public void setWheel4(Wheel wheel4) {
        this.wheel4 = wheel4;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public CarDoors getDoor() {
        return door;
    }

    public void setDoor(CarDoors door) {
        this.door = door;
    }

    public Passengers getPassengers() {
        return passengers;
    }

    public void setPassengers(Passengers passengers) {
        this.passengers = passengers;
    }
}
