package ua.ithillel.car;

public class Passengers {

    private boolean sixSeats;

    public Passengers(boolean sixSeats) {
        this.sixSeats = sixSeats;
    }

    public void takeSeats() {
        System.out.println("All places are occupied");
    }

    public boolean isSixSeats() {
        return sixSeats;
    }

}
