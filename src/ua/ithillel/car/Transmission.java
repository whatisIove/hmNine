package ua.ithillel.car;

public class Transmission {

    private boolean fiveSpeed;

    public Transmission(boolean fiveSpeed) {
        this.fiveSpeed = fiveSpeed;
    }

    public void changeGear() {
        System.out.println("Car is forward gear.");
    }

    public boolean isFiveSpeed() {
        return fiveSpeed;
    }

}
