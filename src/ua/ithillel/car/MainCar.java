package ua.ithillel.car;

public class MainCar {

    public static void main(String[] args) {

        Wheel wheel1 = new Wheel("Cordiant", "215/35R17");
        Wheel wheel2 = new Wheel("Cordiant", "215/35R17");
        Wheel wheel3 = new Wheel("Cordiant", "215/35R17");
        Wheel wheel4 = new Wheel("Cordiant", "215/35R17");

        Engine theEngine = new Engine(true);

        CarDoors door = new CarDoors(true);

        Transmission theTransmission = new Transmission(true);

        Passengers passengers = new Passengers(true);

        Car theCar = new Car("Lanos", wheel1, wheel2, wheel3, wheel4, theTransmission, theEngine, door,
                passengers);

        theCar.openDoor();
        theCar.takeSeats();
        theCar.startEngine();
        theCar.moveWheels();
        theCar.changeGear();
    }
}
