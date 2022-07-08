package ua.ithillel.car;

public class CarDoors {

    private boolean door;

    public CarDoors(Boolean door) {
        this.door = door;

    }

    public void openDoor() {
        System.out.println("The doors are open.");
    }

    public boolean getDoor() {
        return door;
    }
}

