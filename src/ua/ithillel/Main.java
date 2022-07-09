package com.company;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setDoor(4);
        car.setEngine("eTECI4");
        car.setModel("Sens");
        car.setTransmission(5);
        car.setPassengers(6);
        car.setWheel1("Front left");
        car.setWheel2("Front right");
        car.setWheel3("Rear left");
        car.setWheel4("Rear right");

        System.out.println(car.getModel());

    }
}
