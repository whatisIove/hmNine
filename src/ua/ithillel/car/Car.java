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

}